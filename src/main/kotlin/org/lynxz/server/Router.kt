package org.lynxz.server

import org.lynxz.server.config.KeyNames
import org.lynxz.server.config.PathInfo
import org.lynxz.server.network.HttpManager
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
            val gitlabHeader = req.getHeader(KeyNames.HEADER_GITLAB)
            val pathInfo = req.pathInfo
            println("${msec2date()} Router userAgent is: $userAgent  ,gitlabHeader is: $gitlabHeader  ,req.pathInfo is: $pathInfo")
            if (!pathInfo.isNullOrBlank()) {
                if (pathInfo.endsWith(PathInfo.KEY_ACTION_REFRESH_TOKEN, true)) {
                    HttpManager.refreshAccessToken()
                } else if (pathInfo.endsWith(PathInfo.KEY_ACTION_UPDATE_DEPARTMENT_INFO, true)) {
                    HttpManager.getDepartmentInfo()
                } else {
                    println("cannot process this type of path, ignore....$pathInfo")
                }
            } else if (!gitlabHeader.isNullOrBlank()) {
                GitlabService().process(req)
            } else if (!userAgent.isNullOrBlank()) {
                if (userAgent.contains(KeyNames.HEADER_GIRA)) {
                    GiraService().process(req)
                } else if (userAgent.contains(KeyNames.HEADER_PGYER)) {
                    PgyerService().process(req)
                } else if (userAgent.contains(KeyNames.HEADER_JENKINS_PGYER)) {
                    JenkinsService().process(req)
                } else {
                    println("connot process this type of user-agent: $userAgent")
                }
            } else {
                println("cannot process this type of request, ignore....${req.requestURL}")
            }
        }
    }
}