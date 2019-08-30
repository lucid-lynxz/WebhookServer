package org.lynxz.server.util

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object CommonUtil {

    private val fileLogger: Logger = LogManager.getLogger("PersistenceLog")

    /**
     * 写入文件信息到文件中
     * */
    fun log2File(msg: String? = null) {
        if (!msg.isNullOrBlank()) {
            fileLogger.error(msg)
        }
    }
}