package org.lynxz.server.network

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.BiFunction
import io.reactivex.rxkotlin.toObservable
import io.reactivex.schedulers.Schedulers
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.lynxz.server.bean.AccessTokenBean
import org.lynxz.server.bean.DepartmentMemberDetailListBean
import org.lynxz.server.bean.MessageResponseBean
import org.lynxz.server.bean.MessageTextBean
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.config.KeyNames
import org.lynxz.server.config.MessageType
import org.lynxz.server.msec2date
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by lynxz on 25/08/2017.
 * 网络访问具体处理类
 */
object HttpManager {

    // 给请求添加统一的query参数:access_token
    private val queryInterceptor = Interceptor { chain ->
        val original = chain.request()
        val url = original.url().newBuilder()
                .addQueryParameter(KeyNames.QUERY_KEY_ACCESS_TOKEN, ConstantsPara.accessToken)
                .build()

        val requestBuilder = original.newBuilder().url(url)
        chain.proceed(requestBuilder.build())
    }

    // 给请求添加统一的header参数:Content-Type
    private val headerInterceptor = Interceptor { chain ->
        val request = chain.request().newBuilder()
                .addHeader(KeyNames.HEADER_KEY_CONTENT_TYPE, "application/json")
                .build()
        chain.proceed(request)
    }

    // 显示请求日志,可选
    private val logInterceptor = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }

    private val okHttpClient: OkHttpClient = OkHttpClient()
            .newBuilder()
            .addInterceptor(headerInterceptor)
            .addInterceptor(queryInterceptor)
            .addInterceptor(logInterceptor)
            .build()

    private val ddRetrofit: Retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(ConstantsPara.DINGDING_SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    private val apiService: ApiService = ddRetrofit.create(ApiService::class.java)

    private val compositeDisposable = CompositeDisposable()

    /**
     * 刷新钉钉accessToken
     * */
    fun refreshAccessToken() {
        apiService.getAccessToken(ConstantsPara.dd_corp_id, ConstantsPara.dd_corp_secret)
                .retry(1)
                .subscribe(object : Observer<AccessTokenBean> {
                    override fun onError(e: Throwable) {
                        e.printStackTrace()
                    }

                    override fun onSubscribe(d: Disposable) {
                        addDisposable(d)
                    }

                    override fun onComplete() {
                    }

                    override fun onNext(t: AccessTokenBean) {
                        println("refreshAccessToken $t")
                        ConstantsPara.accessToken = t.access_token ?: ""
                        // todo 若有上一次未发送成功的数据,则尝试发送
                        getDepartmentInfo()
                    }
                })
    }

    /**
     * 获取部门列表信息以及各部门成员信息
     */
    fun getDepartmentInfo() {
        apiService.getDepartmentList()
                .flatMap { list ->
                    ConstantsPara.departmentList = list
                    list.department.forEach { ConstantsPara.departmentNameMap[it.id] = it.name }
                    Observable.fromIterable(list.department)
                }
                .map { departmentBean -> departmentBean.id }
                .flatMap { departmentId ->
                    Observable.zip(Observable.create { it.onNext(departmentId) },
                            apiService.getDepartmentMemberDetailList(departmentId),
                            BiFunction<Int, DepartmentMemberDetailListBean, DepartmentMemberDetailListBean> { t1, t2 ->
                                t2.departmentId = t1
                                t2
                            })
                }
                .retry(1)
                .subscribe(object : Observer<DepartmentMemberDetailListBean> {
                    override fun onNext(t: DepartmentMemberDetailListBean) {
                        ConstantsPara.departmentMemberDetailMap[t.departmentId] = t.userlist
                    }

                    override fun onSubscribe(d: Disposable) {
                        addDisposable(d)
                    }

                    override fun onError(e: Throwable) {
                        e.printStackTrace()
                    }

                    override fun onComplete() {
                        println("getDepartmentInfo onComplete:\n${ConstantsPara.departmentMemberDetailMap.keys.forEach { println("departId: $it") }}")
                        // sendTextMessage(ConstantsPara.defaultNoticeUserName, null, "test from server")
                    }
                })
    }

    /**
     * 根据gitlab返回的项目组别和名称,发送消息给对应的部门群成员
     * 钉钉部门名称与项目名称一致,切部门的上级部门与项目所在组的namespace一致,则可确定要通知的部门
     *
     * 如钉钉通讯录中有某群:  father/child , 部门名为 child, 上级部门为 father
     * 而gitlab中有某项目地址为: https://gitlab.lynxz.org/father/child
     * 则可完全确定所需通知的部门child
     * 备注: 本项目只支持两级
     * */
    fun sendTestMessageToDepartment(msg: String? = "", projectName: String? = "", projectNameSpace: String = "") {
        if (msg.isNullOrBlank() or projectName.isNullOrBlank()) {
            return
        }

        // 由于钉钉部门名称不支持 "-" ,因此自动替换为 "_",创建通讯录时请注意
        ConstantsPara.departmentList?.department?.toObservable()
                ?.filter { (projectName!!.replace("-", "_").equals(it.name, true)) and (projectNameSpace.replace("-", "_").equals(ConstantsPara.departmentNameMap[it.parentid], true)) }
                ?.flatMap { bean -> Observable.just(ConstantsPara.departmentMemberDetailMap[bean.id]) }
                ?.flatMap { Observable.fromIterable(it) }
                ?.doOnNext { sendTextMessage(it.name, null, msg!!) }
                ?.doOnSubscribe { println("要群发给 $projectNameSpace/$projectName 的消息是:\n${toString()}") }
                ?.subscribe()
    }

    /**
     * 向指定用户发送文本内容[message]
     * 若目标用户为空,则发送给指定部门[departmentId]所有人,比如gitlab merge请求通过时,通知所有人
     * 优先通过手机号匹配用户, [userName] 只要匹配用户名或者用户备注信息即算符合要求
     *
     * @param userMobile 用户手机号
     * @param userName 用户姓名
     *
     * */
    fun sendTextMessage(userName: String? = null, userMobile: String? = null,
                        message: String = "", departmentId: Int = 1) {
        ConstantsPara.departmentMemberDetailMap[departmentId]?.apply {
            stream().filter { userMobile.isNullOrBlank() or userMobile.equals(it.mobile, true) }
                    .filter { userName.isNullOrBlank() or userName.equals(it.name, true) or userName.equals(it.remark, true) }
                    .forEach {
                        val textBean = MessageTextBean().apply {
                            touser = it.userid
                            agentid = ConstantsPara.dd_agent_id
                            msgtype = MessageType.TEXT
                            text = MessageTextBean.TextBean().apply {
                                // 自动添加时间信息,避免被钉钉服务器拦截
                                content = if (message.contains("服务器时间")) message else "$message\n服务器时间: ${msec2date()}"
                            }
                        }
                        apiService.sendTextMessage(textBean)
                                .subscribeOn(Schedulers.io())
                                .subscribe(object : Observer<MessageResponseBean> {
                                    override fun onComplete() {
                                    }

                                    override fun onSubscribe(d: Disposable) {
                                        addDisposable(d)
                                    }

                                    override fun onNext(t: MessageResponseBean) {
                                        println("${msec2date()} sendTextMessage $t")
                                    }

                                    override fun onError(e: Throwable) {
                                        e.printStackTrace()
                                    }
                                })
                    }
        }
    }

    fun addDisposable(d: Disposable) {
        compositeDisposable.add(d)
    }
}