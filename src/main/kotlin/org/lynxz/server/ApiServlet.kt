package org.lynxz.server

import io.reactivex.Observable
import org.apache.logging.log4j.LogManager
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.config.KeyNames
import org.lynxz.server.network.HttpManager
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.*
import java.util.concurrent.TimeUnit
import javax.servlet.ServletConfig
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import kotlin.collections.HashMap


/**
 * Created by lynxz on 25/08/2017.
 * 对所有请求进行处理
 * 关于 [@WebServlet的使用](http://blog.csdn.net/maozi_bsz/article/details/46431189)
 */
@WebServlet(name = "home", value = "/*", loadOnStartup = 1)
class ApiServlet : HttpServlet() {

    private val logger = LogManager.getLogger()

    override fun init(config: ServletConfig?) {
        super.init(config)
        getConfigPath("config.properties").let {
            // 避免多次初始化
            if (ConstantsPara.dd_corp_id.isNullOrBlank()) {
                println("init configPath is $it \n${File(it).exists()}")
                loadConfig(it)
                // access_token有效期7200秒
                Observable.interval(0, 3600, TimeUnit.SECONDS)
                        .subscribe { HttpManager.refreshAccessToken() }
            }
        }
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
//                write("{\"serverTime\":\"${msec2date()}\"}") // 使用println(...) 等效
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
                load(InputStreamReader(FileInputStream(File(configPath)), "UTF-8"))
//                load(FileInputStream(File(configPath)))
                ConstantsPara.dd_corp_id = getProperty(KeyNames.corpid)
                ConstantsPara.dd_corp_secret = getProperty(KeyNames.corpsecret)
                ConstantsPara.dd_agent_id = getProperty(KeyNames.agentId)
                ConstantsPara.jiraUrl = getProperty(KeyNames.jiraUrl)
                ConstantsPara.defaultNoticeUserName = getProperty(KeyNames.defaultNoticeUserName)
                ConstantsPara.targetMergeBranch = getProperty(KeyNames.gitlabPushMergeBranch)
                println("the corp id is: ${ConstantsPara.dd_corp_id}  ,defaultNoticeUserName = ${ConstantsPara.defaultNoticeUserName}")
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