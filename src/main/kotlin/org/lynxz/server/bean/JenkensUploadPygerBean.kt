package org.lynxz.webhook.bean

/**
 * Created by lynxz on 06/05/2017.
 * 使用jenkins打包生成pak后,上传到蒲公英,蒲公英返回的响应内容
 * 本服务器依据该内容通知钉钉
 * [蒲公英上传接口说明](https://www.pgyer.com/doc/api#uploadApp)
 */
data class JenkensUploadPygerBean(var code: Int = 0,
                                  var message: String? = null,
                                  var data: DataBean? = null) {

    /**
     * code : 0
     * message :
     * data : {"appKey":"451359ad7b69bfb21f4d124588f749f0","userKey":"9f2634129de0e58c06366b6e4c355b6f","appType":"2","appIsLastest":"1","appFileSize":"3333852","appName":"PrivatePhoto","appVersion":"0.1.1","appVersionNo":"2","appBuildVersion":"5","appIdentifier":"org.lynxz.privatephoto","appIcon":"33b678170f8b387a6923d428f772a178","appDescription":"","appUpdateDescription":"测试python上传文件功能21","appScreenshots":"","appShortcutUrl":"5faf","appCreated":"2017-05-06 21:00:50","appUpdated":"2017-05-06 21:00:50","appQRCodeURL":"https://static.pgyer.com/app/qrcodeHistory/3a41378d4e000e4562095290920a1142d86a8accddfecab490691faf5486c89a"}
     */
    class DataBean {
        /**
         * appKey : 451359ad7b69bfb21f4d124588f749f0
         * userKey : 9f2634129de0e58c06366b6e4c355b6f
         * appType : 2
         * appIsLastest : 1
         * appFileSize : 3333852
         * appName : PrivatePhoto
         * appVersion : 0.1.1
         * appVersionNo : 2
         * appBuildVersion : 5
         * appIdentifier : org.lynxz.privatephoto
         * appIcon : 33b678170f8b387a6923d428f772a178
         * appDescription :
         * appUpdateDescription : 测试python上传文件功能21
         * appScreenshots :
         * appShortcutUrl : 5faf
         * appCreated : 2017-05-06 21:00:50
         * appUpdated : 2017-05-06 21:00:50
         * appQRCodeURL : https://static.pgyer.com/app/qrcodeHistory/3a41378d4e000e4562095290920a1142d86a8accddfecab490691faf5486c89a
         */

        var appKey: String? = null
        var userKey: String? = null
        var appType: String? = null
        var appIsLastest: String? = null
        var appFileSize: String? = null
        var appName: String? = null
        var appVersion: String? = null
        var appVersionNo: String? = null
        var appBuildVersion: String? = null
        var appIdentifier: String? = null
        var appIcon: String? = null
        var appDescription: String? = null
        var appUpdateDescription: String? = null
        var appScreenshots: String? = null
        var appShortcutUrl: String? = null
        var appCreated: String? = null
        var appUpdated: String? = null
        var appQRCodeURL: String? = null
    }
}
