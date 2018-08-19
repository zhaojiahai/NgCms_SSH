package com.inspur.cmis.entity;

import java.sql.Timestamp;

/**
 * Created by LiuLiHao on 2018/8/19 19:40.
 * 描述：
 * 作者： LiuLiHao
 */
public class CipersonmemoEntity {
    private String id;
    private String custid;
    private String releasedept;
    private String eventclass;
    private String iswarning;
    private String infosource;
    private String eventinfo;
    private String operator;
    private String instcitycode;
    private Timestamp operdatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getReleasedept() {
        return releasedept;
    }

    public void setReleasedept(String releasedept) {
        this.releasedept = releasedept;
    }

    public String getEventclass() {
        return eventclass;
    }

    public void setEventclass(String eventclass) {
        this.eventclass = eventclass;
    }

    public String getIswarning() {
        return iswarning;
    }

    public void setIswarning(String iswarning) {
        this.iswarning = iswarning;
    }

    public String getInfosource() {
        return infosource;
    }

    public void setInfosource(String infosource) {
        this.infosource = infosource;
    }

    public String getEventinfo() {
        return eventinfo;
    }

    public void setEventinfo(String eventinfo) {
        this.eventinfo = eventinfo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getInstcitycode() {
        return instcitycode;
    }

    public void setInstcitycode(String instcitycode) {
        this.instcitycode = instcitycode;
    }

    public Timestamp getOperdatetime() {
        return operdatetime;
    }

    public void setOperdatetime(Timestamp operdatetime) {
        this.operdatetime = operdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CipersonmemoEntity that = (CipersonmemoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (releasedept != null ? !releasedept.equals(that.releasedept) : that.releasedept != null) return false;
        if (eventclass != null ? !eventclass.equals(that.eventclass) : that.eventclass != null) return false;
        if (iswarning != null ? !iswarning.equals(that.iswarning) : that.iswarning != null) return false;
        if (infosource != null ? !infosource.equals(that.infosource) : that.infosource != null) return false;
        if (eventinfo != null ? !eventinfo.equals(that.eventinfo) : that.eventinfo != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (instcitycode != null ? !instcitycode.equals(that.instcitycode) : that.instcitycode != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (releasedept != null ? releasedept.hashCode() : 0);
        result = 31 * result + (eventclass != null ? eventclass.hashCode() : 0);
        result = 31 * result + (iswarning != null ? iswarning.hashCode() : 0);
        result = 31 * result + (infosource != null ? infosource.hashCode() : 0);
        result = 31 * result + (eventinfo != null ? eventinfo.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (instcitycode != null ? instcitycode.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
