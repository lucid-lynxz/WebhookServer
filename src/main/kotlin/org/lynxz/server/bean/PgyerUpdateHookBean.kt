package org.lynxz.webhook.bean

/**
 * Created by lynxz on 27/04/2017.
 * 蒲公英上传新apk后回调通知
 */
data class PgyerUpdateHookBean(var action: String? = null) {
    /**
     * action : 应用更新
     * title : 声动
     * link : https://www.pgyer.com/Cb6T
     * message : 您的应用声动有了新的版本(1.0.4)更新。
     * type : updateVersion
     * os_version : 1.0.4
     * build_version : 17
     * created : 2017-04-27 10:47:17
     * updated : 2017-04-27 10:47:17
     * timestamp : 1493261238
     * appsize : 15896263
     * device_type : Android
     * appQRCodeURL : https://static.pgyer.com/app/qrcode/Cb6T
     * notes :
     */
    
    var title: String? = null
    var link: String? = null
    var message: String? = null
    var type: String? = null
    var os_version: String? = null
    var build_version: String? = null
    var created: String? = null
    var updated: String? = null
    var timestamp: Long = 0
    var appsize: String? = null
    var device_type: String? = null
    var appQRCodeURL: String? = null
    var notes: String? = null
}
