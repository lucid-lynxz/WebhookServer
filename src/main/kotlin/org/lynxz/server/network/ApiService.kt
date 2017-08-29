package org.lynxz.server.network

import io.reactivex.Observable
import org.lynxz.server.bean.*
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
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

    /**
     * [获取部门列表信息](https://open-doc.dingtalk.com/docs/doc.htm?spm=a219a.7629140.0.0.xIVqtB&treeId=172&articleId=104979&docType=1#s0)
     */
    @GET("department/list")
    fun getDepartmentList(): Observable<DepartmentListBean>

    /**
     * [获取指定部门的成员信息,默认获取全部成员](https://open-doc.dingtalk.com/docs/doc.htm?spm=a219a.7629140.0.0.xIVqtB&treeId=172&articleId=104979&docType=1#s12)
     * */
    @GET("user/simplelist")
    fun getDepartmentMemberList(@Query("department_id") id: Int = 1): Observable<DepartmentMemberListBean>

    /**
     * [向指定用户发送普通文本消息](https://open-doc.dingtalk.com/docs/doc.htm?spm=a219a.7629140.0.0.oavHEu&treeId=172&articleId=104973&docType=1#s2)
     */
    @POST("message/send")
    fun sendTextMessage(@Body bean: MessageTextBean): Observable<MessageResponseBean>

}