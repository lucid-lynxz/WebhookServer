package org.lynxz.server.bean;

/**
 * Created by lynxz on 21/03/2017.
 * 实际的merge数据
 */
public class GbMergeRequestEventBean {

    /**
     * object_kind : merge_request
     * user : {"name":"真实姓名","username":"lynxz","avatar_url":"https://gitlab.soundbus.tech/uploads/user/avatar/31/lynxz_avatar.png"}
     * project : {"name":"sonicmoving-android","description":"声动app andorid项目","web_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","avatar_url":null,"git_ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","git_http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git","namespace":"sonicmoving-app-team","visibility_level":0,"path_with_namespace":"sonicmoving-app-team/sonicmoving-android","default_branch":"MASTER","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git"}
     * object_attributes : {"id":3204,"target_branch":"zxzWdf","source_branch":"zxzUlife","source_project_id":216,"author_id":31,"assignee_id":31,"title":"Zxz ulife","created_at":"2017-03-21 15:05:00 +0800","updated_at":"2017-03-21 15:05:00 +0800","milestone_id":null,"state":"opened","merge_status":"unchecked","target_project_id":216,"iid":95,"description":"","position":0,"locked_at":null,"updated_by_id":null,"merge_error":null,"merge_params":{},"merge_when_build_succeeds":false,"merge_user_id":null,"merge_commit_sha":null,"deleted_at":null,"source":{"name":"sonicmoving-android","description":"??????app andorid??????","web_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","avatar_url":null,"git_ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","git_http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git","namespace":"sonicmoving-app-team","visibility_level":0,"path_with_namespace":"sonicmoving-app-team/sonicmoving-android","default_branch":"MASTER","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git"},"target":{"name":"sonicmoving-android","description":"??????app andorid??????","web_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","avatar_url":null,"git_ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","git_http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git","namespace":"sonicmoving-app-team","visibility_level":0,"path_with_namespace":"sonicmoving-app-team/sonicmoving-android","default_branch":"MASTER","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git"},"last_commit":{"id":"71cf3cf59d33dd03b2bc34145dbea9b6e7444423","message":"??????hook\n","timestamp":"2017-03-21T14:54:36+08:00","url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/commit/71cf3cf59d33dd03b2bc34145dbea9b6e7444423","author":{"name":"lynxz","email":"lynxz8866@gmail.com"}},"work_in_progress":false,"url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/merge_requests/95","action":"open"}
     * repository : {"name":"sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","description":"??????app andorid??????","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android"}
     * assignee : {"name":"真实姓名","username":"lynxz","avatar_url":"https://gitlab.soundbus.tech/uploads/user/avatar/31/lynxz_avatar.png"}
     */

    private String object_kind;
    private UserBean user;
    private ProjectBean project;
    private ObjectAttributesBean object_attributes;
    private RepositoryBean repository;
    private AssigneeBean assignee;

    public String getObject_kind() {
        return object_kind;
    }

    public void setObject_kind(String object_kind) {
        this.object_kind = object_kind;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public ProjectBean getProject() {
        return project;
    }

    public void setProject(ProjectBean project) {
        this.project = project;
    }

    public ObjectAttributesBean getObject_attributes() {
        return object_attributes;
    }

    public void setObject_attributes(ObjectAttributesBean object_attributes) {
        this.object_attributes = object_attributes;
    }

    public RepositoryBean getRepository() {
        return repository;
    }

    public void setRepository(RepositoryBean repository) {
        this.repository = repository;
    }

    public AssigneeBean getAssignee() {
        return assignee;
    }

    public void setAssignee(AssigneeBean assignee) {
        this.assignee = assignee;
    }

    public static class UserBean {
        /**
         * name : 真实姓名
         * username : lynxz
         * avatar_url : https://gitlab.soundbus.tech/uploads/user/avatar/31/lynxz_avatar.png
         */

        private String name;
        private String username;
        private String avatar_url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }
    }

    public static class ProjectBean {
        /**
         * name : sonicmoving-android
         * description : 声动app andorid项目
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

    public static class ObjectAttributesBean {
        /**
         * id : 3204
         * target_branch : zxzWdf
         * source_branch : zxzUlife
         * source_project_id : 216
         * author_id : 31
         * assignee_id : 31
         * title : Zxz ulife
         * created_at : 2017-03-21 15:05:00 +0800
         * updated_at : 2017-03-21 15:05:00 +0800
         * milestone_id : null
         * state : opened
         * merge_status : unchecked
         * target_project_id : 216
         * iid : 95
         * description :
         * position : 0
         * locked_at : null
         * updated_by_id : null
         * merge_error : null
         * merge_params : {}
         * merge_when_build_succeeds : false
         * merge_user_id : null
         * merge_commit_sha : null
         * deleted_at : null
         * source : {"name":"sonicmoving-android","description":"??????app andorid??????","web_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","avatar_url":null,"git_ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","git_http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git","namespace":"sonicmoving-app-team","visibility_level":0,"path_with_namespace":"sonicmoving-app-team/sonicmoving-android","default_branch":"MASTER","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git"}
         * target : {"name":"sonicmoving-android","description":"??????app andorid??????","web_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","avatar_url":null,"git_ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","git_http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git","namespace":"sonicmoving-app-team","visibility_level":0,"path_with_namespace":"sonicmoving-app-team/sonicmoving-android","default_branch":"MASTER","homepage":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android","url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","ssh_url":"git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git","http_url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android.git"}
         * last_commit : {"id":"71cf3cf59d33dd03b2bc34145dbea9b6e7444423","message":"??????hook\n","timestamp":"2017-03-21T14:54:36+08:00","url":"https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/commit/71cf3cf59d33dd03b2bc34145dbea9b6e7444423","author":{"name":"lynxz","email":"lynxz8866@gmail.com"}}
         * work_in_progress : false
         * url : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/merge_requests/95
         * action : open
         */

        private int id;
        private String target_branch;
        private String source_branch;
        private int source_project_id;
        private int author_id;
        private int assignee_id;
        private String title;
        private String created_at;
        private String updated_at;
        private Object milestone_id;
        private String state;
        private String merge_status;
        private int target_project_id;
        private int iid;
        private String description;
        private int position;
        private Object locked_at;
        private Object updated_by_id;
        private Object merge_error;
        private MergeParamsBean merge_params;
        private boolean merge_when_build_succeeds;
        private Object merge_user_id;
        private String merge_commit_sha;
        private Object deleted_at;
        private SourceBean source;
        private TargetBean target;
        private LastCommitBean last_commit;
        private boolean work_in_progress;
        private String url;
        private String action;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTarget_branch() {
            return target_branch;
        }

        public void setTarget_branch(String target_branch) {
            this.target_branch = target_branch;
        }

        public String getSource_branch() {
            return source_branch;
        }

        public void setSource_branch(String source_branch) {
            this.source_branch = source_branch;
        }

        public int getSource_project_id() {
            return source_project_id;
        }

        public void setSource_project_id(int source_project_id) {
            this.source_project_id = source_project_id;
        }

        public int getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(int author_id) {
            this.author_id = author_id;
        }

        public int getAssignee_id() {
            return assignee_id;
        }

        public void setAssignee_id(int assignee_id) {
            this.assignee_id = assignee_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getMilestone_id() {
            return milestone_id;
        }

        public void setMilestone_id(Object milestone_id) {
            this.milestone_id = milestone_id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getMerge_status() {
            return merge_status;
        }

        public void setMerge_status(String merge_status) {
            this.merge_status = merge_status;
        }

        public int getTarget_project_id() {
            return target_project_id;
        }

        public void setTarget_project_id(int target_project_id) {
            this.target_project_id = target_project_id;
        }

        public int getIid() {
            return iid;
        }

        public void setIid(int iid) {
            this.iid = iid;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public Object getLocked_at() {
            return locked_at;
        }

        public void setLocked_at(Object locked_at) {
            this.locked_at = locked_at;
        }

        public Object getUpdated_by_id() {
            return updated_by_id;
        }

        public void setUpdated_by_id(Object updated_by_id) {
            this.updated_by_id = updated_by_id;
        }

        public Object getMerge_error() {
            return merge_error;
        }

        public void setMerge_error(Object merge_error) {
            this.merge_error = merge_error;
        }

        public MergeParamsBean getMerge_params() {
            return merge_params;
        }

        public void setMerge_params(MergeParamsBean merge_params) {
            this.merge_params = merge_params;
        }

        public boolean isMerge_when_build_succeeds() {
            return merge_when_build_succeeds;
        }

        public void setMerge_when_build_succeeds(boolean merge_when_build_succeeds) {
            this.merge_when_build_succeeds = merge_when_build_succeeds;
        }

        public Object getMerge_user_id() {
            return merge_user_id;
        }

        public void setMerge_user_id(Object merge_user_id) {
            this.merge_user_id = merge_user_id;
        }

        public String getMerge_commit_sha() {
            return merge_commit_sha;
        }

        public void setMerge_commit_sha(String merge_commit_sha) {
            this.merge_commit_sha = merge_commit_sha;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public SourceBean getSource() {
            return source;
        }

        public void setSource(SourceBean source) {
            this.source = source;
        }

        public TargetBean getTarget() {
            return target;
        }

        public void setTarget(TargetBean target) {
            this.target = target;
        }

        public LastCommitBean getLast_commit() {
            return last_commit;
        }

        public void setLast_commit(LastCommitBean last_commit) {
            this.last_commit = last_commit;
        }

        public boolean isWork_in_progress() {
            return work_in_progress;
        }

        public void setWork_in_progress(boolean work_in_progress) {
            this.work_in_progress = work_in_progress;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public static class MergeParamsBean {
        }

        public static class SourceBean {
            /**
             * name : sonicmoving-android
             * description : ??????app andorid??????
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

        public static class TargetBean {
            /**
             * name : sonicmoving-android
             * description : ??????app andorid??????
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

        public static class LastCommitBean {
            /**
             * id : 71cf3cf59d33dd03b2bc34145dbea9b6e7444423
             * message : ??????hook
             * <p>
             * timestamp : 2017-03-21T14:54:36+08:00
             * url : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android/commit/71cf3cf59d33dd03b2bc34145dbea9b6e7444423
             * author : {"name":"lynxz","email":"lynxz8866@gmail.com"}
             */

            private String id;
            private String message;
            private String timestamp;
            private String url;
            private AuthorBean author;

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

            public static class AuthorBean {
                /**
                 * name : lynxz
                 * email : lynxz8866@gmail.com
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

    public static class RepositoryBean {
        /**
         * name : sonicmoving-android
         * url : git@gitlab.soundbus.tech:sonicmoving-app-team/sonicmoving-android.git
         * description : ??????app andorid??????
         * homepage : https://gitlab.soundbus.tech/sonicmoving-app-team/sonicmoving-android
         */

        private String name;
        private String url;
        private String description;
        private String homepage;

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
    }

    public static class AssigneeBean {
        /**
         * name : 真实姓名
         * username : lynxz
         * avatar_url : https://gitlab.soundbus.tech/uploads/user/avatar/31/lynxz_avatar.png
         */

        private String name;
        private String username;
        private String avatar_url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }
    }
}
