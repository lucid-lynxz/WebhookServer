package org.lynxz.server.bean

/**
 * Created by lynxz on 07/03/2017.
 * 获取钉钉的accessToken时的reponse
 *
 * errcode : 0
 * errmsg : ok
 * accessToken : fw8ef8we8f76e6f7s8df8s
 */
data class AccessTokenBean(var errorcode: Int = 0,
                           var errmsg: String? = null,
                           var access_token: String? = null)