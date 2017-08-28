> 使用Gradle和Kotlin重写一下之前 [钉钉通知服务器](https://github.com/lucid-lynxz/Webhook_server) 顺便再熟悉下服务端基本编写操作

clone项目后,请在项目根目录下创建 `webapp/WEB-INF/config.properties` 并设置如下属性值,以便获取钉钉相关参数
```properties
# 企业在钉钉中的标识，每个企业拥有一个唯一的CorpID
corpid=******
# 企业每个应用的凭证密钥
corpsecret=******
# 钉钉微应用id
agentId=******
```