package com.inspur.cmis.entity;

/**
 * Created by LiuLiHao on 2018/8/20 13:12.
 * 描述：
 * 作者： LiuLiHao
 */
public class GcassurecorrespondEntity {
    private String keycode;
    private String keytype;
    private String upkeycode;
    private String upkeytype;
    private String sequenceno;
    private String acontkeycode;
    private String acontkeytype;
    private String confirmmethod;
    private Long useassuremoney;
    private String useassuremoneycur;
    private String keyeffectedstate;
    private String keydatestate;

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

    public String getUpkeycode() {
        return upkeycode;
    }

    public void setUpkeycode(String upkeycode) {
        this.upkeycode = upkeycode;
    }

    public String getUpkeytype() {
        return upkeytype;
    }

    public void setUpkeytype(String upkeytype) {
        this.upkeytype = upkeytype;
    }

    public String getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(String sequenceno) {
        this.sequenceno = sequenceno;
    }

    public String getAcontkeycode() {
        return acontkeycode;
    }

    public void setAcontkeycode(String acontkeycode) {
        this.acontkeycode = acontkeycode;
    }

    public String getAcontkeytype() {
        return acontkeytype;
    }

    public void setAcontkeytype(String acontkeytype) {
        this.acontkeytype = acontkeytype;
    }

    public String getConfirmmethod() {
        return confirmmethod;
    }

    public void setConfirmmethod(String confirmmethod) {
        this.confirmmethod = confirmmethod;
    }

    public Long getUseassuremoney() {
        return useassuremoney;
    }

    public void setUseassuremoney(Long useassuremoney) {
        this.useassuremoney = useassuremoney;
    }

    public String getUseassuremoneycur() {
        return useassuremoneycur;
    }

    public void setUseassuremoneycur(String useassuremoneycur) {
        this.useassuremoneycur = useassuremoneycur;
    }

    public String getKeyeffectedstate() {
        return keyeffectedstate;
    }

    public void setKeyeffectedstate(String keyeffectedstate) {
        this.keyeffectedstate = keyeffectedstate;
    }

    public String getKeydatestate() {
        return keydatestate;
    }

    public void setKeydatestate(String keydatestate) {
        this.keydatestate = keydatestate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GcassurecorrespondEntity that = (GcassurecorrespondEntity) o;

        if (keycode != null ? !keycode.equals(that.keycode) : that.keycode != null) return false;
        if (keytype != null ? !keytype.equals(that.keytype) : that.keytype != null) return false;
        if (upkeycode != null ? !upkeycode.equals(that.upkeycode) : that.upkeycode != null) return false;
        if (upkeytype != null ? !upkeytype.equals(that.upkeytype) : that.upkeytype != null) return false;
        if (sequenceno != null ? !sequenceno.equals(that.sequenceno) : that.sequenceno != null) return false;
        if (acontkeycode != null ? !acontkeycode.equals(that.acontkeycode) : that.acontkeycode != null) return false;
        if (acontkeytype != null ? !acontkeytype.equals(that.acontkeytype) : that.acontkeytype != null) return false;
        if (confirmmethod != null ? !confirmmethod.equals(that.confirmmethod) : that.confirmmethod != null)
            return false;
        if (useassuremoney != null ? !useassuremoney.equals(that.useassuremoney) : that.useassuremoney != null)
            return false;
        if (useassuremoneycur != null ? !useassuremoneycur.equals(that.useassuremoneycur) : that.useassuremoneycur != null)
            return false;
        if (keyeffectedstate != null ? !keyeffectedstate.equals(that.keyeffectedstate) : that.keyeffectedstate != null)
            return false;
        if (keydatestate != null ? !keydatestate.equals(that.keydatestate) : that.keydatestate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keycode != null ? keycode.hashCode() : 0;
        result = 31 * result + (keytype != null ? keytype.hashCode() : 0);
        result = 31 * result + (upkeycode != null ? upkeycode.hashCode() : 0);
        result = 31 * result + (upkeytype != null ? upkeytype.hashCode() : 0);
        result = 31 * result + (sequenceno != null ? sequenceno.hashCode() : 0);
        result = 31 * result + (acontkeycode != null ? acontkeycode.hashCode() : 0);
        result = 31 * result + (acontkeytype != null ? acontkeytype.hashCode() : 0);
        result = 31 * result + (confirmmethod != null ? confirmmethod.hashCode() : 0);
        result = 31 * result + (useassuremoney != null ? useassuremoney.hashCode() : 0);
        result = 31 * result + (useassuremoneycur != null ? useassuremoneycur.hashCode() : 0);
        result = 31 * result + (keyeffectedstate != null ? keyeffectedstate.hashCode() : 0);
        result = 31 * result + (keydatestate != null ? keydatestate.hashCode() : 0);
        return result;
    }
}
