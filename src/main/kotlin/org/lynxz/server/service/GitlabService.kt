package org.lynxz.server.service

import org.lynxz.server.bean.JiraBugEventBean
import org.lynxz.server.convertBody
import javax.servlet.http.HttpServletRequest

/**
 * Created by lynxz on 28/08/2017.
 */
class GitlabService : PlatformService {
    override fun process(req: HttpServletRequest?) {
        convertBody(req?.inputStream, JiraBugEventBean::class.java)
    }
}