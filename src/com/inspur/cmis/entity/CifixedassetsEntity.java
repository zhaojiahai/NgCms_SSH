package com.inspur.cmis.entity;

/**
 * Created by LiuLiHao on 2018/8/19 19:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class CifixedassetsEntity {
    private String id;
    private String custid;
    private String assetstype;
    private Long actualarea;
    private Long permitarea;
    private Long amount;
    private Long origvalue;
    private Long life;
    private Long netamount;
    private Long assessedvalue;
    private String ismortgage;
    private String remark;
    private String operator;
    private String operdatetime;

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

    public String getAssetstype() {
        return assetstype;
    }

    public void setAssetstype(String assetstype) {
        this.assetstype = assetstype;
    }

    public Long getActualarea() {
        return actualarea;
    }

    public void setActualarea(Long actualarea) {
        this.actualarea = actualarea;
    }

    public Long getPermitarea() {
        return permitarea;
    }

    public void setPermitarea(Long permitarea) {
        this.permitarea = permitarea;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getOrigvalue() {
        return origvalue;
    }

    public void setOrigvalue(Long origvalue) {
        this.origvalue = origvalue;
    }

    public Long getLife() {
        return life;
    }

    public void setLife(Long life) {
        this.life = life;
    }

    public Long getNetamount() {
        return netamount;
    }

    public void setNetamount(Long netamount) {
        this.netamount = netamount;
    }

    public Long getAssessedvalue() {
        return assessedvalue;
    }

    public void setAssessedvalue(Long assessedvalue) {
        this.assessedvalue = assessedvalue;
    }

    public String getIsmortgage() {
        return ismortgage;
    }

    public void setIsmortgage(String ismortgage) {
        this.ismortgage = ismortgage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperdatetime() {
        return operdatetime;
    }

    public void setOperdatetime(String operdatetime) {
        this.operdatetime = operdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CifixedassetsEntity that = (CifixedassetsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custid != null ? !custid.equals(that.custid) : that.custid != null) return false;
        if (assetstype != null ? !assetstype.equals(that.assetstype) : that.assetstype != null) return false;
        if (actualarea != null ? !actualarea.equals(that.actualarea) : that.actualarea != null) return false;
        if (permitarea != null ? !permitarea.equals(that.permitarea) : that.permitarea != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (origvalue != null ? !origvalue.equals(that.origvalue) : that.origvalue != null) return false;
        if (life != null ? !life.equals(that.life) : that.life != null) return false;
        if (netamount != null ? !netamount.equals(that.netamount) : that.netamount != null) return false;
        if (assessedvalue != null ? !assessedvalue.equals(that.assessedvalue) : that.assessedvalue != null)
            return false;
        if (ismortgage != null ? !ismortgage.equals(that.ismortgage) : that.ismortgage != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operdatetime != null ? !operdatetime.equals(that.operdatetime) : that.operdatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custid != null ? custid.hashCode() : 0);
        result = 31 * result + (assetstype != null ? assetstype.hashCode() : 0);
        result = 31 * result + (actualarea != null ? actualarea.hashCode() : 0);
        result = 31 * result + (permitarea != null ? permitarea.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (origvalue != null ? origvalue.hashCode() : 0);
        result = 31 * result + (life != null ? life.hashCode() : 0);
        result = 31 * result + (netamount != null ? netamount.hashCode() : 0);
        result = 31 * result + (assessedvalue != null ? assessedvalue.hashCode() : 0);
        result = 31 * result + (ismortgage != null ? ismortgage.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operdatetime != null ? operdatetime.hashCode() : 0);
        return result;
    }
}
