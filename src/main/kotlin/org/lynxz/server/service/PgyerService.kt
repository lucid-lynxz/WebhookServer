package org.lynxz.server.service

import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.convertBody
import org.lynxz.server.msec2date
import org.lynxz.server.network.HttpManager
import org.lynxz.webhook.bean.PgyerUpdateHookBean
import javax.servlet.http.HttpServletRequest

/**
 * Created by lynxz on 28/08/2017.
 * 处理 蒲公英 的 hook 请求
 * 需要在蒲公英-我的应用-应用设置-webhook 设置中指定通知的服务器地址
 */
class PgyerService : PlatformService {
    override fun process(req: HttpServletRequest?) {
        req?.let {
            convertBody(req.inputStream, PgyerUpdateHookBean::class.java)?.let {
                StringBuilder(100).apply {
                    append("蒲公英: ${it.action}\n")
                    append("名称: ${it.title}-${it.device_type}-v${it.os_version}\n")
                    append("版本说明: ${it.notes ?: "无"}\n")
                    append("下载链接: ${it.link}\n")
                    append("二维码链接: ${it.appQRCodeURL}\n")
                    append("服务器时间: ${msec2date()}")
                    HttpManager.sendTextMessage(ConstantsPara.defaultNoticeUserName, null, toString())
                }
            }
        }
    }
}