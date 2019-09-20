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
}