package com.inspur.cmis.entity;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/19 19:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class CiexternalinvestmentEntityPK implements Serializable {
    private long id;
    private String custid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

        CiexternalinvestmentEntityPK that = (CiexternalinvestmentEntityPK) o;

        if (id != that.id) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        return result;
    }
}
