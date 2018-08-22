package com.inspur.cmis.entity;

/**
 * Created by LiuLiHao on 2018/8/20 13:10.
 * 描述： 用户对象
 * 作者： LiuLiHao
 */
public class PmUserEntity {
    private long id;
    private String loginname;
    private String password;
    private String name;
    private String groupid;
    private String description;
    private String valid;
    private String locked;
    private String modifiedtime;
    private String createdtime;
    private Long createduserid;
    private Long modifieduserid;
    private String roleid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public Long getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Long createduserid) {
        this.createduserid = createduserid;
    }

    public Long getModifieduserid() {
        return modifieduserid;
    }

    public void setModifieduserid(Long modifieduserid) {
        this.modifieduserid = modifieduserid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmUserEntity that = (PmUserEntity) o;

        if (id != that.id) return false;
        if (loginname != null ? !loginname.equals(that.loginname) : that.loginname != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (groupid != null ? !groupid.equals(that.groupid) : that.groupid != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;
        if (locked != null ? !locked.equals(that.locked) : that.locked != null) return false;
        if (modifiedtime != null ? !modifiedtime.equals(that.modifiedtime) : that.modifiedtime != null) return false;
        if (createdtime != null ? !createdtime.equals(that.createdtime) : that.createdtime != null) return false;
        if (createduserid != null ? !createduserid.equals(that.createduserid) : that.createduserid != null)
            return false;
        if (modifieduserid != null ? !modifieduserid.equals(that.modifieduserid) : that.modifieduserid != null)
            return false;
        if (roleid != null ? !roleid.equals(that.roleid) : that.roleid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (loginname != null ? loginname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (groupid != null ? groupid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (locked != null ? locked.hashCode() : 0);
        result = 31 * result + (modifiedtime != null ? modifiedtime.hashCode() : 0);
        result = 31 * result + (createdtime != null ? createdtime.hashCode() : 0);
        result = 31 * result + (createduserid != null ? createduserid.hashCode() : 0);
        result = 31 * result + (modifieduserid != null ? modifieduserid.hashCode() : 0);
        result = 31 * result + (roleid != null ? roleid.hashCode() : 0);
        return result;
    }
}
