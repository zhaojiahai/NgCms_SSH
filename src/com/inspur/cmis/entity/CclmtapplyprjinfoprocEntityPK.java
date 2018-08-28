package com.inspur.cmis.entity;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/28 13:21.
 * 描述：
 * 作者： LiuLiHao
 */
public class CclmtapplyprjinfoprocEntityPK implements Serializable {
    private String processid;
    private String appcode;

    public String getProcessid() {
        return processid;
    }

    public void setProcessid(String processid) {
        this.processid = processid;
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CclmtapplyprjinfoprocEntityPK that = (CclmtapplyprjinfoprocEntityPK) o;

        if (processid != null ? !processid.equals(that.processid) : that.processid != null) return false;
        if (appcode != null ? !appcode.equals(that.appcode) : that.appcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = processid != null ? processid.hashCode() : 0;
        result = 31 * result + (appcode != null ? appcode.hashCode() : 0);
        return result;
    }
}
