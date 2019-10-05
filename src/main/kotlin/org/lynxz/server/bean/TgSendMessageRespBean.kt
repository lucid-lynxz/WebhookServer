package org.lynxz.server.bean

/** 调用tg sendmessage接口的返回结果
 * <pre>
 * {
 *     "ok": true, // 发送消息收成功
 *     "error_code": 200,
 *     "description": "",
 *     "result": { // ok=true时有值
 *         "message_id": 25,
 *         "from": {
 *             "id": 974962570,
 *             "is_bot": true,
 *             "first_name": "\u77ed\u606f\u8f6c\u53d1\u63a5\u6536bot",
 *             "username": "lynxzz_message_bot"
 *         },
 *         "chat": { // 接收方信息
 *             "id": 417044892,
 *             "first_name": "\u4f60\u8bf4\u5f97\u5bf9tg",
 *             "username": "us3jxjk8d",
 *             "type": "private" // 个人聊天,对应的还有 channel, group,supergroup
 *         },
 *     "date": 1570245182,
 *     "text": "hellobot" // 发送的消息内容
 *     }
 * }
 * </pre>
 */
data class TgSendMessageRespBean(
        val ok: Boolean, // 发送消息是否成功
        val result: TgRespResult?, //  ok=true时有值
        val description: String, // ok=false时有值
        val error_code: Long// ok=false时有值
)

data class TgRespResult(
        val chat: TgRespChat,
        val date: Long,
        val from: TgRespFrom,
        val message_id: Long,
        val text: String?
)

data class TgRespChat(
        val first_name: String,
        val id: Long,
        val type: String,
        val username: String
)

data class TgRespFrom(
        val first_name: String,
        val id: Long,
        val is_bot: Boolean,
        val username: String
)