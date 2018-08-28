package com.inspur.cmis.entity;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/28 13:21.
 * 描述：
 * 作者： LiuLiHao
 */
public class CilicensecertificateEntityPK implements Serializable {
    private String id;
    private String custid;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CilicensecertificateEntityPK that = (CilicensecertificateEntityPK) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        return result;
    }
}
