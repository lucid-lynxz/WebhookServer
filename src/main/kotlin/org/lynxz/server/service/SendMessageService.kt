package org.lynxz.server.service

import org.lynxz.server.bean.ImType
import org.lynxz.server.bean.SendMessageReqBean
import org.lynxz.server.bean.TgSendMessageReqBean
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
            when (it.imType) {
                ImType.TG -> {
                    if (it.name.isNullOrBlank()) {
                        it.name = ConstantsPara.defaultTgUserName
                    }
                    val key = "${it.tgBotToken}_${it.name}"
                    val doOnComplete = {
                        val chatId = ConstantsPara.tgChatInfoMap[key]
                        HttpManager.sendTgMessage(TgSendMessageReqBean(chatId, it.content), it.tgBotToken)
                    }
                    if (ConstantsPara.tgChatInfoMap[key] == null) {
                        HttpManager.getTgBotUpdates(it.tgBotToken, doOnComplete)
                    } else {
                        doOnComplete.invoke()
                    }
                }
                ImType.DingDing -> {
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
    }
}