package org.lynxz.server

import javax.servlet.ServletConfig
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by lynxz on 25/08/2017.
 */
class ApiServlet : HttpServlet() {
    override fun init(config: ServletConfig?) {
        super.init(config)
        System.out.println("init ...............")
    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        doPost(req, resp)
    }

    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {
        processRequest(req, resp)
    }

    private fun processRequest(req: HttpServletRequest?, resp: HttpServletResponse?) {
        req?.characterEncoding = "UTF-8"
        resp?.apply {
            characterEncoding = "UTF-8"
            writer.apply {
                kotlin.io.println("hello, I'm running")
                write("hello, I'm running...")
                flush()
                close()
            }
        }
    }
}