package org.lynxz.server.network

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.lynxz.server.bean.AccessTokenBean
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.config.KeyNames
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


    /**
     * 刷新钉钉accessToken
     * */
    fun refreshAccessToken() {
        apiService.getAccessToken(ConstantsPara.dd_corp_id, ConstantsPara.dd_corp_secret)
                .subscribe(object : Observer<AccessTokenBean> {
                    override fun onError(e: Throwable) {
                        e.printStackTrace()
                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onComplete() {
                    }

                    override fun onNext(t: AccessTokenBean) {
                        println("refreshAccessToken $t")
                    }
                })


    }
}