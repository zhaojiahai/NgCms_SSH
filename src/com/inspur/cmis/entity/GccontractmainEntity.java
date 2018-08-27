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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GccontractmainEntity that = (GccontractmainEntity) o;

        if (keycode != null ? !keycode.equals(that.keycode) : that.keycode != null) return false;
        if (keytype != null ? !keytype.equals(that.keytype) : that.keytype != null) return false;
        if (extendkeycode != null ? !extendkeycode.equals(that.extendkeycode) : that.extendkeycode != null)
            return false;
        if (appcode != null ? !appcode.equals(that.appcode) : that.appcode != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (startdate != null ? !startdate.equals(that.startdate) : that.startdate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
        if (lastdate != null ? !lastdate.equals(that.lastdate) : that.lastdate != null) return false;
        if (limitunit != null ? !limitunit.equals(that.limitunit) : that.limitunit != null) return false;
        if (keyeffectedstate != null ? !keyeffectedstate.equals(that.keyeffectedstate) : that.keyeffectedstate != null)
            return false;
        if (keydatestate != null ? !keydatestate.equals(that.keydatestate) : that.keydatestate != null) return false;
        if (squarestate != null ? !squarestate.equals(that.squarestate) : that.squarestate != null) return false;
        if (bailacc != null ? !bailacc.equals(that.bailacc) : that.bailacc != null) return false;
        if (assuremoney != null ? !assuremoney.equals(that.assuremoney) : that.assuremoney != null) return false;
        if (assurecur != null ? !assurecur.equals(that.assurecur) : that.assurecur != null) return false;
        if (assurerate != null ? !assurerate.equals(that.assurerate) : that.assurerate != null) return false;
        if (interest != null ? !interest.equals(that.interest) : that.interest != null) return false;
        if (interestunit != null ? !interestunit.equals(that.interestunit) : that.interestunit != null) return false;
        if (squareinterestmode != null ? !squareinterestmode.equals(that.squareinterestmode) : that.squareinterestmode != null)
            return false;
        if (ratetype != null ? !ratetype.equals(that.ratetype) : that.ratetype != null) return false;
        if (floattype != null ? !floattype.equals(that.floattype) : that.floattype != null) return false;
        if (baserate != null ? !baserate.equals(that.baserate) : that.baserate != null) return false;
        if (baseratetype != null ? !baseratetype.equals(that.baseratetype) : that.baseratetype != null) return false;
        if (floatrate != null ? !floatrate.equals(that.floatrate) : that.floatrate != null) return false;
        if (intrstratefdot != null ? !intrstratefdot.equals(that.intrstratefdot) : that.intrstratefdot != null)
            return false;
        if (loanpurpose != null ? !loanpurpose.equals(that.loanpurpose) : that.loanpurpose != null) return false;
        if (contractcount != null ? !contractcount.equals(that.contractcount) : that.contractcount != null)
            return false;
        if (solutionmode != null ? !solutionmode.equals(that.solutionmode) : that.solutionmode != null) return false;
        if (usetype != null ? !usetype.equals(that.usetype) : that.usetype != null) return false;
        if (terminaldate != null ? !terminaldate.equals(that.terminaldate) : that.terminaldate != null) return false;
        if (aribtrateorganization != null ? !aribtrateorganization.equals(that.aribtrateorganization) : that.aribtrateorganization != null)
            return false;
        if (busimanager != null ? !busimanager.equals(that.busimanager) : that.busimanager != null) return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (passeddate != null ? !passeddate.equals(that.passeddate) : that.passeddate != null) return false;
        if (assistbusimanager != null ? !assistbusimanager.equals(that.assistbusimanager) : that.assistbusimanager != null)
            return false;
        if (loantype != null ? !loantype.equals(that.loantype) : that.loantype != null) return false;
        if (busistate != null ? !busistate.equals(that.busistate) : that.busistate != null) return false;
        if (lowriskflag != null ? !lowriskflag.equals(that.lowriskflag) : that.lowriskflag != null) return false;
        if (mainassure != null ? !mainassure.equals(that.mainassure) : that.mainassure != null) return false;
        if (subassure != null ? !subassure.equals(that.subassure) : that.subassure != null) return false;
        if (accounttype != null ? !accounttype.equals(that.accounttype) : that.accounttype != null) return false;
        if (repaytype != null ? !repaytype.equals(that.repaytype) : that.repaytype != null) return false;
        if (repaymethod != null ? !repaymethod.equals(that.repaymethod) : that.repaymethod != null) return false;
        if (repaycycle != null ? !repaycycle.equals(that.repaycycle) : that.repaycycle != null) return false;
        if (repaymoney != null ? !repaymoney.equals(that.repaymoney) : that.repaymoney != null) return false;
        if (loanpurposeremark != null ? !loanpurposeremark.equals(that.loanpurposeremark) : that.loanpurposeremark != null)
            return false;
        if (instcode != null ? !instcode.equals(that.instcode) : that.instcode != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keycode != null ? keycode.hashCode() : 0;
        result = 31 * result + (keytype != null ? keytype.hashCode() : 0);
        result = 31 * result + (extendkeycode != null ? extendkeycode.hashCode() : 0);
        result = 31 * result + (appcode != null ? appcode.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        result = 31 * result + (limitunit != null ? limitunit.hashCode() : 0);
        result = 31 * result + (keyeffectedstate != null ? keyeffectedstate.hashCode() : 0);
        result = 31 * result + (keydatestate != null ? keydatestate.hashCode() : 0);
        result = 31 * result + (squarestate != null ? squarestate.hashCode() : 0);
        result = 31 * result + (bailacc != null ? bailacc.hashCode() : 0);
        result = 31 * result + (assuremoney != null ? assuremoney.hashCode() : 0);
        result = 31 * result + (assurecur != null ? assurecur.hashCode() : 0);
        result = 31 * result + (assurerate != null ? assurerate.hashCode() : 0);
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        result = 31 * result + (interestunit != null ? interestunit.hashCode() : 0);
        result = 31 * result + (squareinterestmode != null ? squareinterestmode.hashCode() : 0);
        result = 31 * result + (ratetype != null ? ratetype.hashCode() : 0);
        result = 31 * result + (floattype != null ? floattype.hashCode() : 0);
        result = 31 * result + (baserate != null ? baserate.hashCode() : 0);
        result = 31 * result + (baseratetype != null ? baseratetype.hashCode() : 0);
        result = 31 * result + (floatrate != null ? floatrate.hashCode() : 0);
        result = 31 * result + (intrstratefdot != null ? intrstratefdot.hashCode() : 0);
        result = 31 * result + (loanpurpose != null ? loanpurpose.hashCode() : 0);
        result = 31 * result + (contractcount != null ? contractcount.hashCode() : 0);
        result = 31 * result + (solutionmode != null ? solutionmode.hashCode() : 0);
        result = 31 * result + (usetype != null ? usetype.hashCode() : 0);
        result = 31 * result + (terminaldate != null ? terminaldate.hashCode() : 0);
        result = 31 * result + (aribtrateorganization != null ? aribtrateorganization.hashCode() : 0);
        result = 31 * result + (busimanager != null ? busimanager.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (passeddate != null ? passeddate.hashCode() : 0);
        result = 31 * result + (assistbusimanager != null ? assistbusimanager.hashCode() : 0);
        result = 31 * result + (loantype != null ? loantype.hashCode() : 0);
        result = 31 * result + (busistate != null ? busistate.hashCode() : 0);
        result = 31 * result + (lowriskflag != null ? lowriskflag.hashCode() : 0);
        result = 31 * result + (mainassure != null ? mainassure.hashCode() : 0);
        result = 31 * result + (subassure != null ? subassure.hashCode() : 0);
        result = 31 * result + (accounttype != null ? accounttype.hashCode() : 0);
        result = 31 * result + (repaytype != null ? repaytype.hashCode() : 0);
        result = 31 * result + (repaymethod != null ? repaymethod.hashCode() : 0);
        result = 31 * result + (repaycycle != null ? repaycycle.hashCode() : 0);
        result = 31 * result + (repaymoney != null ? repaymoney.hashCode() : 0);
        result = 31 * result + (loanpurposeremark != null ? loanpurposeremark.hashCode() : 0);
        result = 31 * result + (instcode != null ? instcode.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        return result;
    }
}
