package com.inspur.cmis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by LiuLiHao on 2018/8/19 19:38.
 * 描述： 对公客户
 * 作者： LiuLiHao
 */
@Entity
@Table(name = "Ci_CustBasInfoEntity")
public class CicustbasinfoEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String custid;
    private String typeid;
    private String custtype;
    private String cname;
    private String orgcertcode;
    private String ecoattr;
    private String controlmode;
    private String enterprisestatus;
    private String ifquotedcompany;
    private String principal;
    private String outlaysource;
    private Integer launchcapital;
    private String enrolmanageorg;
    private String syaddr;
    private String busisphere;
    private String custproperty;
    private String ifnxpartner;
    private String custscale;
    private String lncardno;
    private String iflncardcheck;
    private Date lncardcheckdate;
    private Integer nxpartnermoney;
    private String istmp;
    private String licencecode;
    private String regsttype;
    private String mainbusiness;
    private String certifyflag;
    private Date begindate;
    private Date finishdate;
    private Integer regstamt;
    private String regstcurtype;
    private Integer realcaptamt;
    private String realcaptcurtype;
    private Date certifydate;
    private Date setdate;
    private String regstaddr;
    private String busirange;
    private String taxlicenseno;
    private String iftaxlicenseorg;
    private String linkman;
    private String telephone;
    private String postalcode;
    private String messageaddr;
    private String relaman;
    private Integer employeenum;
    private String remark;
    private String busimanager;
    private String instcode;
    private String deptcode;
    private String instcitycode;
    private String status;
    private String inputman;
    private Date inputdate;
    private String groupid;
    private String operator;
    private Date operdatetime;
    private String custstatus;
    private String assistbusimanage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getOrgcertcode() {
        return orgcertcode;
    }

    public void setOrgcertcode(String orgcertcode) {
        this.orgcertcode = orgcertcode;
    }

    public String getEcoattr() {
        return ecoattr;
    }

    public void setEcoattr(String ecoattr) {
        this.ecoattr = ecoattr;
    }

    public String getControlmode() {
        return controlmode;
    }

    public void setControlmode(String controlmode) {
        this.controlmode = controlmode;
    }

    public String getEnterprisestatus() {
        return enterprisestatus;
    }

    public void setEnterprisestatus(String enterprisestatus) {
        this.enterprisestatus = enterprisestatus;
    }

    public String getIfquotedcompany() {
        return ifquotedcompany;
    }

    public void setIfquotedcompany(String ifquotedcompany) {
        this.ifquotedcompany = ifquotedcompany;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getOutlaysource() {
        return outlaysource;
    }

    public void setOutlaysource(String outlaysource) {
        this.outlaysource = outlaysource;
    }

    public Integer getLaunchcapital() {
        return launchcapital;
    }

    public void setLaunchcapital(Integer launchcapital) {
        this.launchcapital = launchcapital;
    }

    public String getEnrolmanageorg() {
        return enrolmanageorg;
    }

    public void setEnrolmanageorg(String enrolmanageorg) {
        this.enrolmanageorg = enrolmanageorg;
    }

    public String getSyaddr() {
        return syaddr;
    }

    public void setSyaddr(String syaddr) {
        this.syaddr = syaddr;
    }

    public String getBusisphere() {
        return busisphere;
    }

    public void setBusisphere(String busisphere) {
        this.busisphere = busisphere;
    }

    public String getCustproperty() {
        return custproperty;
    }

    public void setCustproperty(String custproperty) {
        this.custproperty = custproperty;
    }

    public String getIfnxpartner() {
        return ifnxpartner;
    }

    public void setIfnxpartner(String ifnxpartner) {
        this.ifnxpartner = ifnxpartner;
    }

    public String getCustscale() {
        return custscale;
    }

    public void setCustscale(String custscale) {
        this.custscale = custscale;
    }

    public String getLncardno() {
        return lncardno;
    }

    public void setLncardno(String lncardno) {
        this.lncardno = lncardno;
    }

    public String getIflncardcheck() {
        return iflncardcheck;
    }

    public void setIflncardcheck(String iflncardcheck) {
        this.iflncardcheck = iflncardcheck;
    }

    public Date getLncardcheckdate() {
        return lncardcheckdate;
    }

    public void setLncardcheckdate(Date lncardcheckdate) {
        this.lncardcheckdate = lncardcheckdate;
    }

    public Integer getNxpartnermoney() {
        return nxpartnermoney;
    }

    public void setNxpartnermoney(Integer nxpartnermoney) {
        this.nxpartnermoney = nxpartnermoney;
    }

    public String getIstmp() {
        return istmp;
    }

    public void setIstmp(String istmp) {
        this.istmp = istmp;
    }

    public String getLicencecode() {
        return licencecode;
    }

    public void setLicencecode(String licencecode) {
        this.licencecode = licencecode;
    }

    public String getRegsttype() {
        return regsttype;
    }

    public void setRegsttype(String regsttype) {
        this.regsttype = regsttype;
    }

    public String getMainbusiness() {
        return mainbusiness;
    }

    public void setMainbusiness(String mainbusiness) {
        this.mainbusiness = mainbusiness;
    }

    public String getCertifyflag() {
        return certifyflag;
    }

    public void setCertifyflag(String certifyflag) {
        this.certifyflag = certifyflag;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public Integer getRegstamt() {
        return regstamt;
    }

    public void setRegstamt(Integer regstamt) {
        this.regstamt = regstamt;
    }

    public String getRegstcurtype() {
        return regstcurtype;
    }

    public void setRegstcurtype(String regstcurtype) {
        this.regstcurtype = regstcurtype;
    }

    public Integer getRealcaptamt() {
        return realcaptamt;
    }

    public void setRealcaptamt(Integer realcaptamt) {
        this.realcaptamt = realcaptamt;
    }

    public String getRealcaptcurtype() {
        return realcaptcurtype;
    }

    public void setRealcaptcurtype(String realcaptcurtype) {
        this.realcaptcurtype = realcaptcurtype;
    }

    public Date getCertifydate() {
        return certifydate;
    }

    public void setCertifydate(Date certifydate) {
        this.certifydate = certifydate;
    }

    public Date getSetdate() {
        return setdate;
    }

    public void setSetdate(Date setdate) {
        this.setdate = setdate;
    }

    public String getRegstaddr() {
        return regstaddr;
    }

    public void setRegstaddr(String regstaddr) {
        this.regstaddr = regstaddr;
    }

    public String getBusirange() {
        return busirange;
    }

    public void setBusirange(String busirange) {
        this.busirange = busirange;
    }

    public String getTaxlicenseno() {
        return taxlicenseno;
    }

    public void setTaxlicenseno(String taxlicenseno) {
        this.taxlicenseno = taxlicenseno;
    }

    public String getIftaxlicenseorg() {
        return iftaxlicenseorg;
    }

    public void setIftaxlicenseorg(String iftaxlicenseorg) {
        this.iftaxlicenseorg = iftaxlicenseorg;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getMessageaddr() {
        return messageaddr;
    }

    public void setMessageaddr(String messageaddr) {
        this.messageaddr = messageaddr;
    }

    public String getRelaman() {
        return relaman;
    }

    public void setRelaman(String relaman) {
        this.relaman = relaman;
    }

    public Integer getEmployeenum() {
        return employeenum;
    }

    public void setEmployeenum(Integer employeenum) {
        this.employeenum = employeenum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBusimanager() {
        return busimanager;
    }

    public void setBusimanager(String busimanager) {
        this.busimanager = busimanager;
    }

    public String getInstcode() {
        return instcode;
    }

    public void setInstcode(String instcode) {
        this.instcode = instcode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getInstcitycode() {
        return instcitycode;
    }

    public void setInstcitycode(String instcitycode) {
        this.instcitycode = instcitycode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInputman() {
        return inputman;
    }

    public void setInputman(String inputman) {
        this.inputman = inputman;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
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

    public String getCuststatus() {
        return custstatus;
    }

    public void setCuststatus(String custstatus) {
        this.custstatus = custstatus;
    }

    public String getAssistbusimanage() {
        return assistbusimanage;
    }

    public void setAssistbusimanage(String assistbusimanage) {
        this.assistbusimanage = assistbusimanage;
    }
}
