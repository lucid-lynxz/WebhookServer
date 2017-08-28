package org.lynxz.server

import java.text.SimpleDateFormat
import java.util.*

/**
 * 将当前时间戳转换为指定格式的日期字符串
 * */
fun msec2date(format: String = "yyyy-MM-dd HH:mm:ss") = SimpleDateFormat(format).format(Date(System.currentTimeMillis()))
