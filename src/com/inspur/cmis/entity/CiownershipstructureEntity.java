package com.inspur.cmis.entity;

/**
 * Created by LiuLiHao on 2018/8/28 13:21.
 * 描述：
 * 作者： LiuLiHao
 */
public class CiownershipstructureEntity {
    private String id;
    private String custid;
    private String shareholdertype;
    private String shareholderid;
    private String shareholdertypeid;
    private String shareholdername;
    private String docttype;
    private String doctid;
    private String currencytype;
    private Long outaomunt;
    private Long actualoutaomunt;
    private Long holdingscale;
    private String fundingway;
    private String remark;
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

    public String getShareholdertype() {
        return shareholdertype;
    }

    public void setShareholdertype(String shareholdertype) {
        this.shareholdertype = shareholdertype;
    }

    public String getShareholderid() {
        return shareholderid;
    }

    public void setShareholderid(String shareholderid) {
        this.shareholderid = shareholderid;
    }

    public String getShareholdertypeid() {
        return shareholdertypeid;
    }

    public void setShareholdertypeid(String shareholdertypeid) {
        this.shareholdertypeid = shareholdertypeid;
    }

    public String getShareholdername() {
        return shareholdername;
    }

    public void setShareholdername(String shareholdername) {
        this.shareholdername = shareholdername;
    }

    public String getDocttype() {
        return docttype;
    }

    public void setDocttype(String docttype) {
        this.docttype = docttype;
    }

    public String getDoctid() {
        return doctid;
    }

    public void setDoctid(String doctid) {
        this.doctid = doctid;
    }

    public String getCurrencytype() {
        return currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    public Long getOutaomunt() {
        return outaomunt;
    }

    public void setOutaomunt(Long outaomunt) {
        this.outaomunt = outaomunt;
    }

    public Long getActualoutaomunt() {
        return actualoutaomunt;
    }

    public void setActualoutaomunt(Long actualoutaomunt) {
        this.actualoutaomunt = actualoutaomunt;
    }

    public Long getHoldingscale() {
        return holdingscale;
    }

    public void setHoldingscale(Long holdingscale) {
        this.holdingscale = holdingscale;
    }

    public String getFundingway() {
        return fundingway;
    }

    public void setFundingway(String fundingway) {
        this.fundingway = fundingway;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CiownershipstructureEntity that = (CiownershipstructureEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (shareholdertype != null ? !shareholdertype.equals(that.shareholdertype) : that.shareholdertype != null)
            return false;
        if (shareholderid != null ? !shareholderid.equals(that.shareholderid) : that.shareholderid != null)
            return false;
        if (shareholdertypeid != null ? !shareholdertypeid.equals(that.shareholdertypeid) : that.shareholdertypeid != null)
            return false;
        if (shareholdername != null ? !shareholdername.equals(that.shareholdername) : that.shareholdername != null)
            return false;
        if (docttype != null ? !docttype.equals(that.docttype) : that.docttype != null) return false;
        if (doctid != null ? !doctid.equals(that.doctid) : that.doctid != null) return false;
        if (currencytype != null ? !currencytype.equals(that.currencytype) : that.currencytype != null) return false;
        if (outaomunt != null ? !outaomunt.equals(that.outaomunt) : that.outaomunt != null) return false;
        if (actualoutaomunt != null ? !actualoutaomunt.equals(that.actualoutaomunt) : that.actualoutaomunt != null)
            return false;
        if (holdingscale != null ? !holdingscale.equals(that.holdingscale) : that.holdingscale != null) return false;
        if (fundingway != null ? !fundingway.equals(that.fundingway) : that.fundingway != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (shareholdertype != null ? shareholdertype.hashCode() : 0);
        result = 31 * result + (shareholderid != null ? shareholderid.hashCode() : 0);
        result = 31 * result + (shareholdertypeid != null ? shareholdertypeid.hashCode() : 0);
        result = 31 * result + (shareholdername != null ? shareholdername.hashCode() : 0);
        result = 31 * result + (docttype != null ? docttype.hashCode() : 0);
        result = 31 * result + (doctid != null ? doctid.hashCode() : 0);
        result = 31 * result + (currencytype != null ? currencytype.hashCode() : 0);
        result = 31 * result + (outaomunt != null ? outaomunt.hashCode() : 0);
        result = 31 * result + (actualoutaomunt != null ? actualoutaomunt.hashCode() : 0);
        result = 31 * result + (holdingscale != null ? holdingscale.hashCode() : 0);
        result = 31 * result + (fundingway != null ? fundingway.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
