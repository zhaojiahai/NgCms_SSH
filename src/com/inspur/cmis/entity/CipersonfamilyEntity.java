package com.inspur.cmis.entity;

import java.sql.Timestamp;

/**
 * Created by LiuLiHao on 2018/8/19 19:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class CipersonfamilyEntity {
    private String id;
    private String partyid;
    private String custid;
    private String typeid;
    private String name;
    private String sex;
    private String familymbercction;
    private String papertype;
    private String papercode;
    private String movephone;
    private String fixationphone;
    private String jobunit;
    private String createduser;
    private String createdtime;
    private String groupid;
    private String instcitycode;
    private String deletereason;
    private String status;
    private String operator;
    private Timestamp operdatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartyid() {
        return partyid;
    }

    public void setPartyid(String partyid) {
        this.partyid = partyid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFamilymbercction() {
        return familymbercction;
    }

    public void setFamilymbercction(String familymbercction) {
        this.familymbercction = familymbercction;
    }

    public String getPapertype() {
        return papertype;
    }

    public void setPapertype(String papertype) {
        this.papertype = papertype;
    }

    public String getPapercode() {
        return papercode;
    }

    public void setPapercode(String papercode) {
        this.papercode = papercode;
    }

    public String getMovephone() {
        return movephone;
    }

    public void setMovephone(String movephone) {
        this.movephone = movephone;
    }

    public String getFixationphone() {
        return fixationphone;
    }

    public void setFixationphone(String fixationphone) {
        this.fixationphone = fixationphone;
    }

    public String getJobunit() {
        return jobunit;
    }

    public void setJobunit(String jobunit) {
        this.jobunit = jobunit;
    }

    public String getCreateduser() {
        return createduser;
    }

    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getInstcitycode() {
        return instcitycode;
    }

    public void setInstcitycode(String instcitycode) {
        this.instcitycode = instcitycode;
    }

    public String getDeletereason() {
        return deletereason;
    }

    public void setDeletereason(String deletereason) {
        this.deletereason = deletereason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

        CipersonfamilyEntity that = (CipersonfamilyEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (partyid != null ? !partyid.equals(that.partyid) : that.partyid != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (typeid != null ? !typeid.equals(that.typeid) : that.typeid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (familymbercction != null ? !familymbercction.equals(that.familymbercction) : that.familymbercction != null)
            return false;
        if (papertype != null ? !papertype.equals(that.papertype) : that.papertype != null) return false;
        if (papercode != null ? !papercode.equals(that.papercode) : that.papercode != null) return false;
        if (movephone != null ? !movephone.equals(that.movephone) : that.movephone != null) return false;
        if (fixationphone != null ? !fixationphone.equals(that.fixationphone) : that.fixationphone != null)
            return false;
        if (jobunit != null ? !jobunit.equals(that.jobunit) : that.jobunit != null) return false;
        if (createduser != null ? !createduser.equals(that.createduser) : that.createduser != null) return false;
        if (createdtime != null ? !createdtime.equals(that.createdtime) : that.createdtime != null) return false;
        if (groupid != null ? !groupid.equals(that.groupid) : that.groupid != null) return false;
        if (instcitycode != null ? !instcitycode.equals(that.instcitycode) : that.instcitycode != null) return false;
        if (deletereason != null ? !deletereason.equals(that.deletereason) : that.deletereason != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (partyid != null ? partyid.hashCode() : 0);
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (familymbercction != null ? familymbercction.hashCode() : 0);
        result = 31 * result + (papertype != null ? papertype.hashCode() : 0);
        result = 31 * result + (papercode != null ? papercode.hashCode() : 0);
        result = 31 * result + (movephone != null ? movephone.hashCode() : 0);
        result = 31 * result + (fixationphone != null ? fixationphone.hashCode() : 0);
        result = 31 * result + (jobunit != null ? jobunit.hashCode() : 0);
        result = 31 * result + (createduser != null ? createduser.hashCode() : 0);
        result = 31 * result + (createdtime != null ? createdtime.hashCode() : 0);
        result = 31 * result + (groupid != null ? groupid.hashCode() : 0);
        result = 31 * result + (instcitycode != null ? instcitycode.hashCode() : 0);
        result = 31 * result + (deletereason != null ? deletereason.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
