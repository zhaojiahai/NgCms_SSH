package com.inspur.cmis.entity;

import java.sql.Timestamp;

/**
 * Created by LiuLiHao on 2018/8/20 13:12.
 * 描述：
 * 作者： LiuLiHao
 */
public class CcflowopinionprocEntity {
    private String processid;
    private String workitemid;
    private String state;
    private String opinion;
    private String operstation;
    private String instcode;
    private String deptcode;
    private Timestamp operdatetime;
    private String operator;

    public String getProcessid() {
        return processid;
    }

    public void setProcessid(String processid) {
        this.processid = processid;
    }

    public String getWorkitemid() {
        return workitemid;
    }

    public void setWorkitemid(String workitemid) {
        this.workitemid = workitemid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getOperstation() {
        return operstation;
    }

    public void setOperstation(String operstation) {
        this.operstation = operstation;
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

    public Timestamp getOperdatetime() {
        return operdatetime;
    }

    public void setOperdatetime(Timestamp operdatetime) {
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

        CcflowopinionprocEntity that = (CcflowopinionprocEntity) o;

        if (processid != null ? !processid.equals(that.processid) : that.processid != null) return false;
        if (workitemid != null ? !workitemid.equals(that.workitemid) : that.workitemid != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (opinion != null ? !opinion.equals(that.opinion) : that.opinion != null) return false;
        if (operstation != null ? !operstation.equals(that.operstation) : that.operstation != null) return false;
        if (instcode != null ? !instcode.equals(that.instcode) : that.instcode != null) return false;
        if (deptcode != null ? !deptcode.equals(that.deptcode) : that.deptcode != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = processid != null ? processid.hashCode() : 0;
        result = 31 * result + (workitemid != null ? workitemid.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (opinion != null ? opinion.hashCode() : 0);
        result = 31 * result + (operstation != null ? operstation.hashCode() : 0);
        result = 31 * result + (instcode != null ? instcode.hashCode() : 0);
        result = 31 * result + (deptcode != null ? deptcode.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        return result;
    }
}
