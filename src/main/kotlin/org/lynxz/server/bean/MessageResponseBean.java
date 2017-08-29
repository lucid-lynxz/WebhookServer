package org.lynxz.server.bean;

/**
 * Created by lynxz on 21/03/2017.
 * 钉钉发送消息接口的返回信息
 */
public class MessageResponseBean {

    /**
     * errcode : 0
     * errmsg : ok
     * invaliduser : UserID1|UserID2
     * invalidparty : PartyID1
     * forbiddenUserId : UserID1|UserID2
     * messageId : xxxxxxxxxxxxxxxx
     */
    private int errcode;
    private String errmsg;

    private String invaliduser;
    private String invalidparty;
    private String forbiddenUserId;
    private String messageId;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getInvaliduser() {
        return invaliduser;
    }

    public void setInvaliduser(String invaliduser) {
        this.invaliduser = invaliduser;
    }

    public String getInvalidparty() {
        return invalidparty;
    }

    public void setInvalidparty(String invalidparty) {
        this.invalidparty = invalidparty;
    }

    public String getForbiddenUserId() {
        return forbiddenUserId;
    }

    public void setForbiddenUserId(String forbiddenUserId) {
        this.forbiddenUserId = forbiddenUserId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "MessageResponseBean{" +
                "errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                ", invaliduser='" + invaliduser + '\'' +
                ", invalidparty='" + invalidparty + '\'' +
                ", forbiddenUserId='" + forbiddenUserId + '\'' +
                ", messageId='" + messageId + '\'' +
                '}';
    }
}
