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
    val defaultNoticeUserName="defaultNoticeUserName"

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
    val HEADER_GITLAB_MERGE_HOOK = "Merge Request Hook"
    val HEADER_GITLAB_PUSH_HOOK = "Push Hook"

}