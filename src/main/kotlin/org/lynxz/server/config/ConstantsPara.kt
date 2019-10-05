package org.lynxz.server.config

import org.lynxz.server.bean.DepartmentListBean
import org.lynxz.server.bean.UserDetailInfo

/**
 * Created by lynxz on 25/08/2017.
 * 参数
 */
object ConstantsPara {
    // 钉钉服务器地址
    val DINGDING_SERVER_URL = "https://oapi.dingtalk.com/"

    // 钉钉相关参数
    var dd_corp_id = ""
    var dd_corp_secret = ""
    var dd_agent_id = ""
    var accessToken = ""
    var jiraUrl = ""

    /**
     * 用于记录部门id和部门名称之间的对应关系
     * */
    var departmentNameMap = hashMapOf<Int, String>()

    /**
     * 钉钉部门群组
     * */
    var departmentList: DepartmentListBean? = null

    /**
     *用于存储部门id以及部门内的成员详细信息
     * */
    val departmentMemberDetailMap = hashMapOf<Int, List<UserDetailInfo>>()

    /**
     * 若钉钉消息的收信人为空,则默认发给此人
     * */
    var defaultNoticeUserName = "lynxz"

    /**
     * 处理gitlab push or merge hook时, 目标分支匹配时才认为是合并请求
     * */
    var targetMergeBranch = "master"

    /**
     * 默认发送的目标tg bot token信息
     * */
    var defaultTgBotToken = ""

    /**
     * 发送消息给bot时,默认的接收用户
     * */
    var defaultTgUserName = ""

    /**
     * 通过tg getUpdates接口获取其所有的chat id信息
     * key: bot_token + "_" + userName 以便通过接口快速将消息发送给指定人员的bot聊天窗口
     * value: chat_id
     * */
    var tgChatInfoMap = mutableMapOf<String, Long>()
}