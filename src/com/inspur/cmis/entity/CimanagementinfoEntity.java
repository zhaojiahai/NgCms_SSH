package com.inspur.cmis.entity;

import java.sql.Timestamp;

/**
 * Created by LiuLiHao on 2018/8/19 19:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class CimanagementinfoEntity {
    private String id;
    private String custid;
    private String mancustid;
    private String mancustname;
    private String gender;
    private String certtype;
    private String certid;
    private String degree;
    private String telephone;
    private Long expericence;
    private String mantype;
    private String isentershareholder;
    private String background;
    private String resume;
    private String createuser;
    private String createdate;
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

    public String getMancustid() {
        return mancustid;
    }

    public void setMancustid(String mancustid) {
        this.mancustid = mancustid;
    }

    public String getMancustname() {
        return mancustname;
    }

    public void setMancustname(String mancustname) {
        this.mancustname = mancustname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Long getExpericence() {
        return expericence;
    }

    public void setExpericence(Long expericence) {
        this.expericence = expericence;
    }

    public String getMantype() {
        return mantype;
    }

    public void setMantype(String mantype) {
        this.mantype = mantype;
    }

    public String getIsentershareholder() {
        return isentershareholder;
    }

    public void setIsentershareholder(String isentershareholder) {
        this.isentershareholder = isentershareholder;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
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

        CimanagementinfoEntity that = (CimanagementinfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (mancustid != null ? !mancustid.equals(that.mancustid) : that.mancustid != null) return false;
        if (mancustname != null ? !mancustname.equals(that.mancustname) : that.mancustname != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (certtype != null ? !certtype.equals(that.certtype) : that.certtype != null) return false;
        if (certid != null ? !certid.equals(that.certid) : that.certid != null) return false;
        if (degree != null ? !degree.equals(that.degree) : that.degree != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (expericence != null ? !expericence.equals(that.expericence) : that.expericence != null) return false;
        if (mantype != null ? !mantype.equals(that.mantype) : that.mantype != null) return false;
        if (isentershareholder != null ? !isentershareholder.equals(that.isentershareholder) : that.isentershareholder != null)
            return false;
        if (background != null ? !background.equals(that.background) : that.background != null) return false;
        if (resume != null ? !resume.equals(that.resume) : that.resume != null) return false;
        if (createuser != null ? !createuser.equals(that.createuser) : that.createuser != null) return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (instcitycode != null ? !instcitycode.equals(that.instcitycode) : that.instcitycode != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (mancustid != null ? mancustid.hashCode() : 0);
        result = 31 * result + (mancustname != null ? mancustname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (certtype != null ? certtype.hashCode() : 0);
        result = 31 * result + (certid != null ? certid.hashCode() : 0);
        result = 31 * result + (degree != null ? degree.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (expericence != null ? expericence.hashCode() : 0);
        result = 31 * result + (mantype != null ? mantype.hashCode() : 0);
        result = 31 * result + (isentershareholder != null ? isentershareholder.hashCode() : 0);
        result = 31 * result + (background != null ? background.hashCode() : 0);
        result = 31 * result + (resume != null ? resume.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (instcitycode != null ? instcitycode.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
