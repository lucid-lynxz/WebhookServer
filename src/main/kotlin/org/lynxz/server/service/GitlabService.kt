package org.lynxz.server.service

import org.lynxz.server.bean.GbMergeRequestEventBean
import org.lynxz.server.bean.GbPushRequestEventBean
import org.lynxz.server.config.Actions
import org.lynxz.server.config.ConstantsPara
import org.lynxz.server.config.KeyNames
import org.lynxz.server.convertBody
import org.lynxz.server.msec2date
import org.lynxz.server.network.HttpManager
import java.util.regex.Pattern
import javax.servlet.http.HttpServletRequest

/**
 * Created by lynxz on 28/08/2017.
 * 处理gitlab的合并请求
 * 假设目标分支是master,可能出现两种情况的hook:
 *  1. 在master分支上的push hook;
 *  2. 正常的merge hook;
 */
class GitlabService : PlatformService {
    /*
    * 上次merge后的commit_sha值
    * 由于merge hook有时候不发出,因此之前多加了一个push hook处理
    * 但是有时merge hook 又发出,则会出现两次通知(master分支的push hook测试后每次都有收到)
    * 因此在此处添加一个commitId作为判断依据,避免多次重复同样的消息
    */
    companion object {
        var lastMergeCommitSha: String? = ""
    }

    override fun process(req: HttpServletRequest?) {
        val gitlabHookType = req?.getHeader(KeyNames.HEADER_GITLAB)
        println("gitlabService gitlabHookType: ${gitlabHookType?.toLowerCase()}")
        when (gitlabHookType?.toLowerCase()) {
            KeyNames.HEADER_GITLAB_PUSH_HOOK -> processPushHook(req)
            KeyNames.HEADER_GITLAB_MERGE_HOOK -> processMergeHook(req)
            else -> println("GitlabService cannot  distinguish  $gitlabHookType")
        }
    }

    /**
     * 处理gitlab的merge请求通知
     */
    private fun processMergeHook(req: HttpServletRequest) {
        convertBody(req.inputStream, GbMergeRequestEventBean::class.java)?.let {
            val objectAttributes = it.object_attributes
            val action = objectAttributes.action
            println("processMergeHook action = " + action + " , url = " + objectAttributes.url)
            val user = it.user
            val project = it.project
            StringBuilder(100).apply {
                when (action) {

                    Actions.OPEN, Actions.REOPEN, Actions.UPDATE -> {// 有新的merge请求时,通知审核人员审核
                        append("Gitlab: 有新merge请求: $action\n")
                        append("项目: ${project.name}\n")
                        append("用户: ${user.name}\n")
                        append("目标分支: ${objectAttributes.target_branch}\n")
                        append("请求概要: ${objectAttributes.title}\n")
                        append("服务器时间: ${msec2date()}\n")
                        append("审核地址: ${objectAttributes.url}")
                        HttpManager.sendTextMessage(it.assignee.name, toString())
                    }

                    Actions.CLOSE -> {// merge请求被关闭的时候,通知提交请求的人
                        append("Gitlab: 您的merge请求被关闭\n")
                                .append("项目: ${project.name}\n")
                                .append("目标分支: ${objectAttributes.target_branch}\n")
                                .append("概要: ${objectAttributes.title}\n")
                                .append("服务器时间: ${msec2date()}")
                        HttpManager.sendTextMessage(user.name, toString())
                    }

                    Actions.MERGE -> {// merge请求被通过,通知相关所有人更新代码
                        val mergeCommitSha = objectAttributes.merge_commit_sha
                        println("${msec2date()} processMergeHook $lastMergeCommitSha    $mergeCommitSha")
                        if (lastMergeCommitSha.isNullOrBlank() or
                                !lastMergeCommitSha.equals(mergeCommitSha, ignoreCase = true)) {
                            lastMergeCommitSha = mergeCommitSha

                            append("Gitlab: 有merge请求被通过,请更新代码").append("\n")
                            append("项目: ${project.name}\n")
                            append("分支: ${objectAttributes.target_branch}\n")
                            append("概要: ${objectAttributes.title}\n")
                            append("服务器时间: ${msec2date()}")
                            HttpManager.sendTestMessageToDepartment(toString(), project.name, project.namespace)
                        }
                    }

                    else -> {
                        append("Gitlab: 有新merge请求: ").append(action).append("\n")
                        append("项目: ${project.name}\n")
                        append("用户: ${user.username}\n")
                        append("目标分支: ${objectAttributes.target_branch}\n")
                        append("请求概要: ${objectAttributes.title}\n")
                        append("服务器时间: ${msec2date()}\n")
                        append("审核地址: ${objectAttributes.url}")
                        HttpManager.sendTextMessage(it.assignee.name, toString())
                    }
                }
            }
        }
    }

    /**
     * 判断gitlab push hook 是否是 merge hook,是的话就通知对应人员
     */
    private fun processPushHook(req: HttpServletRequest) {
        convertBody(req.inputStream, GbPushRequestEventBean::class.java)?.let {
            /*
            * 包含 "master" 字样的话就说明是merge hook
            * 具体哪个分支根据 'config.properties' 文件中的 'gitlab_push_merge_branch' 属性来确定
            *  ref : refs/heads/MASTER
            * */
            if (!it.ref.toLowerCase().contains(ConstantsPara.targetMergeBranch)) {
                return
            }

            val after = if (it.after.isNullOrBlank()) it.checkout_sha else it.after

            // 若之前已经处理过该id的消息,则不作处理
            println("${msec2date()} processPushHook $lastMergeCommitSha    $after")
            if (lastMergeCommitSha?.equals(after, ignoreCase = true) ?: false) {
                return
            }
            lastMergeCommitSha = after
            // 获取仓库信息,用于判断是通知哪个部门的人,如Android/iOS
            val repository = it.repository
            val repositoryName = repository.name

            // 获取提交信息
            val commits = it.commits
            if (commits?.size ?: 0 > 0) {
                val commitsBean = commits[commits.size - 1]
                var mergeInfo = commitsBean.message.replace("\\r", "").replace("\\n", "")

                // 去除 master 分支 push 信息中的无用字符串
                val p = Pattern.compile("Merge branch\\D.+into\\s." + ConstantsPara.targetMergeBranch + ".")
                val matcher = p.matcher(mergeInfo)
                val s1 = matcher.replaceFirst("")

                val p1 = Pattern.compile("See\\smerge.+$")
                val matcher1 = p1.matcher(s1)
                mergeInfo = matcher1.replaceAll("")

                StringBuilder(100).apply {
                    append("Gitlab: ${ConstantsPara.targetMergeBranch}分支有代码更新,请刷新本地代码\n")
                    append("项目: $repositoryName\n")
                    append("分支: ${ConstantsPara.targetMergeBranch}\n")
                    append("概要: mergeInfo\n")
                    append("服务器时间: ${msec2date()}")
                    HttpManager.sendTestMessageToDepartment(toString(), it.project.name, it.project.namespace)
                }
            }
        }
    }
}