package com.inspur.cmis.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by LiuLiHao on 2018/8/20 13:12.
 * 描述： 凭证信息
 * 作者： LiuLiHao
 */
@Entity
@Table(name = "Gc_loancredit")
public class GcloancreditEntity {
    @Id
    @GeneratedValue
    private Integer id;
    //0未删除 1已删除
    @Column(columnDefinition = "INT default 0")
    private Integer isDelete;
    private String keycode;
    private String keytype;
    private String upkeycode;
    //客户名称
    private String custid;
    //客户姓名
    private String custname;
    //业务类型
    private String busitype;

    private Double money;
    private String currency;
    private String loandate;
    private Date startdate;
    private Date enddate;

    private Date lastdate;
    //期限  关键字冲突
    private Integer climit;
    //默认为月
    private String limitunit;
    private String keyeffectedstate;
    private String keydatestate;
    private String squarestate;
    private String squaredate;
    private String subbusicodetype;

    private String repayaccount;
    private String payintmode;
    private Integer repaytimes;
    private Integer interest;
    private String interestunit;
    private String ratetype;
    private String floattype;
    private Integer baserate;
    private String baseratetype;
    private Integer floatrate;
    private Integer intrstratefdot;
    private String loanpurpose;
    private String comments;
    //使用方式
    private String usetype;
    private String bailacc;
    private String bailcurtype;
    private Integer assurerate;
    private Integer bailamt;
    private String loanmanager;
    //主办经理
    private String busimanager;

    private Date createdate;
    private Date passeddate;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public Integer getClimit() {
        return climit;
    }

    public void setClimit(Integer climit) {
        this.climit = climit;
    }

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

    public Integer getRepaytimes() {
        return repaytimes;
    }

    public void setRepaytimes(Integer repaytimes) {
        this.repaytimes = repaytimes;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
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

    public Integer getBaserate() {
        return baserate;
    }

    public void setBaserate(Integer baserate) {
        this.baserate = baserate;
    }

    public String getBaseratetype() {
        return baseratetype;
    }

    public void setBaseratetype(String baseratetype) {
        this.baseratetype = baseratetype;
    }

    public Integer getFloatrate() {
        return floatrate;
    }

    public void setFloatrate(Integer floatrate) {
        this.floatrate = floatrate;
    }

    public Integer getIntrstratefdot() {
        return intrstratefdot;
    }

    public void setIntrstratefdot(Integer intrstratefdot) {
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

    public Integer getAssurerate() {
        return assurerate;
    }

    public void setAssurerate(Integer assurerate) {
        this.assurerate = assurerate;
    }

    public Integer getBailamt() {
        return bailamt;
    }

    public void setBailamt(Integer bailamt) {
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getPasseddate() {
        return passeddate;
    }

    public void setPasseddate(Date passeddate) {
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
}
