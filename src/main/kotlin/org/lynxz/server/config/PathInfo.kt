package org.lynxz.server.config

/**
 * Created by lynxz on 30/08/2017.
 */
object PathInfo {
    // 刷新token
    const val KEY_ACTION_REFRESH_TOKEN = "/action/refreshToken"
    // 重新获取通讯录
    const val KEY_ACTION_UPDATE_DEPARTMENT_INFO = "/action/updateDepartmentInfo"
    // 保存数据到文件或者数据库中
    const val KEY_ACTION_SAVE_DATA = "/action/save_data"
    // 发送钉钉消息给指定用户或部门
    const val KEY_ACTION_SEND_MSG = "/action/send_msg"

}