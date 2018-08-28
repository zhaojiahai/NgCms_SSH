package com.inspur.cmis.entity;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/28 13:21.
 * 描述：
 * 作者： LiuLiHao
 */
public class CcflowopinionhisEntityPK implements Serializable {
    private String processid;
    private String workitemid;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CcflowopinionhisEntityPK that = (CcflowopinionhisEntityPK) o;

        if (processid != null ? !processid.equals(that.processid) : that.processid != null) return false;
        if (workitemid != null ? !workitemid.equals(that.workitemid) : that.workitemid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = processid != null ? processid.hashCode() : 0;
        result = 31 * result + (workitemid != null ? workitemid.hashCode() : 0);
        return result;
    }
}
