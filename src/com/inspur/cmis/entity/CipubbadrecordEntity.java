package com.inspur.cmis.entity;

/**
 * Created by LiuLiHao on 2018/8/19 19:40.
 * 描述：
 * 作者： LiuLiHao
 */
public class CipubbadrecordEntity {
    private String id;
    private String custid;
    private String subject;
    private String badrecorddate;
    private String summary;
    private String operator;
    private String operdatetime;

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

    public String getBadrecorddate() {
        return badrecorddate;
    }

    public void setBadrecorddate(String badrecorddate) {
        this.badrecorddate = badrecorddate;
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

    public String getOperdatetime() {
        return operdatetime;
    }

    public void setOperdatetime(String operdatetime) {
        this.operdatetime = operdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CipubbadrecordEntity that = (CipubbadrecordEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (badrecorddate != null ? !badrecorddate.equals(that.badrecorddate) : that.badrecorddate != null)
            return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (badrecorddate != null ? badrecorddate.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
