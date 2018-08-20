package com.inspur.cmis.entity;

import java.util.Date;

/**
 * Created by LiuLiHao on 2018/8/19 14:20.
 * 描述：
 * 作者： LiuLiHao
 */
public class Group {

    private Integer id;
    private String name;
    private String code;
    private String parentid;
    private String parentName;// 上层机构名称
    private String briefname;
    private String description;
    private String valid;
    private Integer modifieduserid;
    private Integer createduserid;
    private Date createdtime;
    private Date modifiedtime;
    private String validName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
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

    public Integer getModifieduserid() {
        return modifieduserid;
    }

    public void setModifieduserid(Integer modifieduserid) {
        this.modifieduserid = modifieduserid;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getValidName() {
        return validName;
    }

    public void setValidName(String validName) {
        this.validName = validName;
    }
}
