package org.lynxz.server.bean

import org.lynxz.server.util.DateUtil

/**
 * request中请求信息持久化(保存到文件或者数据库)
 */
data class PersistenceDataBean(var title: String? = null) {
    var message: String? = null  // 信息详情
    var created: String? = DateUtil.getCurDateTimeStr() // 创建时间
    var updated: String? = DateUtil.getCurDateTimeStr() // 更新时间
    var timestamp: Long = System.currentTimeMillis() // 创建的时间戳
}