package org.lynxz.server.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lynxz on 23/03/2017.
 * jira上bug更新的hook通知
 */
public class JiraBugEventBean {

    /**
     * webhookEvent : jira:issue_updated
     * user : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true}
     * issue : {"id":"15207","self":"http://jira.soundbus.tech/rest/api/2/issue/15207","key":"UPLUSGO-1241","fields":{"issuetype":{"self":"http://jira.soundbus.tech/rest/api/2/issuetype/1","id":"1","description":"A problem which impairs or prevents the functions of the product.","iconUrl":"http://jira.soundbus.tech/images/icons/issuetypes/bug.png","name":"Bug","subtask":false},"components":[],"timespent":null,"timeoriginalestimate":null,"description":"??\r\nU?????/??U????????????????","project":{"self":"http://jira.soundbus.tech/rest/api/2/project/10002","id":"10002","key":"UPLUSGO","name":"???","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/projectavatar?pid=10002&avatarId=10401","24x24":"http://jira.soundbus.tech/secure/projectavatar?size=small&pid=10002&avatarId=10401","16x16":"http://jira.soundbus.tech/secure/projectavatar?size=xsmall&pid=10002&avatarId=10401","32x32":"http://jira.soundbus.tech/secure/projectavatar?size=medium&pid=10002&avatarId=10401"}},"fixVersions":[],"aggregatetimespent":null,"resolution":null,"timetracking":{},"customfield_10005":null,"customfield_10401":null,"customfield_10006":null,"attachment":[{"self":"http://jira.soundbus.tech/rest/api/2/attachment/11657","id":"11657","filename":"848225703055210449.jpg","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true},"created":"2017-03-22T14:01:04.000+0800","size":42041,"mimeType":"image/jpeg","content":"http://jira.soundbus.tech/secure/attachment/11657/848225703055210449.jpg","thumbnail":"http://jira.soundbus.tech/secure/thumbnail/11657/_thumb_11657.png"},{"self":"http://jira.soundbus.tech/rest/api/2/attachment/11677","id":"11677","filename":"????.png","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.000+0800","size":105050,"mimeType":"image/png","content":"http://jira.soundbus.tech/secure/attachment/11677/%E7%B2%98%E8%B4%B4%E5%9B%BE%E7%89%87.png","thumbnail":"http://jira.soundbus.tech/secure/thumbnail/11677/_thumb_11677.png"}],"aggregatetimeestimate":null,"resolutiondate":null,"workratio":-1,"summary":"Bug_??_android_U?????/??U????????","lastViewed":"2017-03-22T18:27:35.124+0800","watches":{"self":"http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/watchers","watchCount":1,"isWatching":true},"creator":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true},"subtasks":[],"created":"2017-03-22T14:01:04.000+0800","reporter":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true},"customfield_10000":null,"aggregateprogress":{"progress":0,"total":0},"priority":{"self":"http://jira.soundbus.tech/rest/api/2/priority/3","iconUrl":"http://jira.soundbus.tech/images/icons/priorities/major.png","name":"Major","id":"3"},"customfield_10001":null,"customfield_10100":null,"customfield_10002":null,"customfield_10200":"??v8?android7.0?","customfield_10300":null,"labels":["v0.0.13"],"customfield_10004":"3201","environment":"????","timeestimate":null,"aggregatetimeoriginalestimate":null,"versions":[],"duedate":"2017-03-22","progress":{"progress":0,"total":0},"comment":{"startAt":0,"maxResults":1,"total":1,"comments":[{"self":"http://jira.soundbus.tech/rest/api/2/issue/15207/comment/13499","id":"13499","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"body":"??????????????","updateAuthor":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.000+0800","updated":"2017-03-22T18:27:35.000+0800"}]},"issuelinks":[],"votes":{"self":"http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/votes","votes":0,"hasVoted":false},"worklog":{"startAt":0,"maxResults":20,"total":0,"worklogs":[]},"assignee":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"updated":"2017-03-22T18:27:35.000+0800","status":{"self":"http://jira.soundbus.tech/rest/api/2/status/1","description":"The issue is open and ready for the assignee to start work on it.","iconUrl":"http://jira.soundbus.tech/images/icons/statuses/open.png","name":"Open","id":"1","statusCategory":{"self":"http://jira.soundbus.tech/rest/api/2/statuscategory/2","id":2,"key":"new","colorName":"blue-gray","name":"New"}}}}
     * changelog : {"id":"32135","items":[{"field":"Attachment","fieldtype":"jira","from":null,"fromString":null,"to":"11677","toString":"????.png"}]}
     * comment : {"self":"http://jira.soundbus.tech/rest/api/2/issue/15207/comment/13499","id":"13499","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"body":"??????????????","updateAuthor":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.146+0800","updated":"2017-03-22T18:27:35.146+0800"}
     * timestamp : 1490178455153
     */
    private String webhookEvent;
    private UserBean user;
    private IssueBean issue;
    private ChangelogBean changelog;
    private CommentBeanX comment;
    private long timestamp;

    public String getWebhookEvent() {
        return webhookEvent;
    }

    public void setWebhookEvent(String webhookEvent) {
        this.webhookEvent = webhookEvent;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public IssueBean getIssue() {
        return issue;
    }

    public void setIssue(IssueBean issue) {
        this.issue = issue;
    }

    public ChangelogBean getChangelog() {
        return changelog;
    }

    public void setChangelog(ChangelogBean changelog) {
        this.changelog = changelog;
    }

    public CommentBeanX getComment() {
        return comment;
    }

    public void setComment(CommentBeanX comment) {
        this.comment = comment;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static class UserBean {
        /**
         * self : http://jira.soundbus.tech/rest/api/2/user?username=lynxz
         * name : lynxz
         * emailAddress : lynxz@soundnet.com.cn
         * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"}
         * displayName : ???
         * active : true
         */

        private String self;
        private String name;
        private String emailAddress;
        private AvatarUrlsBean avatarUrls;
        private String displayName;
        private boolean active;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public AvatarUrlsBean getAvatarUrls() {
            return avatarUrls;
        }

        public void setAvatarUrls(AvatarUrlsBean avatarUrls) {
            this.avatarUrls = avatarUrls;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public static class AvatarUrlsBean {
            /**
             * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900
             * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900
             * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900
             * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900
             */

            @SerializedName("48x48")
            private String _$48x48;
            @SerializedName("24x24")
            private String _$24x24;
            @SerializedName("16x16")
            private String _$16x16;
            @SerializedName("32x32")
            private String _$32x32;

            public String get_$48x48() {
                return _$48x48;
            }

            public void set_$48x48(String _$48x48) {
                this._$48x48 = _$48x48;
            }

            public String get_$24x24() {
                return _$24x24;
            }

            public void set_$24x24(String _$24x24) {
                this._$24x24 = _$24x24;
            }

            public String get_$16x16() {
                return _$16x16;
            }

            public void set_$16x16(String _$16x16) {
                this._$16x16 = _$16x16;
            }

            public String get_$32x32() {
                return _$32x32;
            }

            public void set_$32x32(String _$32x32) {
                this._$32x32 = _$32x32;
            }
        }
    }

    public static class IssueBean {
        /**
         * id : 15207
         * self : http://jira.soundbus.tech/rest/api/2/issue/15207
         * key : UPLUSGO-1241
         * fields : {"issuetype":{"self":"http://jira.soundbus.tech/rest/api/2/issuetype/1","id":"1","description":"A problem which impairs or prevents the functions of the product.","iconUrl":"http://jira.soundbus.tech/images/icons/issuetypes/bug.png","name":"Bug","subtask":false},"components":[],"timespent":null,"timeoriginalestimate":null,"description":"??\r\nU?????/??U????????????????","project":{"self":"http://jira.soundbus.tech/rest/api/2/project/10002","id":"10002","key":"UPLUSGO","name":"???","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/projectavatar?pid=10002&avatarId=10401","24x24":"http://jira.soundbus.tech/secure/projectavatar?size=small&pid=10002&avatarId=10401","16x16":"http://jira.soundbus.tech/secure/projectavatar?size=xsmall&pid=10002&avatarId=10401","32x32":"http://jira.soundbus.tech/secure/projectavatar?size=medium&pid=10002&avatarId=10401"}},"fixVersions":[],"aggregatetimespent":null,"resolution":null,"timetracking":{},"customfield_10005":null,"customfield_10401":null,"customfield_10006":null,"attachment":[{"self":"http://jira.soundbus.tech/rest/api/2/attachment/11657","id":"11657","filename":"848225703055210449.jpg","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true},"created":"2017-03-22T14:01:04.000+0800","size":42041,"mimeType":"image/jpeg","content":"http://jira.soundbus.tech/secure/attachment/11657/848225703055210449.jpg","thumbnail":"http://jira.soundbus.tech/secure/thumbnail/11657/_thumb_11657.png"},{"self":"http://jira.soundbus.tech/rest/api/2/attachment/11677","id":"11677","filename":"????.png","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.000+0800","size":105050,"mimeType":"image/png","content":"http://jira.soundbus.tech/secure/attachment/11677/%E7%B2%98%E8%B4%B4%E5%9B%BE%E7%89%87.png","thumbnail":"http://jira.soundbus.tech/secure/thumbnail/11677/_thumb_11677.png"}],"aggregatetimeestimate":null,"resolutiondate":null,"workratio":-1,"summary":"Bug_??_android_U?????/??U????????","lastViewed":"2017-03-22T18:27:35.124+0800","watches":{"self":"http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/watchers","watchCount":1,"isWatching":true},"creator":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true},"subtasks":[],"created":"2017-03-22T14:01:04.000+0800","reporter":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true},"customfield_10000":null,"aggregateprogress":{"progress":0,"total":0},"priority":{"self":"http://jira.soundbus.tech/rest/api/2/priority/3","iconUrl":"http://jira.soundbus.tech/images/icons/priorities/major.png","name":"Major","id":"3"},"customfield_10001":null,"customfield_10100":null,"customfield_10002":null,"customfield_10200":"??v8?android7.0?","customfield_10300":null,"labels":["v0.0.13"],"customfield_10004":"3201","environment":"????","timeestimate":null,"aggregatetimeoriginalestimate":null,"versions":[],"duedate":"2017-03-22","progress":{"progress":0,"total":0},"comment":{"startAt":0,"maxResults":1,"total":1,"comments":[{"self":"http://jira.soundbus.tech/rest/api/2/issue/15207/comment/13499","id":"13499","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"body":"??????????????","updateAuthor":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.000+0800","updated":"2017-03-22T18:27:35.000+0800"}]},"issuelinks":[],"votes":{"self":"http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/votes","votes":0,"hasVoted":false},"worklog":{"startAt":0,"maxResults":20,"total":0,"worklogs":[]},"assignee":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"updated":"2017-03-22T18:27:35.000+0800","status":{"self":"http://jira.soundbus.tech/rest/api/2/status/1","description":"The issue is open and ready for the assignee to start work on it.","iconUrl":"http://jira.soundbus.tech/images/icons/statuses/open.png","name":"Open","id":"1","statusCategory":{"self":"http://jira.soundbus.tech/rest/api/2/statuscategory/2","id":2,"key":"new","colorName":"blue-gray","name":"New"}}}
         */

        private String id;
        private String self;
        private String key;
        private FieldsBean fields;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public FieldsBean getFields() {
            return fields;
        }

        public void setFields(FieldsBean fields) {
            this.fields = fields;
        }

        public static class FieldsBean {
            /**
             * issuetype : {"self":"http://jira.soundbus.tech/rest/api/2/issuetype/1","id":"1","description":"A problem which impairs or prevents the functions of the product.","iconUrl":"http://jira.soundbus.tech/images/icons/issuetypes/bug.png","name":"Bug","subtask":false}
             * components : []
             * timespent : null
             * timeoriginalestimate : null
             * description : ??
             * U?????/??U????????????????
             * project : {"self":"http://jira.soundbus.tech/rest/api/2/project/10002","id":"10002","key":"UPLUSGO","name":"???","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/projectavatar?pid=10002&avatarId=10401","24x24":"http://jira.soundbus.tech/secure/projectavatar?size=small&pid=10002&avatarId=10401","16x16":"http://jira.soundbus.tech/secure/projectavatar?size=xsmall&pid=10002&avatarId=10401","32x32":"http://jira.soundbus.tech/secure/projectavatar?size=medium&pid=10002&avatarId=10401"}}
             * fixVersions : []
             * aggregatetimespent : null
             * resolution : null
             * timetracking : {}
             * customfield_10005 : null
             * customfield_10401 : null
             * customfield_10006 : null
             * attachment : [{"self":"http://jira.soundbus.tech/rest/api/2/attachment/11657","id":"11657","filename":"848225703055210449.jpg","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true},"created":"2017-03-22T14:01:04.000+0800","size":42041,"mimeType":"image/jpeg","content":"http://jira.soundbus.tech/secure/attachment/11657/848225703055210449.jpg","thumbnail":"http://jira.soundbus.tech/secure/thumbnail/11657/_thumb_11657.png"},{"self":"http://jira.soundbus.tech/rest/api/2/attachment/11677","id":"11677","filename":"????.png","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.000+0800","size":105050,"mimeType":"image/png","content":"http://jira.soundbus.tech/secure/attachment/11677/%E7%B2%98%E8%B4%B4%E5%9B%BE%E7%89%87.png","thumbnail":"http://jira.soundbus.tech/secure/thumbnail/11677/_thumb_11677.png"}]
             * aggregatetimeestimate : null
             * resolutiondate : null
             * workratio : -1
             * summary : Bug_??_android_U?????/??U????????
             * lastViewed : 2017-03-22T18:27:35.124+0800
             * watches : {"self":"http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/watchers","watchCount":1,"isWatching":true}
             * creator : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true}
             * subtasks : []
             * created : 2017-03-22T14:01:04.000+0800
             * reporter : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true}
             * customfield_10000 : null
             * aggregateprogress : {"progress":0,"total":0}
             * priority : {"self":"http://jira.soundbus.tech/rest/api/2/priority/3","iconUrl":"http://jira.soundbus.tech/images/icons/priorities/major.png","name":"Major","id":"3"}
             * customfield_10001 : null
             * customfield_10100 : null
             * customfield_10002 : null
             * customfield_10200 : ??v8?android7.0?
             * customfield_10300 : null
             * labels : ["v0.0.13"]
             * customfield_10004 : 3201
             * environment : ????
             * timeestimate : null
             * aggregatetimeoriginalestimate : null
             * versions : []
             * duedate : 2017-03-22
             * progress : {"progress":0,"total":0}
             * comment : {"startAt":0,"maxResults":1,"total":1,"comments":[{"self":"http://jira.soundbus.tech/rest/api/2/issue/15207/comment/13499","id":"13499","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"body":"??????????????","updateAuthor":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.000+0800","updated":"2017-03-22T18:27:35.000+0800"}]}
             * issuelinks : []
             * votes : {"self":"http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/votes","votes":0,"hasVoted":false}
             * worklog : {"startAt":0,"maxResults":20,"total":0,"worklogs":[]}
             * assignee : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true}
             * updated : 2017-03-22T18:27:35.000+0800
             * status : {"self":"http://jira.soundbus.tech/rest/api/2/status/1","description":"The issue is open and ready for the assignee to start work on it.","iconUrl":"http://jira.soundbus.tech/images/icons/statuses/open.png","name":"Open","id":"1","statusCategory":{"self":"http://jira.soundbus.tech/rest/api/2/statuscategory/2","id":2,"key":"new","colorName":"blue-gray","name":"New"}}
             */

            private IssuetypeBean issuetype;
            private Object timespent;
            private Object timeoriginalestimate;
            private String description;
            private ProjectBean project;
            private Object aggregatetimespent;
            private Object resolution;
            private TimetrackingBean timetracking;
            private Object customfield_10005;
            private Object customfield_10401;
            private Object customfield_10006;
            private Object aggregatetimeestimate;
            private Object resolutiondate;
            private int workratio;
            private String summary;
            private String lastViewed;
            private WatchesBean watches;
            private CreatorBean creator;
            private String created;
            private ReporterBean reporter;
            private Object customfield_10000;
            private AggregateprogressBean aggregateprogress;
            private PriorityBean priority;
            private Object customfield_10001;
            private Object customfield_10100;
            private Object customfield_10002;
            private String customfield_10200;
            private Object customfield_10300;
            private String customfield_10004;
            private String environment;
            private Object timeestimate;
            private Object aggregatetimeoriginalestimate;
            private String duedate;
            private ProgressBean progress;
            private CommentBean comment;
            private VotesBean votes;
            private WorklogBean worklog;
            private AssigneeBean assignee;
            private String updated;
            private StatusBean status;
            private List<?> components;
            private List<?> fixVersions;
            private List<AttachmentBean> attachment;
            private List<?> subtasks;
            private List<String> labels;
            private List<?> versions;
            private List<?> issuelinks;

            public IssuetypeBean getIssuetype() {
                return issuetype;
            }

            public void setIssuetype(IssuetypeBean issuetype) {
                this.issuetype = issuetype;
            }

            public Object getTimespent() {
                return timespent;
            }

            public void setTimespent(Object timespent) {
                this.timespent = timespent;
            }

            public Object getTimeoriginalestimate() {
                return timeoriginalestimate;
            }

            public void setTimeoriginalestimate(Object timeoriginalestimate) {
                this.timeoriginalestimate = timeoriginalestimate;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public ProjectBean getProject() {
                return project;
            }

            public void setProject(ProjectBean project) {
                this.project = project;
            }

            public Object getAggregatetimespent() {
                return aggregatetimespent;
            }

            public void setAggregatetimespent(Object aggregatetimespent) {
                this.aggregatetimespent = aggregatetimespent;
            }

            public Object getResolution() {
                return resolution;
            }

            public void setResolution(Object resolution) {
                this.resolution = resolution;
            }

            public TimetrackingBean getTimetracking() {
                return timetracking;
            }

            public void setTimetracking(TimetrackingBean timetracking) {
                this.timetracking = timetracking;
            }

            public Object getCustomfield_10005() {
                return customfield_10005;
            }

            public void setCustomfield_10005(Object customfield_10005) {
                this.customfield_10005 = customfield_10005;
            }

            public Object getCustomfield_10401() {
                return customfield_10401;
            }

            public void setCustomfield_10401(Object customfield_10401) {
                this.customfield_10401 = customfield_10401;
            }

            public Object getCustomfield_10006() {
                return customfield_10006;
            }

            public void setCustomfield_10006(Object customfield_10006) {
                this.customfield_10006 = customfield_10006;
            }

            public Object getAggregatetimeestimate() {
                return aggregatetimeestimate;
            }

            public void setAggregatetimeestimate(Object aggregatetimeestimate) {
                this.aggregatetimeestimate = aggregatetimeestimate;
            }

            public Object getResolutiondate() {
                return resolutiondate;
            }

            public void setResolutiondate(Object resolutiondate) {
                this.resolutiondate = resolutiondate;
            }

            public int getWorkratio() {
                return workratio;
            }

            public void setWorkratio(int workratio) {
                this.workratio = workratio;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getLastViewed() {
                return lastViewed;
            }

            public void setLastViewed(String lastViewed) {
                this.lastViewed = lastViewed;
            }

            public WatchesBean getWatches() {
                return watches;
            }

            public void setWatches(WatchesBean watches) {
                this.watches = watches;
            }

            public CreatorBean getCreator() {
                return creator;
            }

            public void setCreator(CreatorBean creator) {
                this.creator = creator;
            }

            public String getCreated() {
                return created;
            }

            public void setCreated(String created) {
                this.created = created;
            }

            public ReporterBean getReporter() {
                return reporter;
            }

            public void setReporter(ReporterBean reporter) {
                this.reporter = reporter;
            }

            public Object getCustomfield_10000() {
                return customfield_10000;
            }

            public void setCustomfield_10000(Object customfield_10000) {
                this.customfield_10000 = customfield_10000;
            }

            public AggregateprogressBean getAggregateprogress() {
                return aggregateprogress;
            }

            public void setAggregateprogress(AggregateprogressBean aggregateprogress) {
                this.aggregateprogress = aggregateprogress;
            }

            public PriorityBean getPriority() {
                return priority;
            }

            public void setPriority(PriorityBean priority) {
                this.priority = priority;
            }

            public Object getCustomfield_10001() {
                return customfield_10001;
            }

            public void setCustomfield_10001(Object customfield_10001) {
                this.customfield_10001 = customfield_10001;
            }

            public Object getCustomfield_10100() {
                return customfield_10100;
            }

            public void setCustomfield_10100(Object customfield_10100) {
                this.customfield_10100 = customfield_10100;
            }

            public Object getCustomfield_10002() {
                return customfield_10002;
            }

            public void setCustomfield_10002(Object customfield_10002) {
                this.customfield_10002 = customfield_10002;
            }

            public String getCustomfield_10200() {
                return customfield_10200;
            }

            public void setCustomfield_10200(String customfield_10200) {
                this.customfield_10200 = customfield_10200;
            }

            public Object getCustomfield_10300() {
                return customfield_10300;
            }

            public void setCustomfield_10300(Object customfield_10300) {
                this.customfield_10300 = customfield_10300;
            }

            public String getCustomfield_10004() {
                return customfield_10004;
            }

            public void setCustomfield_10004(String customfield_10004) {
                this.customfield_10004 = customfield_10004;
            }

            public String getEnvironment() {
                return environment;
            }

            public void setEnvironment(String environment) {
                this.environment = environment;
            }

            public Object getTimeestimate() {
                return timeestimate;
            }

            public void setTimeestimate(Object timeestimate) {
                this.timeestimate = timeestimate;
            }

            public Object getAggregatetimeoriginalestimate() {
                return aggregatetimeoriginalestimate;
            }

            public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
                this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
            }

            public String getDuedate() {
                return duedate;
            }

            public void setDuedate(String duedate) {
                this.duedate = duedate;
            }

            public ProgressBean getProgress() {
                return progress;
            }

            public void setProgress(ProgressBean progress) {
                this.progress = progress;
            }

            public CommentBean getComment() {
                return comment;
            }

            public void setComment(CommentBean comment) {
                this.comment = comment;
            }

            public VotesBean getVotes() {
                return votes;
            }

            public void setVotes(VotesBean votes) {
                this.votes = votes;
            }

            public WorklogBean getWorklog() {
                return worklog;
            }

            public void setWorklog(WorklogBean worklog) {
                this.worklog = worklog;
            }

            public AssigneeBean getAssignee() {
                return assignee;
            }

            public void setAssignee(AssigneeBean assignee) {
                this.assignee = assignee;
            }

            public String getUpdated() {
                return updated;
            }

            public void setUpdated(String updated) {
                this.updated = updated;
            }

            public StatusBean getStatus() {
                return status;
            }

            public void setStatus(StatusBean status) {
                this.status = status;
            }

            public List<?> getComponents() {
                return components;
            }

            public void setComponents(List<?> components) {
                this.components = components;
            }

            public List<?> getFixVersions() {
                return fixVersions;
            }

            public void setFixVersions(List<?> fixVersions) {
                this.fixVersions = fixVersions;
            }

            public List<AttachmentBean> getAttachment() {
                return attachment;
            }

            public void setAttachment(List<AttachmentBean> attachment) {
                this.attachment = attachment;
            }

            public List<?> getSubtasks() {
                return subtasks;
            }

            public void setSubtasks(List<?> subtasks) {
                this.subtasks = subtasks;
            }

            public List<String> getLabels() {
                return labels;
            }

            public void setLabels(List<String> labels) {
                this.labels = labels;
            }

            public List<?> getVersions() {
                return versions;
            }

            public void setVersions(List<?> versions) {
                this.versions = versions;
            }

            public List<?> getIssuelinks() {
                return issuelinks;
            }

            public void setIssuelinks(List<?> issuelinks) {
                this.issuelinks = issuelinks;
            }

            public static class IssuetypeBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/issuetype/1
                 * id : 1
                 * description : A problem which impairs or prevents the functions of the product.
                 * iconUrl : http://jira.soundbus.tech/images/icons/issuetypes/bug.png
                 * name : Bug
                 * subtask : false
                 */

                private String self;
                private String id;
                private String description;
                private String iconUrl;
                private String name;
                private boolean subtask;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getIconUrl() {
                    return iconUrl;
                }

                public void setIconUrl(String iconUrl) {
                    this.iconUrl = iconUrl;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public boolean isSubtask() {
                    return subtask;
                }

                public void setSubtask(boolean subtask) {
                    this.subtask = subtask;
                }
            }

            public static class ProjectBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/project/10002
                 * id : 10002
                 * key : UPLUSGO
                 * name : ???
                 * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/projectavatar?pid=10002&avatarId=10401","24x24":"http://jira.soundbus.tech/secure/projectavatar?size=small&pid=10002&avatarId=10401","16x16":"http://jira.soundbus.tech/secure/projectavatar?size=xsmall&pid=10002&avatarId=10401","32x32":"http://jira.soundbus.tech/secure/projectavatar?size=medium&pid=10002&avatarId=10401"}
                 */

                private String self;
                private String id;
                private String key;
                private String name;
                private AvatarUrlsBean avatarUrls;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public AvatarUrlsBean getAvatarUrls() {
                    return avatarUrls;
                }

                public void setAvatarUrls(AvatarUrlsBean avatarUrls) {
                    this.avatarUrls = avatarUrls;
                }

                public static class AvatarUrlsBean {
                    /**
                     * 48x48 : http://jira.soundbus.tech/secure/projectavatar?pid=10002&avatarId=10401
                     * 24x24 : http://jira.soundbus.tech/secure/projectavatar?size=small&pid=10002&avatarId=10401
                     * 16x16 : http://jira.soundbus.tech/secure/projectavatar?size=xsmall&pid=10002&avatarId=10401
                     * 32x32 : http://jira.soundbus.tech/secure/projectavatar?size=medium&pid=10002&avatarId=10401
                     */

                    @SerializedName("48x48")
                    private String _$48x48;
                    @SerializedName("24x24")
                    private String _$24x24;
                    @SerializedName("16x16")
                    private String _$16x16;
                    @SerializedName("32x32")
                    private String _$32x32;

                    public String get_$48x48() {
                        return _$48x48;
                    }

                    public void set_$48x48(String _$48x48) {
                        this._$48x48 = _$48x48;
                    }

                    public String get_$24x24() {
                        return _$24x24;
                    }

                    public void set_$24x24(String _$24x24) {
                        this._$24x24 = _$24x24;
                    }

                    public String get_$16x16() {
                        return _$16x16;
                    }

                    public void set_$16x16(String _$16x16) {
                        this._$16x16 = _$16x16;
                    }

                    public String get_$32x32() {
                        return _$32x32;
                    }

                    public void set_$32x32(String _$32x32) {
                        this._$32x32 = _$32x32;
                    }
                }
            }

            public static class TimetrackingBean {
            }

            public static class WatchesBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/watchers
                 * watchCount : 1
                 * isWatching : true
                 */

                private String self;
                private int watchCount;
                private boolean isWatching;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public int getWatchCount() {
                    return watchCount;
                }

                public void setWatchCount(int watchCount) {
                    this.watchCount = watchCount;
                }

                public boolean isIsWatching() {
                    return isWatching;
                }

                public void setIsWatching(boolean isWatching) {
                    this.isWatching = isWatching;
                }
            }

            public static class CreatorBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/user?username=chenxm
                 * name : chenxm
                 * emailAddress : chenxm@soundnet.com.cn
                 * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"}
                 * displayName : ??
                 * active : true
                 */

                private String self;
                private String name;
                private String emailAddress;
                private AvatarUrlsBeanXX avatarUrls;
                private String displayName;
                private boolean active;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmailAddress() {
                    return emailAddress;
                }

                public void setEmailAddress(String emailAddress) {
                    this.emailAddress = emailAddress;
                }

                public AvatarUrlsBeanXX getAvatarUrls() {
                    return avatarUrls;
                }

                public void setAvatarUrls(AvatarUrlsBeanXX avatarUrls) {
                    this.avatarUrls = avatarUrls;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public boolean isActive() {
                    return active;
                }

                public void setActive(boolean active) {
                    this.active = active;
                }

                public static class AvatarUrlsBeanXX {
                    /**
                     * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612
                     * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612
                     * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612
                     * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612
                     */

                    @SerializedName("48x48")
                    private String _$48x48;
                    @SerializedName("24x24")
                    private String _$24x24;
                    @SerializedName("16x16")
                    private String _$16x16;
                    @SerializedName("32x32")
                    private String _$32x32;

                    public String get_$48x48() {
                        return _$48x48;
                    }

                    public void set_$48x48(String _$48x48) {
                        this._$48x48 = _$48x48;
                    }

                    public String get_$24x24() {
                        return _$24x24;
                    }

                    public void set_$24x24(String _$24x24) {
                        this._$24x24 = _$24x24;
                    }

                    public String get_$16x16() {
                        return _$16x16;
                    }

                    public void set_$16x16(String _$16x16) {
                        this._$16x16 = _$16x16;
                    }

                    public String get_$32x32() {
                        return _$32x32;
                    }

                    public void set_$32x32(String _$32x32) {
                        this._$32x32 = _$32x32;
                    }
                }
            }

            public static class ReporterBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/user?username=chenxm
                 * name : chenxm
                 * emailAddress : chenxm@soundnet.com.cn
                 * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"}
                 * displayName : ??
                 * active : true
                 */

                private String self;
                private String name;
                private String emailAddress;
                private AvatarUrlsBeanXXX avatarUrls;
                private String displayName;
                private boolean active;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmailAddress() {
                    return emailAddress;
                }

                public void setEmailAddress(String emailAddress) {
                    this.emailAddress = emailAddress;
                }

                public AvatarUrlsBeanXXX getAvatarUrls() {
                    return avatarUrls;
                }

                public void setAvatarUrls(AvatarUrlsBeanXXX avatarUrls) {
                    this.avatarUrls = avatarUrls;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public boolean isActive() {
                    return active;
                }

                public void setActive(boolean active) {
                    this.active = active;
                }

                public static class AvatarUrlsBeanXXX {
                    /**
                     * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612
                     * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612
                     * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612
                     * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612
                     */

                    @SerializedName("48x48")
                    private String _$48x48;
                    @SerializedName("24x24")
                    private String _$24x24;
                    @SerializedName("16x16")
                    private String _$16x16;
                    @SerializedName("32x32")
                    private String _$32x32;

                    public String get_$48x48() {
                        return _$48x48;
                    }

                    public void set_$48x48(String _$48x48) {
                        this._$48x48 = _$48x48;
                    }

                    public String get_$24x24() {
                        return _$24x24;
                    }

                    public void set_$24x24(String _$24x24) {
                        this._$24x24 = _$24x24;
                    }

                    public String get_$16x16() {
                        return _$16x16;
                    }

                    public void set_$16x16(String _$16x16) {
                        this._$16x16 = _$16x16;
                    }

                    public String get_$32x32() {
                        return _$32x32;
                    }

                    public void set_$32x32(String _$32x32) {
                        this._$32x32 = _$32x32;
                    }
                }
            }

            public static class AggregateprogressBean {
                /**
                 * progress : 0
                 * total : 0
                 */

                private int progress;
                private int total;

                public int getProgress() {
                    return progress;
                }

                public void setProgress(int progress) {
                    this.progress = progress;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }
            }

            public static class PriorityBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/priority/3
                 * iconUrl : http://jira.soundbus.tech/images/icons/priorities/major.png
                 * name : Major
                 * id : 3
                 */

                private String self;
                private String iconUrl;
                private String name;
                private String id;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getIconUrl() {
                    return iconUrl;
                }

                public void setIconUrl(String iconUrl) {
                    this.iconUrl = iconUrl;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }
            }

            public static class ProgressBean {
                /**
                 * progress : 0
                 * total : 0
                 */

                private int progress;
                private int total;

                public int getProgress() {
                    return progress;
                }

                public void setProgress(int progress) {
                    this.progress = progress;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }
            }

            public static class CommentBean {
                /**
                 * startAt : 0
                 * maxResults : 1
                 * total : 1
                 * comments : [{"self":"http://jira.soundbus.tech/rest/api/2/issue/15207/comment/13499","id":"13499","author":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"body":"??????????????","updateAuthor":{"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true},"created":"2017-03-22T18:27:35.000+0800","updated":"2017-03-22T18:27:35.000+0800"}]
                 */

                private int startAt;
                private int maxResults;
                private int total;
                private List<CommentsBean> comments;

                public int getStartAt() {
                    return startAt;
                }

                public void setStartAt(int startAt) {
                    this.startAt = startAt;
                }

                public int getMaxResults() {
                    return maxResults;
                }

                public void setMaxResults(int maxResults) {
                    this.maxResults = maxResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public List<CommentsBean> getComments() {
                    return comments;
                }

                public void setComments(List<CommentsBean> comments) {
                    this.comments = comments;
                }

                public static class CommentsBean {
                    /**
                     * self : http://jira.soundbus.tech/rest/api/2/issue/15207/comment/13499
                     * id : 13499
                     * author : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true}
                     * body : ??????????????
                     * updateAuthor : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true}
                     * created : 2017-03-22T18:27:35.000+0800
                     * updated : 2017-03-22T18:27:35.000+0800
                     */

                    private String self;
                    private String id;
                    private AuthorBean author;
                    private String body;
                    private UpdateAuthorBean updateAuthor;
                    private String created;
                    private String updated;

                    public String getSelf() {
                        return self;
                    }

                    public void setSelf(String self) {
                        this.self = self;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public AuthorBean getAuthor() {
                        return author;
                    }

                    public void setAuthor(AuthorBean author) {
                        this.author = author;
                    }

                    public String getBody() {
                        return body;
                    }

                    public void setBody(String body) {
                        this.body = body;
                    }

                    public UpdateAuthorBean getUpdateAuthor() {
                        return updateAuthor;
                    }

                    public void setUpdateAuthor(UpdateAuthorBean updateAuthor) {
                        this.updateAuthor = updateAuthor;
                    }

                    public String getCreated() {
                        return created;
                    }

                    public void setCreated(String created) {
                        this.created = created;
                    }

                    public String getUpdated() {
                        return updated;
                    }

                    public void setUpdated(String updated) {
                        this.updated = updated;
                    }

                    public static class AuthorBean {
                        /**
                         * self : http://jira.soundbus.tech/rest/api/2/user?username=lynxz
                         * name : lynxz
                         * emailAddress : lynxz@soundnet.com.cn
                         * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"}
                         * displayName : ???
                         * active : true
                         */

                        private String self;
                        private String name;
                        private String emailAddress;
                        private AvatarUrlsBeanXXXX avatarUrls;
                        private String displayName;
                        private boolean active;

                        public String getSelf() {
                            return self;
                        }

                        public void setSelf(String self) {
                            this.self = self;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getEmailAddress() {
                            return emailAddress;
                        }

                        public void setEmailAddress(String emailAddress) {
                            this.emailAddress = emailAddress;
                        }

                        public AvatarUrlsBeanXXXX getAvatarUrls() {
                            return avatarUrls;
                        }

                        public void setAvatarUrls(AvatarUrlsBeanXXXX avatarUrls) {
                            this.avatarUrls = avatarUrls;
                        }

                        public String getDisplayName() {
                            return displayName;
                        }

                        public void setDisplayName(String displayName) {
                            this.displayName = displayName;
                        }

                        public boolean isActive() {
                            return active;
                        }

                        public void setActive(boolean active) {
                            this.active = active;
                        }

                        public static class AvatarUrlsBeanXXXX {
                            /**
                             * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900
                             * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900
                             * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900
                             * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900
                             */

                            @SerializedName("48x48")
                            private String _$48x48;
                            @SerializedName("24x24")
                            private String _$24x24;
                            @SerializedName("16x16")
                            private String _$16x16;
                            @SerializedName("32x32")
                            private String _$32x32;

                            public String get_$48x48() {
                                return _$48x48;
                            }

                            public void set_$48x48(String _$48x48) {
                                this._$48x48 = _$48x48;
                            }

                            public String get_$24x24() {
                                return _$24x24;
                            }

                            public void set_$24x24(String _$24x24) {
                                this._$24x24 = _$24x24;
                            }

                            public String get_$16x16() {
                                return _$16x16;
                            }

                            public void set_$16x16(String _$16x16) {
                                this._$16x16 = _$16x16;
                            }

                            public String get_$32x32() {
                                return _$32x32;
                            }

                            public void set_$32x32(String _$32x32) {
                                this._$32x32 = _$32x32;
                            }
                        }
                    }

                    public static class UpdateAuthorBean {
                        /**
                         * self : http://jira.soundbus.tech/rest/api/2/user?username=lynxz
                         * name : lynxz
                         * emailAddress : lynxz@soundnet.com.cn
                         * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"}
                         * displayName : ???
                         * active : true
                         */

                        private String self;
                        private String name;
                        private String emailAddress;
                        private AvatarUrlsBeanXXXXX avatarUrls;
                        private String displayName;
                        private boolean active;

                        public String getSelf() {
                            return self;
                        }

                        public void setSelf(String self) {
                            this.self = self;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getEmailAddress() {
                            return emailAddress;
                        }

                        public void setEmailAddress(String emailAddress) {
                            this.emailAddress = emailAddress;
                        }

                        public AvatarUrlsBeanXXXXX getAvatarUrls() {
                            return avatarUrls;
                        }

                        public void setAvatarUrls(AvatarUrlsBeanXXXXX avatarUrls) {
                            this.avatarUrls = avatarUrls;
                        }

                        public String getDisplayName() {
                            return displayName;
                        }

                        public void setDisplayName(String displayName) {
                            this.displayName = displayName;
                        }

                        public boolean isActive() {
                            return active;
                        }

                        public void setActive(boolean active) {
                            this.active = active;
                        }

                        public static class AvatarUrlsBeanXXXXX {
                            /**
                             * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900
                             * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900
                             * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900
                             * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900
                             */

                            @SerializedName("48x48")
                            private String _$48x48;
                            @SerializedName("24x24")
                            private String _$24x24;
                            @SerializedName("16x16")
                            private String _$16x16;
                            @SerializedName("32x32")
                            private String _$32x32;

                            public String get_$48x48() {
                                return _$48x48;
                            }

                            public void set_$48x48(String _$48x48) {
                                this._$48x48 = _$48x48;
                            }

                            public String get_$24x24() {
                                return _$24x24;
                            }

                            public void set_$24x24(String _$24x24) {
                                this._$24x24 = _$24x24;
                            }

                            public String get_$16x16() {
                                return _$16x16;
                            }

                            public void set_$16x16(String _$16x16) {
                                this._$16x16 = _$16x16;
                            }

                            public String get_$32x32() {
                                return _$32x32;
                            }

                            public void set_$32x32(String _$32x32) {
                                this._$32x32 = _$32x32;
                            }
                        }
                    }
                }
            }

            public static class VotesBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/issue/UPLUSGO-1241/votes
                 * votes : 0
                 * hasVoted : false
                 */

                private String self;
                private int votes;
                private boolean hasVoted;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public int getVotes() {
                    return votes;
                }

                public void setVotes(int votes) {
                    this.votes = votes;
                }

                public boolean isHasVoted() {
                    return hasVoted;
                }

                public void setHasVoted(boolean hasVoted) {
                    this.hasVoted = hasVoted;
                }
            }

            public static class WorklogBean {
                /**
                 * startAt : 0
                 * maxResults : 20
                 * total : 0
                 * worklogs : []
                 */

                private int startAt;
                private int maxResults;
                private int total;
                private List<?> worklogs;

                public int getStartAt() {
                    return startAt;
                }

                public void setStartAt(int startAt) {
                    this.startAt = startAt;
                }

                public int getMaxResults() {
                    return maxResults;
                }

                public void setMaxResults(int maxResults) {
                    this.maxResults = maxResults;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public List<?> getWorklogs() {
                    return worklogs;
                }

                public void setWorklogs(List<?> worklogs) {
                    this.worklogs = worklogs;
                }
            }

            public static class AssigneeBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/user?username=lynxz
                 * name : lynxz
                 * emailAddress : lynxz@soundnet.com.cn
                 * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"}
                 * displayName : ???
                 * active : true
                 */

                private String self;
                private String name;
                private String emailAddress;
                private AvatarUrlsBeanXXXXXX avatarUrls;
                private String displayName;
                private boolean active;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getEmailAddress() {
                    return emailAddress;
                }

                public void setEmailAddress(String emailAddress) {
                    this.emailAddress = emailAddress;
                }

                public AvatarUrlsBeanXXXXXX getAvatarUrls() {
                    return avatarUrls;
                }

                public void setAvatarUrls(AvatarUrlsBeanXXXXXX avatarUrls) {
                    this.avatarUrls = avatarUrls;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public boolean isActive() {
                    return active;
                }

                public void setActive(boolean active) {
                    this.active = active;
                }

                public static class AvatarUrlsBeanXXXXXX {
                    /**
                     * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900
                     * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900
                     * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900
                     * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900
                     */

                    @SerializedName("48x48")
                    private String _$48x48;
                    @SerializedName("24x24")
                    private String _$24x24;
                    @SerializedName("16x16")
                    private String _$16x16;
                    @SerializedName("32x32")
                    private String _$32x32;

                    public String get_$48x48() {
                        return _$48x48;
                    }

                    public void set_$48x48(String _$48x48) {
                        this._$48x48 = _$48x48;
                    }

                    public String get_$24x24() {
                        return _$24x24;
                    }

                    public void set_$24x24(String _$24x24) {
                        this._$24x24 = _$24x24;
                    }

                    public String get_$16x16() {
                        return _$16x16;
                    }

                    public void set_$16x16(String _$16x16) {
                        this._$16x16 = _$16x16;
                    }

                    public String get_$32x32() {
                        return _$32x32;
                    }

                    public void set_$32x32(String _$32x32) {
                        this._$32x32 = _$32x32;
                    }
                }
            }

            public static class StatusBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/status/1
                 * description : The issue is open and ready for the assignee to start work on it.
                 * iconUrl : http://jira.soundbus.tech/images/icons/statuses/open.png
                 * name : Open
                 * id : 1
                 * statusCategory : {"self":"http://jira.soundbus.tech/rest/api/2/statuscategory/2","id":2,"key":"new","colorName":"blue-gray","name":"New"}
                 */

                private String self;
                private String description;
                private String iconUrl;
                private String name;
                private String id;
                private StatusCategoryBean statusCategory;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getIconUrl() {
                    return iconUrl;
                }

                public void setIconUrl(String iconUrl) {
                    this.iconUrl = iconUrl;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public StatusCategoryBean getStatusCategory() {
                    return statusCategory;
                }

                public void setStatusCategory(StatusCategoryBean statusCategory) {
                    this.statusCategory = statusCategory;
                }

                public static class StatusCategoryBean {
                    /**
                     * self : http://jira.soundbus.tech/rest/api/2/statuscategory/2
                     * id : 2
                     * key : new
                     * colorName : blue-gray
                     * name : New
                     */

                    private String self;
                    private int id;
                    private String key;
                    private String colorName;
                    private String name;

                    public String getSelf() {
                        return self;
                    }

                    public void setSelf(String self) {
                        this.self = self;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getColorName() {
                        return colorName;
                    }

                    public void setColorName(String colorName) {
                        this.colorName = colorName;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }

            public static class AttachmentBean {
                /**
                 * self : http://jira.soundbus.tech/rest/api/2/attachment/11657
                 * id : 11657
                 * filename : 848225703055210449.jpg
                 * author : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=chenxm","name":"chenxm","emailAddress":"chenxm@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"},"displayName":"??","active":true}
                 * created : 2017-03-22T14:01:04.000+0800
                 * size : 42041
                 * mimeType : image/jpeg
                 * content : http://jira.soundbus.tech/secure/attachment/11657/848225703055210449.jpg
                 * thumbnail : http://jira.soundbus.tech/secure/thumbnail/11657/_thumb_11657.png
                 */

                private String self;
                private String id;
                private String filename;
                private AuthorBeanX author;
                private String created;
                private int size;
                private String mimeType;
                private String content;
                private String thumbnail;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getFilename() {
                    return filename;
                }

                public void setFilename(String filename) {
                    this.filename = filename;
                }

                public AuthorBeanX getAuthor() {
                    return author;
                }

                public void setAuthor(AuthorBeanX author) {
                    this.author = author;
                }

                public String getCreated() {
                    return created;
                }

                public void setCreated(String created) {
                    this.created = created;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public String getMimeType() {
                    return mimeType;
                }

                public void setMimeType(String mimeType) {
                    this.mimeType = mimeType;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public static class AuthorBeanX {
                    /**
                     * self : http://jira.soundbus.tech/rest/api/2/user?username=chenxm
                     * name : chenxm
                     * emailAddress : chenxm@soundnet.com.cn
                     * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612"}
                     * displayName : ??
                     * active : true
                     */

                    private String self;
                    private String name;
                    private String emailAddress;
                    private AvatarUrlsBeanXXXXXXX avatarUrls;
                    private String displayName;
                    private boolean active;

                    public String getSelf() {
                        return self;
                    }

                    public void setSelf(String self) {
                        this.self = self;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getEmailAddress() {
                        return emailAddress;
                    }

                    public void setEmailAddress(String emailAddress) {
                        this.emailAddress = emailAddress;
                    }

                    public AvatarUrlsBeanXXXXXXX getAvatarUrls() {
                        return avatarUrls;
                    }

                    public void setAvatarUrls(AvatarUrlsBeanXXXXXXX avatarUrls) {
                        this.avatarUrls = avatarUrls;
                    }

                    public String getDisplayName() {
                        return displayName;
                    }

                    public void setDisplayName(String displayName) {
                        this.displayName = displayName;
                    }

                    public boolean isActive() {
                        return active;
                    }

                    public void setActive(boolean active) {
                        this.active = active;
                    }

                    public static class AvatarUrlsBeanXXXXXXX {
                        /**
                         * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=chenxm&avatarId=10612
                         * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=chenxm&avatarId=10612
                         * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=chenxm&avatarId=10612
                         * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=chenxm&avatarId=10612
                         */

                        @SerializedName("48x48")
                        private String _$48x48;
                        @SerializedName("24x24")
                        private String _$24x24;
                        @SerializedName("16x16")
                        private String _$16x16;
                        @SerializedName("32x32")
                        private String _$32x32;

                        public String get_$48x48() {
                            return _$48x48;
                        }

                        public void set_$48x48(String _$48x48) {
                            this._$48x48 = _$48x48;
                        }

                        public String get_$24x24() {
                            return _$24x24;
                        }

                        public void set_$24x24(String _$24x24) {
                            this._$24x24 = _$24x24;
                        }

                        public String get_$16x16() {
                            return _$16x16;
                        }

                        public void set_$16x16(String _$16x16) {
                            this._$16x16 = _$16x16;
                        }

                        public String get_$32x32() {
                            return _$32x32;
                        }

                        public void set_$32x32(String _$32x32) {
                            this._$32x32 = _$32x32;
                        }
                    }
                }
            }
        }
    }

    public static class ChangelogBean {
        /**
         * id : 32135
         * items : [{"field":"Attachment","fieldtype":"jira","from":null,"fromString":null,"to":"11677","toString":"????.png"}]
         */

        private String id;
        private List<ItemsBean> items;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * field : Attachment
             * fieldtype : jira
             * from : null
             * fromString : null
             * to : 11677
             * toString : ????.png
             */

            private String field;
            private String fieldtype;
            private Object from;
            private Object fromString;
            private String to;
            private String toString;

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public String getFieldtype() {
                return fieldtype;
            }

            public void setFieldtype(String fieldtype) {
                this.fieldtype = fieldtype;
            }

            public Object getFrom() {
                return from;
            }

            public void setFrom(Object from) {
                this.from = from;
            }

            public Object getFromString() {
                return fromString;
            }

            public void setFromString(Object fromString) {
                this.fromString = fromString;
            }

            public String getTo() {
                return to;
            }

            public void setTo(String to) {
                this.to = to;
            }

            public String getToString() {
                return toString;
            }

            public void setToString(String toString) {
                this.toString = toString;
            }
        }
    }

    public static class CommentBeanX {
        /**
         * self : http://jira.soundbus.tech/rest/api/2/issue/15207/comment/13499
         * id : 13499
         * author : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true}
         * body : ??????????????
         * updateAuthor : {"self":"http://jira.soundbus.tech/rest/api/2/user?username=lynxz","name":"lynxz","emailAddress":"lynxz@soundnet.com.cn","avatarUrls":{"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"},"displayName":"???","active":true}
         * created : 2017-03-22T18:27:35.146+0800
         * updated : 2017-03-22T18:27:35.146+0800
         */

        private String self;
        private String id;
        private AuthorBeanXX author;
        private String body;
        private UpdateAuthorBeanX updateAuthor;
        private String created;
        private String updated;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public AuthorBeanXX getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBeanXX author) {
            this.author = author;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public UpdateAuthorBeanX getUpdateAuthor() {
            return updateAuthor;
        }

        public void setUpdateAuthor(UpdateAuthorBeanX updateAuthor) {
            this.updateAuthor = updateAuthor;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }

        public static class AuthorBeanXX {
            /**
             * self : http://jira.soundbus.tech/rest/api/2/user?username=lynxz
             * name : lynxz
             * emailAddress : lynxz@soundnet.com.cn
             * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"}
             * displayName : ???
             * active : true
             */

            private String self;
            private String name;
            private String emailAddress;
            private AvatarUrlsBeanXXXXXXXX avatarUrls;
            private String displayName;
            private boolean active;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmailAddress() {
                return emailAddress;
            }

            public void setEmailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
            }

            public AvatarUrlsBeanXXXXXXXX getAvatarUrls() {
                return avatarUrls;
            }

            public void setAvatarUrls(AvatarUrlsBeanXXXXXXXX avatarUrls) {
                this.avatarUrls = avatarUrls;
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }

            public boolean isActive() {
                return active;
            }

            public void setActive(boolean active) {
                this.active = active;
            }

            public static class AvatarUrlsBeanXXXXXXXX {
                /**
                 * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900
                 * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900
                 * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900
                 * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900
                 */

                @SerializedName("48x48")
                private String _$48x48;
                @SerializedName("24x24")
                private String _$24x24;
                @SerializedName("16x16")
                private String _$16x16;
                @SerializedName("32x32")
                private String _$32x32;

                public String get_$48x48() {
                    return _$48x48;
                }

                public void set_$48x48(String _$48x48) {
                    this._$48x48 = _$48x48;
                }

                public String get_$24x24() {
                    return _$24x24;
                }

                public void set_$24x24(String _$24x24) {
                    this._$24x24 = _$24x24;
                }

                public String get_$16x16() {
                    return _$16x16;
                }

                public void set_$16x16(String _$16x16) {
                    this._$16x16 = _$16x16;
                }

                public String get_$32x32() {
                    return _$32x32;
                }

                public void set_$32x32(String _$32x32) {
                    this._$32x32 = _$32x32;
                }
            }
        }

        public static class UpdateAuthorBeanX {
            /**
             * self : http://jira.soundbus.tech/rest/api/2/user?username=lynxz
             * name : lynxz
             * emailAddress : lynxz@soundnet.com.cn
             * avatarUrls : {"48x48":"http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900","24x24":"http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900","16x16":"http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900","32x32":"http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900"}
             * displayName : ???
             * active : true
             */

            private String self;
            private String name;
            private String emailAddress;
            private AvatarUrlsBeanXXXXXXXXX avatarUrls;
            private String displayName;
            private boolean active;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmailAddress() {
                return emailAddress;
            }

            public void setEmailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
            }

            public AvatarUrlsBeanXXXXXXXXX getAvatarUrls() {
                return avatarUrls;
            }

            public void setAvatarUrls(AvatarUrlsBeanXXXXXXXXX avatarUrls) {
                this.avatarUrls = avatarUrls;
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }

            public boolean isActive() {
                return active;
            }

            public void setActive(boolean active) {
                this.active = active;
            }

            public static class AvatarUrlsBeanXXXXXXXXX {
                /**
                 * 48x48 : http://jira.soundbus.tech/secure/useravatar?ownerId=lynxz&avatarId=10900
                 * 24x24 : http://jira.soundbus.tech/secure/useravatar?size=small&ownerId=lynxz&avatarId=10900
                 * 16x16 : http://jira.soundbus.tech/secure/useravatar?size=xsmall&ownerId=lynxz&avatarId=10900
                 * 32x32 : http://jira.soundbus.tech/secure/useravatar?size=medium&ownerId=lynxz&avatarId=10900
                 */

                @SerializedName("48x48")
                private String _$48x48;
                @SerializedName("24x24")
                private String _$24x24;
                @SerializedName("16x16")
                private String _$16x16;
                @SerializedName("32x32")
                private String _$32x32;

                public String get_$48x48() {
                    return _$48x48;
                }

                public void set_$48x48(String _$48x48) {
                    this._$48x48 = _$48x48;
                }

                public String get_$24x24() {
                    return _$24x24;
                }

                public void set_$24x24(String _$24x24) {
                    this._$24x24 = _$24x24;
                }

                public String get_$16x16() {
                    return _$16x16;
                }

                public void set_$16x16(String _$16x16) {
                    this._$16x16 = _$16x16;
                }

                public String get_$32x32() {
                    return _$32x32;
                }

                public void set_$32x32(String _$32x32) {
                    this._$32x32 = _$32x32;
                }
            }
        }
    }
}
