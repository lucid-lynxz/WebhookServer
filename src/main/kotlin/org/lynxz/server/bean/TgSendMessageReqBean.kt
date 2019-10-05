package org.lynxz.server.bean

/**
 * telegram sendMessage body
 * [文档](https://core.telegram.org/bots/api#sendmessage)
 *
 * 测试请求: curl -X POST "https://api.telegram.org/bot$bot_token/sendMessage" -d "chat_id=$chat_id&text=$msg"
 * */
data class TgSendMessageReqBean(
        var chat_id: Long?, // 必填
        var text: String?,// 必填
        var parse_mode: String = "HTML", //  Markdown  HTML
        var disable_web_page_preview: Boolean = false,
        var disable_notification: Boolean = false
) {
    fun isValid() = chat_id != null && !text.isNullOrBlank()

    override fun toString(): String {
        return "TgSendMessageReqBean: $chat_id $text"
    }
}