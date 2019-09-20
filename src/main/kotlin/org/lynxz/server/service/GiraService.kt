package org.lynxz.server.service

import org.lynxz.server.bean.JiraBugEventBean
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.convertBody
import org.lynxz.server.msec2date
import org.lynxz.server.network.HttpManager
import java.io.IOException
import javax.servlet.http.HttpServletRequest

/**
 * Created by lynxz on 28/08/2017.
 * 处理gira的webhook通知
 */
class GiraService : PlatformService {

    @Throws(IOException::class)
    override fun process(req: HttpServletRequest?) {
        req?.let {
            convertBody(req.inputStream, JiraBugEventBean::class.java)?.let {
                val bean = it
                /*
                * issue 创建或修改的操作人
                * */
                val user = bean.user

                val event = bean.webhookEvent
                val issue = bean.issue
                val fields = issue.fields

                val affectLabels = fields.labels//测试版本号
                val type = fields.issuetype.name//issue类型,如 Bug
                val projectName = fields.project.key

                val creatorName = fields.creator.displayName
                val summary = fields.summary// bug标题
                val keyId = issue.key// bug编号,如 UPLUSGO-1241
                val url = ConstantsPara.jiraUrl + keyId//issue详情访问网址
                var assigneeName = fields.assignee.displayName//bug归属人

                /*
                * issue 状态信息
                * */
                val status = fields.status

                /*
                * 存在 changelog 对象时,表明 issue 内容被修改过,比如标题描述
                * 测试了下,属性 items 是个列表,但改变多次也只有最新的一条记录
                * */
                val changelog = bean.changelog

                /*
                * issue 的备注信息列表
                * 按提交 comment 的先后顺序排列
                * 测试过,一定有值
                * */
                val comment = fields.comment
                val comments = comment.comments

                val sb = StringBuilder(100).apply {
                    append("$event\n")
                    append("人员: ${user.displayName}\n")
                    append("归属: $assigneeName\n")
                    append("类型: $type (状态: ${status.name} )\n")
                    append("项目: $projectName - $affectLabels\n")
                    append("概要: $summary\n")

                    if (changelog != null) {
                        val items = changelog.items
                        if (items.size >= 1) {
                            append("编辑issue: ${items[0].field}->${items[0].toString}\n")
                        }
                    } else if (comments.size > 0) {
                        append("最新备注:  ${comments[comments.size - 1].body}\n")
                    }

                    append("点击查看: $url\n")
                     append("服务器时间: ${msec2date()}")
                }

//                println("要发送的jira信息为: $sb")
                assigneeName = if (assigneeName.isNullOrBlank()) ConstantsPara.defaultNoticeUserName else assigneeName
                HttpManager.sendTextMessage(assigneeName, null, sb.toString())
            }
        }
    }
}