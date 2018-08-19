package com.inspur.cmis.entity;

/**
 * Created by LiuLiHao on 2018/8/19 19:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class CiexternalinvestmentEntity {
    private long id;
    private String custid;
    private String entername;
    private Long extinvestamount;
    private Long holdingscale;
    private String investrelationship;
    private String currecytype;
    private String remark;
    private String operator;
    private String operdatetime;
    private String column11;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getEntername() {
        return entername;
    }

    public void setEntername(String entername) {
        this.entername = entername;
    }

    public Long getExtinvestamount() {
        return extinvestamount;
    }

    public void setExtinvestamount(Long extinvestamount) {
        this.extinvestamount = extinvestamount;
    }

    public Long getHoldingscale() {
        return holdingscale;
    }

    public void setHoldingscale(Long holdingscale) {
        this.holdingscale = holdingscale;
    }

    public String getInvestrelationship() {
        return investrelationship;
    }

    public void setInvestrelationship(String investrelationship) {
        this.investrelationship = investrelationship;
    }

    public String getCurrecytype() {
        return currecytype;
    }

    public void setCurrecytype(String currecytype) {
        this.currecytype = currecytype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getColumn11() {
        return column11;
    }

    public void setColumn11(String column11) {
        this.column11 = column11;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CiexternalinvestmentEntity that = (CiexternalinvestmentEntity) o;

        if (id != that.id) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (entername != null ? !entername.equals(that.entername) : that.entername != null) return false;
        if (extinvestamount != null ? !extinvestamount.equals(that.extinvestamount) : that.extinvestamount != null)
            return false;
        if (holdingscale != null ? !holdingscale.equals(that.holdingscale) : that.holdingscale != null) return false;
        if (investrelationship != null ? !investrelationship.equals(that.investrelationship) : that.investrelationship != null)
            return false;
        if (currecytype != null ? !currecytype.equals(that.currecytype) : that.currecytype != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;
        if (column11 != null ? !column11.equals(that.column11) : that.column11 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (entername != null ? entername.hashCode() : 0);
        result = 31 * result + (extinvestamount != null ? extinvestamount.hashCode() : 0);
        result = 31 * result + (holdingscale != null ? holdingscale.hashCode() : 0);
        result = 31 * result + (investrelationship != null ? investrelationship.hashCode() : 0);
        result = 31 * result + (currecytype != null ? currecytype.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        result = 31 * result + (column11 != null ? column11.hashCode() : 0);
        return result;
    }
}
