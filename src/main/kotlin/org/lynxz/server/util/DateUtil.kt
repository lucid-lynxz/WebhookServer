package org.lynxz.server.util

import java.text.SimpleDateFormat
import java.util.*

object DateUtil {
    val formatter = SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS")


    /**
     * 获取当前日期时间字符串,形如: 2019.08.25 21:07:49.829
     * */
    fun getCurDateTimeStr() = formatter.format(Date())
}