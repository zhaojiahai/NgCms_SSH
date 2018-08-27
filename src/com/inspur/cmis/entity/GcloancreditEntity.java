package com.inspur.cmis.entity;

import java.util.Date;

/**
 * Created by LiuLiHao on 2018/8/20 13:12.
 * 描述： 凭证信息
 * 作者： LiuLiHao
 */
public class GcloancreditEntity {
    private Integer id;
    private String keycode;
    private String keytype;
    private String upkeycode;
    private String custid;
    private Double money;
    private String currency;
    private String loandate;
    private Date startdate;
    private Date enddate;

    private Date lastdate;
    private Long limit;
    private String limitunit;
    private String keyeffectedstate;
    private String keydatestate;
    private String squarestate;
    private String squaredate;
    private String subbusicodetype;
    private String busitype;
    private String repayaccount;
    private String payintmode;
    private Long repaytimes;
    private Long interest;
    private String interestunit;
    private String ratetype;
    private String floattype;
    private Long baserate;
    private String baseratetype;
    private Long floatrate;
    private Long intrstratefdot;
    private String loanpurpose;
    private String comments;
    private String usetype;
    private String bailacc;
    private String bailcurtype;
    private Long assurerate;
    private Long bailamt;
    private String loanmanager;
    private String busimanager;
    private String createdate;
    private String passeddate;
    private String creditstate;
    private String paymethod;
    /**
     * '0受托支付；1自主支付';
     */
    private Integer paymode;
    private String purposeremark;
    private String instcode;
    private String operator;
    private Date operdatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode;
    }

    public String getKeytype() {
        return keytype;
    }

    public void setKeytype(String keytype) {
        this.keytype = keytype;
    }

    public String getUpkeycode() {
        return upkeycode;
    }

    public void setUpkeycode(String upkeycode) {
        this.upkeycode = upkeycode;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public String getLimitunit() {
        return limitunit;
    }

    public void setLimitunit(String limitunit) {
        this.limitunit = limitunit;
    }

    public String getKeyeffectedstate() {
        return keyeffectedstate;
    }

    public void setKeyeffectedstate(String keyeffectedstate) {
        this.keyeffectedstate = keyeffectedstate;
    }

    public String getKeydatestate() {
        return keydatestate;
    }

    public void setKeydatestate(String keydatestate) {
        this.keydatestate = keydatestate;
    }

    public String getSquarestate() {
        return squarestate;
    }

    public void setSquarestate(String squarestate) {
        this.squarestate = squarestate;
    }

    public String getSquaredate() {
        return squaredate;
    }

    public void setSquaredate(String squaredate) {
        this.squaredate = squaredate;
    }

    public String getSubbusicodetype() {
        return subbusicodetype;
    }

    public void setSubbusicodetype(String subbusicodetype) {
        this.subbusicodetype = subbusicodetype;
    }

    public String getBusitype() {
        return busitype;
    }

    public void setBusitype(String busitype) {
        this.busitype = busitype;
    }

    public String getRepayaccount() {
        return repayaccount;
    }

    public void setRepayaccount(String repayaccount) {
        this.repayaccount = repayaccount;
    }

    public String getPayintmode() {
        return payintmode;
    }

    public void setPayintmode(String payintmode) {
        this.payintmode = payintmode;
    }

    public Long getRepaytimes() {
        return repaytimes;
    }

    public void setRepaytimes(Long repaytimes) {
        this.repaytimes = repaytimes;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public String getInterestunit() {
        return interestunit;
    }

    public void setInterestunit(String interestunit) {
        this.interestunit = interestunit;
    }

    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype;
    }

    public String getFloattype() {
        return floattype;
    }

    public void setFloattype(String floattype) {
        this.floattype = floattype;
    }

    public Long getBaserate() {
        return baserate;
    }

    public void setBaserate(Long baserate) {
        this.baserate = baserate;
    }

    public String getBaseratetype() {
        return baseratetype;
    }

    public void setBaseratetype(String baseratetype) {
        this.baseratetype = baseratetype;
    }

    public Long getFloatrate() {
        return floatrate;
    }

    public void setFloatrate(Long floatrate) {
        this.floatrate = floatrate;
    }

    public Long getIntrstratefdot() {
        return intrstratefdot;
    }

    public void setIntrstratefdot(Long intrstratefdot) {
        this.intrstratefdot = intrstratefdot;
    }

    public String getLoanpurpose() {
        return loanpurpose;
    }

    public void setLoanpurpose(String loanpurpose) {
        this.loanpurpose = loanpurpose;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    public String getBailacc() {
        return bailacc;
    }

    public void setBailacc(String bailacc) {
        this.bailacc = bailacc;
    }

    public String getBailcurtype() {
        return bailcurtype;
    }

    public void setBailcurtype(String bailcurtype) {
        this.bailcurtype = bailcurtype;
    }

    public Long getAssurerate() {
        return assurerate;
    }

    public void setAssurerate(Long assurerate) {
        this.assurerate = assurerate;
    }

    public Long getBailamt() {
        return bailamt;
    }

    public void setBailamt(Long bailamt) {
        this.bailamt = bailamt;
    }

    public String getLoanmanager() {
        return loanmanager;
    }

    public void setLoanmanager(String loanmanager) {
        this.loanmanager = loanmanager;
    }

    public String getBusimanager() {
        return busimanager;
    }

    public void setBusimanager(String busimanager) {
        this.busimanager = busimanager;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getPasseddate() {
        return passeddate;
    }

    public void setPasseddate(String passeddate) {
        this.passeddate = passeddate;
    }

    public String getCreditstate() {
        return creditstate;
    }

    public void setCreditstate(String creditstate) {
        this.creditstate = creditstate;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public Integer getPaymode() {
        return paymode;
    }

    public void setPaymode(Integer paymode) {
        this.paymode = paymode;
    }

    public String getPurposeremark() {
        return purposeremark;
    }

    public void setPurposeremark(String purposeremark) {
        this.purposeremark = purposeremark;
    }

    public String getInstcode() {
        return instcode;
    }

    public void setInstcode(String instcode) {
        this.instcode = instcode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperdatetime() {
        return operdatetime;
    }

    public void setOperdatetime(Date operdatetime) {
        this.operdatetime = operdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GcloancreditEntity that = (GcloancreditEntity) o;

        if (keycode != null ? !keycode.equals(that.keycode) : that.keycode != null) return false;
        if (keytype != null ? !keytype.equals(that.keytype) : that.keytype != null) return false;
        if (upkeycode != null ? !upkeycode.equals(that.upkeycode) : that.upkeycode != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (loandate != null ? !loandate.equals(that.loandate) : that.loandate != null) return false;
        if (startdate != null ? !startdate.equals(that.startdate) : that.startdate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
        if (lastdate != null ? !lastdate.equals(that.lastdate) : that.lastdate != null) return false;
        if (limit != null ? !limit.equals(that.limit) : that.limit != null) return false;
        if (limitunit != null ? !limitunit.equals(that.limitunit) : that.limitunit != null) return false;
        if (keyeffectedstate != null ? !keyeffectedstate.equals(that.keyeffectedstate) : that.keyeffectedstate != null)
            return false;
        if (keydatestate != null ? !keydatestate.equals(that.keydatestate) : that.keydatestate != null) return false;
        if (squarestate != null ? !squarestate.equals(that.squarestate) : that.squarestate != null) return false;
        if (squaredate != null ? !squaredate.equals(that.squaredate) : that.squaredate != null) return false;
        if (subbusicodetype != null ? !subbusicodetype.equals(that.subbusicodetype) : that.subbusicodetype != null)
            return false;
        if (busitype != null ? !busitype.equals(that.busitype) : that.busitype != null) return false;
        if (repayaccount != null ? !repayaccount.equals(that.repayaccount) : that.repayaccount != null) return false;
        if (payintmode != null ? !payintmode.equals(that.payintmode) : that.payintmode != null) return false;
        if (repaytimes != null ? !repaytimes.equals(that.repaytimes) : that.repaytimes != null) return false;
        if (interest != null ? !interest.equals(that.interest) : that.interest != null) return false;
        if (interestunit != null ? !interestunit.equals(that.interestunit) : that.interestunit != null) return false;
        if (ratetype != null ? !ratetype.equals(that.ratetype) : that.ratetype != null) return false;
        if (floattype != null ? !floattype.equals(that.floattype) : that.floattype != null) return false;
        if (baserate != null ? !baserate.equals(that.baserate) : that.baserate != null) return false;
        if (baseratetype != null ? !baseratetype.equals(that.baseratetype) : that.baseratetype != null) return false;
        if (floatrate != null ? !floatrate.equals(that.floatrate) : that.floatrate != null) return false;
        if (intrstratefdot != null ? !intrstratefdot.equals(that.intrstratefdot) : that.intrstratefdot != null)
            return false;
        if (loanpurpose != null ? !loanpurpose.equals(that.loanpurpose) : that.loanpurpose != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (usetype != null ? !usetype.equals(that.usetype) : that.usetype != null) return false;
        if (bailacc != null ? !bailacc.equals(that.bailacc) : that.bailacc != null) return false;
        if (bailcurtype != null ? !bailcurtype.equals(that.bailcurtype) : that.bailcurtype != null) return false;
        if (assurerate != null ? !assurerate.equals(that.assurerate) : that.assurerate != null) return false;
        if (bailamt != null ? !bailamt.equals(that.bailamt) : that.bailamt != null) return false;
        if (loanmanager != null ? !loanmanager.equals(that.loanmanager) : that.loanmanager != null) return false;
        if (busimanager != null ? !busimanager.equals(that.busimanager) : that.busimanager != null) return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (passeddate != null ? !passeddate.equals(that.passeddate) : that.passeddate != null) return false;
        if (creditstate != null ? !creditstate.equals(that.creditstate) : that.creditstate != null) return false;
        if (paymethod != null ? !paymethod.equals(that.paymethod) : that.paymethod != null) return false;
        if (paymode != null ? !paymode.equals(that.paymode) : that.paymode != null) return false;
        if (purposeremark != null ? !purposeremark.equals(that.purposeremark) : that.purposeremark != null)
            return false;
        if (instcode != null ? !instcode.equals(that.instcode) : that.instcode != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keycode != null ? keycode.hashCode() : 0;
        result = 31 * result + (keytype != null ? keytype.hashCode() : 0);
        result = 31 * result + (upkeycode != null ? upkeycode.hashCode() : 0);
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (loandate != null ? loandate.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        result = 31 * result + (limit != null ? limit.hashCode() : 0);
        result = 31 * result + (limitunit != null ? limitunit.hashCode() : 0);
        result = 31 * result + (keyeffectedstate != null ? keyeffectedstate.hashCode() : 0);
        result = 31 * result + (keydatestate != null ? keydatestate.hashCode() : 0);
        result = 31 * result + (squarestate != null ? squarestate.hashCode() : 0);
        result = 31 * result + (squaredate != null ? squaredate.hashCode() : 0);
        result = 31 * result + (subbusicodetype != null ? subbusicodetype.hashCode() : 0);
        result = 31 * result + (busitype != null ? busitype.hashCode() : 0);
        result = 31 * result + (repayaccount != null ? repayaccount.hashCode() : 0);
        result = 31 * result + (payintmode != null ? payintmode.hashCode() : 0);
        result = 31 * result + (repaytimes != null ? repaytimes.hashCode() : 0);
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        result = 31 * result + (interestunit != null ? interestunit.hashCode() : 0);
        result = 31 * result + (ratetype != null ? ratetype.hashCode() : 0);
        result = 31 * result + (floattype != null ? floattype.hashCode() : 0);
        result = 31 * result + (baserate != null ? baserate.hashCode() : 0);
        result = 31 * result + (baseratetype != null ? baseratetype.hashCode() : 0);
        result = 31 * result + (floatrate != null ? floatrate.hashCode() : 0);
        result = 31 * result + (intrstratefdot != null ? intrstratefdot.hashCode() : 0);
        result = 31 * result + (loanpurpose != null ? loanpurpose.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (usetype != null ? usetype.hashCode() : 0);
        result = 31 * result + (bailacc != null ? bailacc.hashCode() : 0);
        result = 31 * result + (bailcurtype != null ? bailcurtype.hashCode() : 0);
        result = 31 * result + (assurerate != null ? assurerate.hashCode() : 0);
        result = 31 * result + (bailamt != null ? bailamt.hashCode() : 0);
        result = 31 * result + (loanmanager != null ? loanmanager.hashCode() : 0);
        result = 31 * result + (busimanager != null ? busimanager.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (passeddate != null ? passeddate.hashCode() : 0);
        result = 31 * result + (creditstate != null ? creditstate.hashCode() : 0);
        result = 31 * result + (paymethod != null ? paymethod.hashCode() : 0);
        result = 31 * result + (paymode != null ? paymode.hashCode() : 0);
        result = 31 * result + (purposeremark != null ? purposeremark.hashCode() : 0);
        result = 31 * result + (instcode != null ? instcode.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
