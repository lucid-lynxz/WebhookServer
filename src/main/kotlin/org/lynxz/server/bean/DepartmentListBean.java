package org.lynxz.server.bean;

import java.util.List;

/**
 * Created by lynxz on 08/03/2017.
 */
public class DepartmentListBean {

    /**
     * errcode : 0
     * errmsg : ok
     * department : [{"id":2,"name":"钉钉事业部","parentid":1,"createDeptGroup":true,"autoAddUser":true},{"id":3,"name":"服务端开发组","parentid":2,"createDeptGroup":false,"autoAddUser":false}]
     */

    private int errcode;
    private String errmsg;
    private List<DepartmentBean> department;

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

    public List<DepartmentBean> getDepartment() {
        return department;
    }

    public void setDepartment(List<DepartmentBean> department) {
        this.department = department;
    }

    public static class DepartmentBean {
        /**
         * id : 2
         * name : 钉钉事业部
         * parentid : 1
         * createDeptGroup : true
         * autoAddUser : true
         */

        private int id;
        private String name;
        private int parentid;
        private boolean createDeptGroup;
        private boolean autoAddUser;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParentid() {
            return parentid;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }

        public boolean isCreateDeptGroup() {
            return createDeptGroup;
        }

        public void setCreateDeptGroup(boolean createDeptGroup) {
            this.createDeptGroup = createDeptGroup;
        }

        public boolean isAutoAddUser() {
            return autoAddUser;
        }

        public void setAutoAddUser(boolean autoAddUser) {
            this.autoAddUser = autoAddUser;
        }
    }
}
