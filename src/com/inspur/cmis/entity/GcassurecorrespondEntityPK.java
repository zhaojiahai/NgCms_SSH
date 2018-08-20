package com.inspur.cmis.entity;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/20 13:12.
 * 描述：
 * 作者： LiuLiHao
 */
public class GcassurecorrespondEntityPK implements Serializable {
    private String keycode;
    private String sequenceno;

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode;
    }

    public String getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(String sequenceno) {
        this.sequenceno = sequenceno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GcassurecorrespondEntityPK that = (GcassurecorrespondEntityPK) o;

        if (keycode != null ? !keycode.equals(that.keycode) : that.keycode != null) return false;
        if (sequenceno != null ? !sequenceno.equals(that.sequenceno) : that.sequenceno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keycode != null ? keycode.hashCode() : 0;
        result = 31 * result + (sequenceno != null ? sequenceno.hashCode() : 0);
        return result;
    }
}
