package org.lynxz.server.bean

/**
 * tg 获取 bot新消息列表的响应
 * [文档](https://core.telegram.org/bots/api#getupdates)
 *
```json
 * {
 *     "ok": true,
 *     "result": [{
 *         "update_id": 629414424,
 *         "channel_post": { // 来自于channel
 *             "message_id": 22,
 *             "chat": {
 *                 "id": -1001232599787, // channel 的 chat_id,用于回复
 *                 "title": "11_\u6280\u672f\u5b66\u4e60\ud83e\udd13", // channel名称
 *                 "type": "channel"
 *             },
 *             "date": 1570239840,
 *             "text": "\u6d4b\u8bd5" // 消息内容
 *         }
 *     },{
 *         "update_id": 629414427,
 *         "message": { // 普通消息,直接通过机器人聊天发送的消息
 *             "message_id": 8,
 *             "from": {
 *                 "id": 417044892, // 发送人 id
 *                 "is_bot": false, // 发送人是否是bot
 *                 "first_name": "\u4f60\u8bf4\u5f97\u5bf9tg", // 发送人昵称
 *                 "username": "us3jxjk8d", // user name
 *                 "language_code": "en"
 *             },
 *             "chat": {
 *                 "id": 417044892,
 *                 "first_name": "\u4f60\u8bf4\u5f97\u5bf9tg",
 *                 "username": "us3jxjk8d",
 *                 "type": "private"
 *             },
 *             "date": 1570239945,
 *             "text": "\u5f88\u7cbe\u660e\u7a7a\u7075" // 消息内容
 *         }
 *     }, {
 *         "update_id": 629414429,
 *         "message": {
 *             "message_id": 9,
 *             "from": {
 *                 "id": 417044892,
 *                 "is_bot": false,
 *                 "first_name": "\u4f60\u8bf4\u5f97\u5bf9tg",
 *                 "username": "us3jxjk8d",
 *                 "language_code": "en"
 *             },
 *             "chat": {
 *                 "id": -394752664,
 *                 "title": "testbotgroup\ud83d\ude44,"
 *                 "type": "group", // 群组消息
 *                 "all_members_are_administrators": true
 *             },
 *             "date": 1570240581,
 *             "group_chat_created": true
 *         }
 *     }]
 * }
 *
 * */
data class TgGetUpdateResponseBean(
        val ok: Boolean,
        val result: List<Result>?
)

data class Result(
        val channel_post: ChannelPost?,
        val message: Message?,
        val update_id: Long
)

data class ChannelPost(
        val chat: ChannelChat,
        val date: Long,
        val message_id: Long,
        val text: String
)

data class ChannelChat(
        val id: Long,
        val title: String,
        val type: String
)

data class Message(
        val chat: MessageChat,
        val date: Long,
        val from: From,
        val message_id: Long,
        val text: String
)

data class MessageChat(
        val first_name: String?, // 昵称
        val id: Long,
        val type: String,
        val username: String? // userName
)

data class From(
        val first_name: String,
        val id: Long,
        val is_bot: Boolean,
        val language_code: String,
        val username: String
)