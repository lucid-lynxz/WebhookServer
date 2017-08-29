package org.lynxz.server.bean;

/**
 * Created by lynxz on 22/03/2017.
 * 钉钉发送text类型消息实体
 */
public class MessageTextBean {

    /**
     * touser : manager104
     * agentid : 8028911
     * msgtype : text
     * text : {"content":"测试[链接](http://www.baidu.com)"}
     */
    private String touser;
    private String agentid;
    private String msgtype;
    private TextBean text;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public TextBean getText() {
        return text;
    }

    public void setText(TextBean text) {
        this.text = text;
    }

    public static class TextBean {
        /**
         * content : 测试[链接](http://www.baidu.com)
         */

        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
