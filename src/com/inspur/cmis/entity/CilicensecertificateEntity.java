package com.inspur.cmis.entity;

import java.sql.Timestamp;

/**
 * Created by LiuLiHao on 2018/8/19 19:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class CilicensecertificateEntity {
    private String id;
    private String custid;
    private String certtype;
    private String certname;
    private String certid;
    private String issuingagency;
    private String certlevel;
    private String startdate;
    private String enddate;
    private String summary;
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

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    public String getCertname() {
        return certname;
    }

    public void setCertname(String certname) {
        this.certname = certname;
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid;
    }

    public String getIssuingagency() {
        return issuingagency;
    }

    public void setIssuingagency(String issuingagency) {
        this.issuingagency = issuingagency;
    }

    public String getCertlevel() {
        return certlevel;
    }

    public void setCertlevel(String certlevel) {
        this.certlevel = certlevel;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

        CilicensecertificateEntity that = (CilicensecertificateEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (certtype != null ? !certtype.equals(that.certtype) : that.certtype != null) return false;
        if (certname != null ? !certname.equals(that.certname) : that.certname != null) return false;
        if (certid != null ? !certid.equals(that.certid) : that.certid != null) return false;
        if (issuingagency != null ? !issuingagency.equals(that.issuingagency) : that.issuingagency != null)
            return false;
        if (certlevel != null ? !certlevel.equals(that.certlevel) : that.certlevel != null) return false;
        if (startdate != null ? !startdate.equals(that.startdate) : that.startdate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (instcitycode != null ? !instcitycode.equals(that.instcitycode) : that.instcitycode != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (certtype != null ? certtype.hashCode() : 0);
        result = 31 * result + (certname != null ? certname.hashCode() : 0);
        result = 31 * result + (certid != null ? certid.hashCode() : 0);
        result = 31 * result + (issuingagency != null ? issuingagency.hashCode() : 0);
        result = 31 * result + (certlevel != null ? certlevel.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (instcitycode != null ? instcitycode.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
