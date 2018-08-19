package com.inspur.cmis.entity;

import java.sql.Timestamp;

/**
 * Created by LiuLiHao on 2018/8/19 19:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class CipersonbadrecordEntity {
    private String id;
    private String custid;
    private String subject;
    private String recorddate;
    private String baddescription;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(String recorddate) {
        this.recorddate = recorddate;
    }

    public String getBaddescription() {
        return baddescription;
    }

    public void setBaddescription(String baddescription) {
        this.baddescription = baddescription;
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

        CipersonbadrecordEntity that = (CipersonbadrecordEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;
        if (baddescription != null ? !baddescription.equals(that.baddescription) : that.baddescription != null)
            return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (instcitycode != null ? !instcitycode.equals(that.instcitycode) : that.instcitycode != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (baddescription != null ? baddescription.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (instcitycode != null ? instcitycode.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
