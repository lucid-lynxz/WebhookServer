package org.lynxz.server.service

import org.apache.logging.log4j.LogManager
import org.lynxz.server.bean.PersistenceDataBean
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.convertBody
import org.lynxz.server.msec2date
import org.lynxz.server.network.HttpManager
import javax.servlet.http.HttpServletRequest

/**
 * 进行持久化操作
 * 对req中的数据进行保存
 * */
class PersistenceService : PlatformService {
    private val fileLogger = LogManager.getLogger("PersistenceLog")

    override fun process(req: HttpServletRequest?) {
        req?.let {
            convertBody(req.inputStream, PersistenceDataBean::class.java)?.let {
                fileLogger.info("测试文件======")

                StringBuilder(100).apply {
                    append("持久化通知 ${it.title}\n")
                    append("名称: ${it.title}\n")
                    append("详情: ${it.message}\n")
                    append("服务器时间: ${msec2date()}")
                    HttpManager.sendTextMessage(ConstantsPara.defaultNoticeUserName, toString())
                }
            }
        }
    }
}