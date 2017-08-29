package org.lynxz.server

import org.apache.logging.log4j.LogManager
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.config.KeyNames
import org.lynxz.server.network.HttpManager
import java.io.File
import java.io.FileInputStream
import java.util.*
import javax.servlet.ServletConfig
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import kotlin.collections.HashMap

/**
 * Created by lynxz on 25/08/2017.
 */
class ApiServlet : HttpServlet() {

    private val logger = LogManager.getLogger()

    override fun init(config: ServletConfig?) {
        super.init(config)
        getConfigPath("config.properties").let {
            println("init configPath is $it \n${File(it).exists()}")
            loadConfig(it)
        }
        HttpManager.refreshAccessToken()
    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        doPost(req, resp)
    }

    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {
        processRequest(req, resp)
    }

    private fun processRequest(req: HttpServletRequest?, resp: HttpServletResponse?) {
        req?.characterEncoding = "UTF-8"
        getHeadersInfo(req)
        Router.route(req)
        resp?.apply {
            characterEncoding = "UTF-8"
            // 返回给客户端的数据
            writer.apply {
                write("hello, I'm running... ${msec2date()}") // 使用println(...) 等效
                flush()
                close()
            }
        }
    }


    /**
     * 加载指定根目录下指定路径的属性文件
     * @param configPath 文件路径,如 "/config.properties"
     * @return 属性对象 Properties
     */
    private fun loadConfig(configPath: String) {
        if (File(configPath).exists()) {
            Properties().apply {
                load(FileInputStream(File(configPath)))
                ConstantsPara.dd_corp_id = getProperty(KeyNames.corpid)
                ConstantsPara.dd_corp_secret = getProperty(KeyNames.corpsecret)
                ConstantsPara.dd_agent_id = getProperty(KeyNames.agentId)
                ConstantsPara.jiraUrl = getProperty(KeyNames.jiraUrl)
                ConstantsPara.defaultNoticeUserName = getProperty(KeyNames.defaultNoticeUserName)
                ConstantsPara.targetMergeBranch = getProperty(KeyNames.gitlabPushMergeBranch)
                println("the corp id is: ${ConstantsPara.dd_corp_id}")
            }
        }
    }

    //将配置文件放置于 src/main/webapp 目录下
    fun getConfigPath(fileName: String) = "${servletContext.getRealPath("/")}$fileName"

    /**
     * 获取header信息
     */
    private fun getHeadersInfo(request: HttpServletRequest?) = HashMap<String, String>().apply {
        request?.headerNames?.let {
            while (it.hasMoreElements()) {
                val key = it.nextElement()
                put(key, request.getHeader(key))
            }
        }
        println("${msec2date()} header of this request: ${toString()}")
    }
}