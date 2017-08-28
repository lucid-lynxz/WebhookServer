package org.lynxz.server.network

import io.reactivex.Observable
import org.lynxz.server.bean.AccessTokenBean
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by lynxz on 25/08/2017.
 */
interface ApiService {

    /**
     * [获取钉钉AccessToken](https://open-doc.dingtalk.com/docs/doc.htm?spm=a219a.7629140.0.0.dfrJ5p&treeId=172&articleId=104980&docType=1)
     * @param id        corpid 企业id
     * @param secret    corpsecret 企业应用的凭证密钥
     * */
    @GET("gettoken")
    fun getAccessToken(@Query("corpid") id: String, @Query("corpsecret") secret: String): Observable<AccessTokenBean>
}