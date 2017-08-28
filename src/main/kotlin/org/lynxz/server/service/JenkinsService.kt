package org.lynxz.server.service

import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.convertBody
import org.lynxz.server.msec2date
import org.lynxz.webhook.bean.JenkensUploadPygerBean
import javax.servlet.http.HttpServletRequest

/**
 * Created by lynxz on 28/08/2017.
 * 处理自定义的jenkins通知消息
 * 这个需要按需在jenkins脚本中调用网络请求处理,不具有通用性
 * 我自己用的, 在header中有 "userName" 和 "msg" 字段用于指示谁发起的打包和打包概要说明
 * 具体可参考我的博客: http://www.jianshu.com/p/733cfa75ff8b
 */
class JenkinsService : PlatformService {
    override fun process(req: HttpServletRequest?) {
        req?.let {
            convertBody(req.inputStream, JenkensUploadPygerBean::class.java)?.let {
                // 发起 jenkins 打包的用户名,同时消息的接收方
                // 注意 userName需要与钉钉后台通讯录中的用户名一致或者能够一一映射才可
                val userName = req.getParameter("userName") ?: ConstantsPara.defaultNoticeUserName
                val msg = req.getParameter("msg")

                val sb = StringBuilder(100).apply {
                    append("jenkins上传apk到蒲公英-code=${it.code}\n")
                    append("错误消息: ${it.message ?: "无"}")
                    it.data?.let {
                        append("名称: ${it.appName}-v${it.appVersion}(build ${it.appBuildVersion})\n")
                        append("版本说明: ${it.appUpdateDescription}\n")
                        append("下载链接: https://www.pgyer.com/${it.appShortcutUrl}\n")
                        append("二维码链接: ${it.appQRCodeURL}\n")
                    }
                    append("服务器时间: ${msec2date()}")
                }
                println("JenkinsService message to dingding is:\n$sb")
            }
        }
    }
}