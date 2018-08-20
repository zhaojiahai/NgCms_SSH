package com.inspur.cmis.entity;

/**
 * Created by LiuLiHao on 2018/8/20 13:13.
 * 描述：
 * 作者： LiuLiHao
 */
public class PmGroupEntity {
    private long id;
    private String parentid;
    private String code;
    private String name;
    private String briefname;
    private String description;
    private String valid;
    private Long modifieduserid;
    private Long createduserid;
    private String createdtime;
    private String modifiedtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefname() {
        return briefname;
    }

    public void setBriefname(String briefname) {
        this.briefname = briefname;
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

    public Long getModifieduserid() {
        return modifieduserid;
    }

    public void setModifieduserid(Long modifieduserid) {
        this.modifieduserid = modifieduserid;
    }

    public Long getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Long createduserid) {
        this.createduserid = createduserid;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmGroupEntity that = (PmGroupEntity) o;

        if (id != that.id) return false;
        if (parentid != null ? !parentid.equals(that.parentid) : that.parentid != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (briefname != null ? !briefname.equals(that.briefname) : that.briefname != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;
        if (modifieduserid != null ? !modifieduserid.equals(that.modifieduserid) : that.modifieduserid != null)
            return false;
        if (createduserid != null ? !createduserid.equals(that.createduserid) : that.createduserid != null)
            return false;
        if (createdtime != null ? !createdtime.equals(that.createdtime) : that.createdtime != null) return false;
        if (modifiedtime != null ? !modifiedtime.equals(that.modifiedtime) : that.modifiedtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (briefname != null ? briefname.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (modifieduserid != null ? modifieduserid.hashCode() : 0);
        result = 31 * result + (createduserid != null ? createduserid.hashCode() : 0);
        result = 31 * result + (createdtime != null ? createdtime.hashCode() : 0);
        result = 31 * result + (modifiedtime != null ? modifiedtime.hashCode() : 0);
        return result;
    }
}
