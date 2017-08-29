package org.lynxz.server.bean;

import java.util.List;

/**
 * Created by lynxz on 10/04/2017.
 * 偶尔审核人merge gitlab请求通过时,gitlab发送的hook是push hook,格式如下
 */
public class GbPushRequestEventBean {

    /**
     * object_kind : push
     * before : 43b864d91ca0af1fdeeff609a64499b7e1afa72
     * after : 3340795ced98e7a6c86f26612c63a55efa868a5
     * ref : refs/heads/MASTER
     * checkout_sha : 334079ced978e7a6c86f26612c63a55efa868a5
     * message : null
     * user_id : 31
     * user_name : 张三
     * user_email : lz@st.c.c
     * user_avatar : https://gitlab.sous.tech/upads/user/avar/31/ly_aatar.png
     * project_id : 216
     * project : {"name":"sonicmng-android","description":" andorid版本","web_url":"https://gitlab.soundbus.th/sonving-app-team/sonicmoving-android","avatar_url":null,"git_ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","git_http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git","namespace":"sonicmoving-app-team","visibility_level":0,"path_with_namespace":"sonicmoving-app-team/sonicmoving-android","default_branch":"MASTER","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git"}
     * commits : [{"id":"50f4f5d56e32c74959a4c03a23e18fedc20cea8f","message":"第三方绑定信息UI细节调整\n","timestamp":"2017-04-10T16:30:26+08:00","url":"https://gitlab.soundbus.th/sonicmoving-app-team/sonicmoving-android/commit/50f4f5d56e32c74959a4c03a28fedc20cea8f","author":{"name":"zhuyic","email":"9663202@qq.com"},"added":[],"modified":["app/src/main/res/layout/activity_account_security.xml","app/src/main/res/values/strings.xml"],"removed":[]},{"id":"c6531663349ba042bd8ce1adda232ae3ed8bf9d0","message":"Merge branch 'MASTER' of https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android into zyc_sonicmoving\n","timestamp":"2017-04-10T16:30:44+08:00","url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/commit/c6531663349ba042bd8ce1adda232ae3ed8bf9d0","author":{"name":"zhuyichao","email":"97663202@qq.com"},"added":[],"modified":[],"removed":[]},{"id":"3340795ced978e7a6c86f26612c63a55efa868a5","message":"Merge branch 'zyc_sonicmoving' into 'MASTER'\r\n\r\n第三方绑定信息UI细节调整\r\n\r\n\r\n\r\nSee merge request !164","timestamp":"2017-04-10T16:33:04+08:00","url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/commit/3340795ced978e7a6c86f26612c63a55efa868a5","author":{"name":"曾显状","email":"lynxz@soundnet.com.cn"},"added":[],"modified":["app/src/main/res/layout/activity_account_security.xml","app/src/main/res/values/strings.xml"],"removed":[]}]
     * total_commits_count : 3
     * repository : {"name":"sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","description":"声动app andorid版本","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","git_http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git","git_ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","visibility_level":0}
     */

    private String object_kind;
    private String before;
    private String after;
    private String ref;
    private String checkout_sha;
    private Object message;
    private long user_id;
    private String user_name;
    private String user_email;
    private String user_avatar;
    private long project_id;
    private ProjectBean project;
    private int total_commits_count;
    private RepositoryBean repository;
    private List<CommitsBean> commits;

    public String getObject_kind() {
        return object_kind;
    }

    public void setObject_kind(String object_kind) {
        this.object_kind = object_kind;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getCheckout_sha() {
        return checkout_sha;
    }

    public void setCheckout_sha(String checkout_sha) {
        this.checkout_sha = checkout_sha;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public ProjectBean getProject() {
        return project;
    }

    public void setProject(ProjectBean project) {
        this.project = project;
    }

    public int getTotal_commits_count() {
        return total_commits_count;
    }

    public void setTotal_commits_count(int total_commits_count) {
        this.total_commits_count = total_commits_count;
    }

    public RepositoryBean getRepository() {
        return repository;
    }

    public void setRepository(RepositoryBean repository) {
        this.repository = repository;
    }

    public List<CommitsBean> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitsBean> commits) {
        this.commits = commits;
    }

    public static class ProjectBean {
        /**
         * name : sonicmoving-android
         * description : 声动app andorid版本
         * web_url : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android
         * avatar_url : null
         * git_ssh_url : git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git
         * git_http_url : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git
         * namespace : sonicmoving-app-team
         * visibility_level : 0
         * path_with_namespace : sonicmoving-app-team/sonicmoving-android
         * default_branch : MASTER
         * homepage : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android
         * url : git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git
         * ssh_url : git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git
         * http_url : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git
         */

        private String name;
        private String description;
        private String web_url;
        private Object avatar_url;
        private String git_ssh_url;
        private String git_http_url;
        private String namespace;
        private int visibility_level;
        private String path_with_namespace;
        private String default_branch;
        private String homepage;
        private String url;
        private String ssh_url;
        private String http_url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public Object getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(Object avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGit_ssh_url() {
            return git_ssh_url;
        }

        public void setGit_ssh_url(String git_ssh_url) {
            this.git_ssh_url = git_ssh_url;
        }

        public String getGit_http_url() {
            return git_http_url;
        }

        public void setGit_http_url(String git_http_url) {
            this.git_http_url = git_http_url;
        }

        public String getNamespace() {
            return namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public int getVisibility_level() {
            return visibility_level;
        }

        public void setVisibility_level(int visibility_level) {
            this.visibility_level = visibility_level;
        }

        public String getPath_with_namespace() {
            return path_with_namespace;
        }

        public void setPath_with_namespace(String path_with_namespace) {
            this.path_with_namespace = path_with_namespace;
        }

        public String getDefault_branch() {
            return default_branch;
        }

        public void setDefault_branch(String default_branch) {
            this.default_branch = default_branch;
        }

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSsh_url() {
            return ssh_url;
        }

        public void setSsh_url(String ssh_url) {
            this.ssh_url = ssh_url;
        }

        public String getHttp_url() {
            return http_url;
        }

        public void setHttp_url(String http_url) {
            this.http_url = http_url;
        }
    }

    public static class RepositoryBean {
        /**
         * name : sonicmoving-android
         * url : git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git
         * description : 声动app andorid版本
         * homepage : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android
         * git_http_url : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git
         * git_ssh_url : git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git
         * visibility_level : 0
         */

        private String name;
        private String url;
        private String description;
        private String homepage;
        private String git_http_url;
        private String git_ssh_url;
        private int visibility_level;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }

        public String getGit_http_url() {
            return git_http_url;
        }

        public void setGit_http_url(String git_http_url) {
            this.git_http_url = git_http_url;
        }

        public String getGit_ssh_url() {
            return git_ssh_url;
        }

        public void setGit_ssh_url(String git_ssh_url) {
            this.git_ssh_url = git_ssh_url;
        }

        public int getVisibility_level() {
            return visibility_level;
        }

        public void setVisibility_level(int visibility_level) {
            this.visibility_level = visibility_level;
        }
    }

    public static class CommitsBean {
        /**
         * id : 50f4f5d56e32c74959a4c03a23e18fedc20cea8f
         * message : 第三方绑定信息UI细节调整

         * timestamp : 2017-04-10T16:30:26+08:00
         * url : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/commit/50f4f5d56e32c74959a4c03a23e18fedc20cea8f
         * author : {"name":"zhuyichao","email":"97663202@qq.com"}
         * added : []
         * modified : ["app/src/main/res/layout/activity_account_security.xml","app/src/main/res/values/strings.xml"]
         * removed : []
         */

        private String id;
        private String message;
        private String timestamp;
        private String url;
        private AuthorBean author;
        private List<?> added;
        private List<String> modified;
        private List<?> removed;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public List<?> getAdded() {
            return added;
        }

        public void setAdded(List<?> added) {
            this.added = added;
        }

        public List<String> getModified() {
            return modified;
        }

        public void setModified(List<String> modified) {
            this.modified = modified;
        }

        public List<?> getRemoved() {
            return removed;
        }

        public void setRemoved(List<?> removed) {
            this.removed = removed;
        }

        public static class AuthorBean {
            /**
             * name : zhuyichao
             * email : 97663202@qq.com
             */

            private String name;
            private String email;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }
    }
}
