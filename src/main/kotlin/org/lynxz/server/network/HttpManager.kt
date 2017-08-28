package org.lynxz.server.network

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.lynxz.server.bean.AccessTokenBean
import org.lynxz.server.config.ConstantsPara
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by lynxz on 25/08/2017.
 * 网络访问具体处理类
 */
object HttpManager {

    val DDRetrofit: Retrofit = Retrofit.Builder()
            .baseUrl(ConstantsPara.DINGDING_SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    val apiService: ApiService = DDRetrofit.create(ApiService::class.java)


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