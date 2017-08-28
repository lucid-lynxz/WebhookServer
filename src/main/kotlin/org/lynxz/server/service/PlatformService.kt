package org.lynxz.server.service

import javax.servlet.http.HttpServletRequest

/**
 * Created by lynxz on 28/08/2017.
 * 各平台 webhook 处理方法接口
 */
interface PlatformService {

    /**
     * 对请求进行判断处理,并按需发送钉钉消息
     * */
    fun process(req: HttpServletRequest?)
}