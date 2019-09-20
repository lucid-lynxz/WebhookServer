package org.lynxz.server.service

import org.lynxz.server.bean.SendMessageReqBean
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.convertBody
import org.lynxz.server.network.HttpManager
import javax.servlet.http.HttpServletRequest

/**
 * 发送钉钉消息给指定人员或者群组
 * */
class SendMessageService : PlatformService {
    override fun process(req: HttpServletRequest?) {
        convertBody(req?.inputStream, SendMessageReqBean::class.java)?.let {
            var departmentId = 1
            if (it.departmentName.isNullOrBlank() || ConstantsPara.departmentList == null) {
                departmentId = 1
            } else {
                ConstantsPara.departmentList!!.department.forEach { depart ->
                    if (depart.name.equals(it.departmentName, true)) {
                        departmentId = depart.id
                    }
                }
            }

            HttpManager.sendTextMessage(it.name, it.mobile, it.content, departmentId)
        }
    }
}