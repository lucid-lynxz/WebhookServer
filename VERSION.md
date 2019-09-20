## version 'V0.1.5'
1. 添加 `log4j2.xml`,保存日志在 `logs/log4j2/` 下

## version V0.1.6 @2019.9.20
1. 升级kotlin到1.3.50
2. 获取部分通讯录详情信息
3. 可通过手机号或者用户备注信息来定位目标用户
4. 可通过post请求 `{server}/action/send_msg` 来发送钉钉消息给指定用户或群组,body内容如下
```json
{
  "name":"", 
  "mobile":"",
  "content":"",
  "departmentName":""
}
```

其中:
* `name` 可空,表示用户名或备注信息
* `mobile` 可空,表示目标用户手机号
* `content` 要发送的消息
* `departmentName` 部门名称, 若用户信息为空,则群发给部门所有人
