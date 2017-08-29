package org.lynxz.server.config

/**
 * Created by lynxz on 25/08/2017.
 * 使用到的一些key名称
 */
object KeyNames {
    val versionCode = "versionCode"
    val versionName = "versionName"

    val corpid = "corpid"
    val corpsecret = "corpsecret"
    val agentId = "agentId"
    val jiraUrl = "jira_borwse_url"
    val defaultNoticeUserName = "defaultNoticeUserName"

    // 与钉钉服务器通讯时,需要在url中添加query参数: access_token
    val QUERY_KEY_ACCESS_TOKEN = "access_token"
    val HEADER_KEY_CONTENT_TYPE = "Content-Type"

    val defaultAssignee = "defaultAssignee"
    val gitlabPushMergeBranch = "gitlab_push_merge_branch"

    // httpServlet获取header信息时需要
    val HEADER_USER_AGENT = "user-agent"
    // header中user-agent字段可能包含如下属性
    val HEADER_GIRA = "JIRA" // jira
    val HEADER_GITLAB = "X-Gitlab-Event" // gitlab
    val HEADER_PGYER = "PgyerWebhookClient" // 蒲公英
    val HEADER_JENKINS_PGYER = "jenkins_upload_pgyer" // 自定义的jenkins打包完后上传到蒲公英后发送的通知

    // gitlab请求类型
    val HEADER_GITLAB_MERGE_HOOK = "merge request hook"
    val HEADER_GITLAB_PUSH_HOOK = "push hook"


}