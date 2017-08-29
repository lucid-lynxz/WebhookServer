package org.lynxz.server.config

/**
 * Created by lynxz on 21/03/2017.
 * merge等hook通知的action字段值
 */
object Actions {
    val OPEN = "open"//提交合并请求
    val MERGE = "merge"//审核人同意合并
    val CLOSE = "close"// 合并申请被关闭
    val REOPEN = "reopen"//重开已关闭的merge request
    val UPDATE = "upate" // 用户先pull再push然后提交merge请求,此时action值是update
}
