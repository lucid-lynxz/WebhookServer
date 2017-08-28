package org.lynxz.server

import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.text.SimpleDateFormat
import java.util.*
import javax.servlet.ServletInputStream

/**
 * 将当前时间戳转换为指定格式的日期字符串
 * */
fun msec2date(format: String = "yyyy-MM-dd HH:mm:ss") = SimpleDateFormat(format).format(Date(System.currentTimeMillis()))


/**
 * 将请求的body部分转换成指定的实体类
 */
internal fun <T> convertBody(sis: ServletInputStream?, clz: Class<T>): T? {
    if (sis == null) {
        return null
    }

    var br: BufferedReader? = null
    try {
        br = BufferedReader(InputStreamReader(sis, "UTF-8"))
        val sb = StringBuilder()
        var line = br.readLine()
        while (line != null) {
            sb.append(line)
            line = br.readLine()
        }
        val bodyStr = sb.toString()
        println("${msec2date()} request body is: $bodyStr")
        return Gson().fromJson(bodyStr, clz)
    } catch (e: Exception) {
        e.printStackTrace()
        println("${msec2date()}  error occurs when convertBody :\n${e.message} ")
    } finally {
        try {
            br?.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    return null
}