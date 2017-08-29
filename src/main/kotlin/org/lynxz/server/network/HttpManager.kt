package org.lynxz.server.network

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.BiFunction
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.lynxz.server.bean.AccessTokenBean
import org.lynxz.server.bean.DepartmentMemberListBean
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
    val queryInterceptor = Interceptor { chain ->
        val original = chain.request()
        val url = original.url().newBuilder()
                .addQueryParameter(KeyNames.QUERY_KEY_ACCESS_TOKEN, ConstantsPara.accessToken)
                .build()

        val requestBuilder = original.newBuilder().url(url)
        chain.proceed(requestBuilder.build())
    }

    // 给请求添加统一的header参数:Content-Type
    val headerInterceptor = Interceptor { chain ->
        val request = chain.request().newBuilder()
                .addHeader(KeyNames.HEADER_KEY_CONTENT_TYPE, "application/json")
                .build()
        chain.proceed(request)
    }

    // 显示请求日志,可选
    val logInterceptor = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }

    val okHttpClient: OkHttpClient = OkHttpClient()
            .newBuilder()
            .addInterceptor(headerInterceptor)
            .addInterceptor(queryInterceptor)
            .addInterceptor(logInterceptor)
            .build()

    val ddRetrofit: Retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(ConstantsPara.DINGDING_SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    val apiService: ApiService = ddRetrofit.create(ApiService::class.java)

    val compositeDisposable = CompositeDisposable()

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
                    Observable.fromIterable(list.department)
                }
                .map { departmentBean -> departmentBean.id }
                .flatMap { departmentId ->
                    Observable.zip(Observable.create({ it.onNext(departmentId) }),
                            apiService.getDepartmentMemberList(departmentId),
                            BiFunction<Int, DepartmentMemberListBean, DepartmentMemberListBean> { t1, t2 ->
                                t2.departmentId = t1
                                t2
                            })
                }
                .retry(1)
                .subscribe(object : Observer<DepartmentMemberListBean> {
                    override fun onNext(t: DepartmentMemberListBean) {
                        ConstantsPara.departmentMemberMap.put(t.departmentId, t.userlist)
                    }

                    override fun onSubscribe(d: Disposable) {
                        addDisposable(d)
                    }

                    override fun onError(e: Throwable) {
                        e.printStackTrace()
                    }

                    override fun onComplete() {
                        println("getDepartmentInfo onComplete:\n${ConstantsPara.departmentMemberMap.keys.forEach { println("departId: $it") }}")
                        sendTextMessage(ConstantsPara.defaultNoticeUserName, "test from server")
                    }
                })
    }

    /**
     * 向指定用户[targetUserName]发送文本内容[message]
     * 若目标用户名[targetUserName]为空,则发送给指定部门[departmentId]所有人,比如gitlab merge请求通过时,通知所有人
     * */
    fun sendTextMessage(targetUserName: String? = null, message: String = "", departmentId: Int = 1) {
        ConstantsPara.departmentMemberMap[departmentId]?.apply {
            stream().filter { targetUserName.isNullOrBlank() or it.name.equals(targetUserName, true) }
                    .forEach {
                        val textBean = MessageTextBean().apply {
                            touser = it.userid
                            agentid = ConstantsPara.dd_agent_id
                            msgtype = MessageType.TEXT
                            text = MessageTextBean.TextBean().apply {
                                content = message
                            }
                        }
                        apiService.sendTextMessage(textBean)
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