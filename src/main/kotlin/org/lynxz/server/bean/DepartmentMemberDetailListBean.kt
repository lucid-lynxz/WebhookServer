package org.lynxz.server.bean

/**
 * 获取部门用户详情
 * 钉钉文档: https://ding-doc.dingtalk.com/doc#/serverapi2/ege851
 * */
data class DepartmentMemberDetailListBean(
        val errcode: Int,
        val errmsg: String,
        val hasMore: Boolean, // 在分页查询时返回，代表是否还有下一页更多数据
        val userlist: List<UserDetailInfo>,
        var departmentId: Int = 0//所属部门id
)

// 部门用户详细信息
data class UserDetailInfo(
        val active: Boolean, // 表示该用户是否激活了钉钉
        val avatar: String,
        val department: List<Int>, // 成员所属部门id列表
        val dingId: String,
        val email: String,
        val isAdmin: Boolean,
        val isBoss: Boolean,
        val isHide: Boolean,
        val isLeader: Boolean,
        val jobnumber: String,// 员工工号
        val mobile: String,
        val name: String,
        val openId: String,
        val order: Long,
        val position: String,
        val stateCode: String, // 国家地区码
        val tel: String, // 分机号
        val unionid: String, // 员工在当前开发者企业账号范围内的唯一标识，系统生成，固定值，不会改变
        val userid: String, // 员工在当前企业内的唯一标识，也称staffId。可由企业在创建时指定，并代表一定含义比如工号，创建后不可修改
        val workPlace: String
) {
    var remark: String? = null // 备注, 若为空,则使用name替代
        get() = if (field.isNullOrBlank()) name else field
}