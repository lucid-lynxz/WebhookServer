> 使用Gradle和Kotlin重写一下之前 [钉钉通知服务器](https://github.com/lucid-lynxz/Webhook_server) 顺便再熟悉下服务端基本编写操作

clone项目后,请在项目根目录下创建 `src/main/webapp/config.properties` 并设置如下属性值,以便获取钉钉相关参数
```properties
# 必填,企业在钉钉中的标识，每个企业拥有一个唯一的CorpID
corpid=dingaa******c2f4657eb6378f
# 必填,企业每个应用的凭证密钥
corpsecret=Bp1_HoQej2s******LE7aRWaJm_lYpSMYvVQi-_Q
# 必填,钉钉微应用id
agentId=123456

# 可选,gitlab默认通知审核的人员或者gira默认通知的bug归属人的真实名字,用于匹配钉钉通讯录获取userId
defaultNoticeUserName="张三"
# 可选,jira 详情面板网址前缀(带斜杠),其后添加jira bugId接口拼接成完整地址,若无请放空
jira_borwse_url=http://jira.soundbus.tech/browse/
```