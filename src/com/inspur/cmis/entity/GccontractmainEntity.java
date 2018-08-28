package com.inspur.cmis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by LiuLiHao on 2018/8/20 13:12.
 * 描述： 合同信息
 * 作者： LiuLiHao
 */
@Entity
@Table(name="Gc_Contractmain")
public class GccontractmainEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String keycode;
    private String keytype;
    private String extendkeycode;
    private String appcode;
    private Double money;
    private String currency;
    /**
     * 承兑汇票买断合同时保存转贴现日
     */
    private Date startdate;
    private Date enddate;
    private Date lastdate;

    private Integer climit;
    /**
     * 1年2月3日默认为月
     */
    private Integer limitunit;
    /**
     * 0-初始值 1-生效 2-正常到期  3强制到期 4-发生终止 5-生效后删除
     */
    private Integer keyeffectedstate;
    private String keydatestate;
    private String squarestate;
    private String bailacc;
    private Double assuremoney;

    private String assurecur;
    private Integer assurerate;
    /**
     * 外币时存储固定利率，人民币时执行利率
     */
    private Integer interest;
    /**
     * 1年利率(百分位)2月利率(千分位)3日利率(万分位)
     */
    private String interestunit;
    /**
     * 对公:1月2季3半年;个人:1月2季
     */
    private Integer squareinterestmode;
    /**
     * 1固定2浮动3其他
     */
    private Integer ratetype;
    /**
     * 1上浮2下浮3不浮动
     */
    private Integer floattype;
    private Integer baserate;
    /**
     * 01六个月以内（含）02六个月至一年（含）03一年至三年（含）04三年至五年（含）05五年以上
     */
    private String baseratetype;
    private Integer floatrate;
    private Integer intrstratefdot;
    private String loanpurpose;
    private Integer contractcount;
    /**
     * 1诉讼2仲裁
     */
    private Integer solutionmode;
    /**
     * 0002循环；0001非循环
     */
    private String usetype;
    private Date terminaldate;
    private String aribtrateorganization;
    private String busimanager;
    private Date createdate;
    private Date passeddate;
    private String assistbusimanager;
    /**
     * 1新增;2收回再贷;3借新还旧;4资产重组;5转入
     */
    private Integer loantype;
    /**
     * 1新增,2展期,3重组4借新还旧
     */
    private Integer busistate;
    /**
     * T是；F否；默认为否
     */
    private String lowriskflag;
    /**
     * C000信用C101保证C102抵押C103质押
     */
    private String mainassure;
    /**
     * 默认为0000，从左向右分别表示信用，
     * 保证；抵押；质押；即1000代表信用，
     * 0100表示保证，
     * 0010表示抵押，
     * 0001标识质押，
     * 0110标识保证和抵押等等
     */
    private String subassure;
    /**
     * 0基本存款帐户；1一般存款帐户
     */
    private String accounttype;
    /**
     * 0委托扣款1自主还款
     */
    private String repaytype;
    /**
     * 对公:01一次性还本02分期还本;
     * 个人:01定期结息，到期日利随本清02定期结息，
     * 按合同约定分期还本03等额本息04等额本金05利随本清06其他还款方法
     */
    private String repaymethod;
    /**
     * 1月，2季，3其他
     */
    private Integer repaycycle;
    private Double repaymoney;
    /**
     * 个人购房借款合同时，若借款种类选择“其他”时，该字段存储“其他”字段的内容
     */
    private String loanpurposeremark;
    private String instcode;
    private Date operdatetime;
    private String operator;

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

    public String getExtendkeycode() {
        return extendkeycode;
    }

    public void setExtendkeycode(String extendkeycode) {
        this.extendkeycode = extendkeycode;
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode;
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

    public Integer getClimit() {
        return climit;
    }

    public void setClimit(Integer climit) {
        this.climit = climit;
    }

    public Integer getLimitunit() {
        return limitunit;
    }

    public void setLimitunit(Integer limitunit) {
        this.limitunit = limitunit;
    }

    public Integer getKeyeffectedstate() {
        return keyeffectedstate;
    }

    public void setKeyeffectedstate(Integer keyeffectedstate) {
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

    public String getBailacc() {
        return bailacc;
    }

    public void setBailacc(String bailacc) {
        this.bailacc = bailacc;
    }

    public Double getAssuremoney() {
        return assuremoney;
    }

    public void setAssuremoney(Double assuremoney) {
        this.assuremoney = assuremoney;
    }

    public String getAssurecur() {
        return assurecur;
    }

    public void setAssurecur(String assurecur) {
        this.assurecur = assurecur;
    }

    public Integer getAssurerate() {
        return assurerate;
    }

    public void setAssurerate(Integer assurerate) {
        this.assurerate = assurerate;
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

    public Integer getSquareinterestmode() {
        return squareinterestmode;
    }

    public void setSquareinterestmode(Integer squareinterestmode) {
        this.squareinterestmode = squareinterestmode;
    }

    public Integer getRatetype() {
        return ratetype;
    }

    public void setRatetype(Integer ratetype) {
        this.ratetype = ratetype;
    }

    public Integer getFloattype() {
        return floattype;
    }

    public void setFloattype(Integer floattype) {
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

    public Integer getContractcount() {
        return contractcount;
    }

    public void setContractcount(Integer contractcount) {
        this.contractcount = contractcount;
    }

    public Integer getSolutionmode() {
        return solutionmode;
    }

    public void setSolutionmode(Integer solutionmode) {
        this.solutionmode = solutionmode;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    public Date getTerminaldate() {
        return terminaldate;
    }

    public void setTerminaldate(Date terminaldate) {
        this.terminaldate = terminaldate;
    }

    public String getAribtrateorganization() {
        return aribtrateorganization;
    }

    public void setAribtrateorganization(String aribtrateorganization) {
        this.aribtrateorganization = aribtrateorganization;
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

    public String getAssistbusimanager() {
        return assistbusimanager;
    }

    public void setAssistbusimanager(String assistbusimanager) {
        this.assistbusimanager = assistbusimanager;
    }

    public Integer getLoantype() {
        return loantype;
    }

    public void setLoantype(Integer loantype) {
        this.loantype = loantype;
    }

    public Integer getBusistate() {
        return busistate;
    }

    public void setBusistate(Integer busistate) {
        this.busistate = busistate;
    }

    public String getLowriskflag() {
        return lowriskflag;
    }

    public void setLowriskflag(String lowriskflag) {
        this.lowriskflag = lowriskflag;
    }

    public String getMainassure() {
        return mainassure;
    }

    public void setMainassure(String mainassure) {
        this.mainassure = mainassure;
    }

    public String getSubassure() {
        return subassure;
    }

    public void setSubassure(String subassure) {
        this.subassure = subassure;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getRepaytype() {
        return repaytype;
    }

    public void setRepaytype(String repaytype) {
        this.repaytype = repaytype;
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod;
    }

    public Integer getRepaycycle() {
        return repaycycle;
    }

    public void setRepaycycle(Integer repaycycle) {
        this.repaycycle = repaycycle;
    }

    public Double getRepaymoney() {
        return repaymoney;
    }

    public void setRepaymoney(Double repaymoney) {
        this.repaymoney = repaymoney;
    }

    public String getLoanpurposeremark() {
        return loanpurposeremark;
    }

    public void setLoanpurposeremark(String loanpurposeremark) {
        this.loanpurposeremark = loanpurposeremark;
    }

    public String getInstcode() {
        return instcode;
    }

    public void setInstcode(String instcode) {
        this.instcode = instcode;
    }

    public Date getOperdatetime() {
        return operdatetime;
    }

    public void setOperdatetime(Date operdatetime) {
        this.operdatetime = operdatetime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
