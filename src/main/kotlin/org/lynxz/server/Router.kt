package org.lynxz.server

import org.lynxz.server.config.KeyNames
import org.lynxz.server.service.GiraService
import org.lynxz.server.service.GitlabService
import org.lynxz.server.service.JenkinsService
import org.lynxz.server.service.PgyerService
import javax.servlet.http.HttpServletRequest

/**
 * Created by lynxz on 28/08/2017.
 * 根据header头部信息,调用对应的处理类
 */
object Router {
    fun route(req: HttpServletRequest?) {
        req?.let {
            val userAgent = req.getHeader(KeyNames.HEADER_USER_AGENT)
            userAgent?.let {
                if (userAgent.contains(KeyNames.HEADER_GIRA)) {
                    GiraService().process(req)
                } else if (userAgent.contains(KeyNames.HEADER_PGYER)) {
                    PgyerService().process(req)
                } else if (userAgent.contains(KeyNames.HEADER_JENKINS_PGYER)) {
                    JenkinsService().process(req)
                } else if (!req.getHeader(KeyNames.HEADER_GITLAB).isNullOrBlank()) {
                    GitlabService().process(req)
                } else {
                    println("cannot process this type of request, ignore....${req.requestURL}")
                }
            }
        }
    }
}