package org.lynxz.server.bean

import org.lynxz.server.config.ConstantsPara

/**
 * 用于发送钉钉消息给指定人员或者群组的请求
 * */
data class SendMessageReqBean(
        var name: String? = null, // 发送给指定人员的姓名,tg消息则对应其userName
        var mobile: String? = null,// 要发送给特定人员的手机号码,匹配优先级高于姓名
        var content: String = "", // 消息内容
        var departmentName: String? = "", // 部门名称, 若 name 和 mobile 均为空,则发送给group所有人
        var imType: String = ImType.DingDing, // 发送消息的im,默认发送到钉钉
        var tgBotToken: String = ConstantsPara.defaultTgBotToken // tg接收消息的bot token
)

// 支持消息转发的im类型信息
object ImType {
    const val DingDing = "DingDing"
    const val TG = "Telegram"
}