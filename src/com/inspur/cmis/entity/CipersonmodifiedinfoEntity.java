package com.inspur.cmis.entity;

import java.sql.Timestamp;

/**
 * Created by LiuLiHao on 2018/8/19 19:40.
 * 描述：
 * 作者： LiuLiHao
 */
public class CipersonmodifiedinfoEntity {
    private String id;
    private String initid;
    private String columnname;
    private String operator;
    private Timestamp modifiedtime;
    private String instcitycode;
    private String formerlyinfodata;
    private String modifiedinfodata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitid() {
        return initid;
    }

    public void setInitid(String initid) {
        this.initid = initid;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Timestamp getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Timestamp modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getInstcitycode() {
        return instcitycode;
    }

    public void setInstcitycode(String instcitycode) {
        this.instcitycode = instcitycode;
    }

    public String getFormerlyinfodata() {
        return formerlyinfodata;
    }

    public void setFormerlyinfodata(String formerlyinfodata) {
        this.formerlyinfodata = formerlyinfodata;
    }

    public String getModifiedinfodata() {
        return modifiedinfodata;
    }

    public void setModifiedinfodata(String modifiedinfodata) {
        this.modifiedinfodata = modifiedinfodata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CipersonmodifiedinfoEntity that = (CipersonmodifiedinfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (initid != null ? !initid.equals(that.initid) : that.initid != null) return false;
        if (columnname != null ? !columnname.equals(that.columnname) : that.columnname != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (modifiedtime != null ? !modifiedtime.equals(that.modifiedtime) : that.modifiedtime != null) return false;
        if (instcitycode != null ? !instcitycode.equals(that.instcitycode) : that.instcitycode != null) return false;
        if (formerlyinfodata != null ? !formerlyinfodata.equals(that.formerlyinfodata) : that.formerlyinfodata != null)
            return false;
        if (modifiedinfodata != null ? !modifiedinfodata.equals(that.modifiedinfodata) : that.modifiedinfodata != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (initid != null ? initid.hashCode() : 0);
        result = 31 * result + (columnname != null ? columnname.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (modifiedtime != null ? modifiedtime.hashCode() : 0);
        result = 31 * result + (instcitycode != null ? instcitycode.hashCode() : 0);
        result = 31 * result + (formerlyinfodata != null ? formerlyinfodata.hashCode() : 0);
        result = 31 * result + (modifiedinfodata != null ? modifiedinfodata.hashCode() : 0);
        return result;
    }
}
