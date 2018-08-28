package com.inspur.cmis.action;

import com.inspur.cmis.entity.GcloancreditEntity;
import com.inspur.cmis.service.ClCreditService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.GsonUtils;
import com.inspur.common.util.HQLHelper;
import com.inspur.common.util.IsNullUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by LiuLiHao on 2018年8月28日11:03:57
 * 描述： 授信管理
 * 作者： LiuLiHao
 */
public class ClCreditAction extends BaseAction {
    private static final long serialVersionUID = 711362308004342341L;

    @Autowired
    private ClCreditService clCreditService;

    /**
     * 列表
     *
     * @return
     */
    public String creditInfo() {
        //分页查询
        HQLHelper hqlHelper = new HQLHelper(GcloancreditEntity.class);
        int page = 1;
        if (currentPage!=null && currentPage>0){
            page = currentPage;
        }
        //条件查询
        if (entity!=null && entity.getCustid()!=null){
            hqlHelper.addWhere(" o.custid like ? ",entity.getCustid()+"%");
            request.setAttribute("custid",entity.getCustid());
        }
        //名字以 xxx 开头的
        if (entity!=null && StringUtils.isNotBlank(entity.getCustname())){
            hqlHelper.addWhere(" o.custname like ?",entity.getCustname()+"%");
            request.setAttribute("custname",entity.getCustname());
        }
        //日期范围查询 在 xxx 之后的
        if (entity!=null && entity.getCreatedate()!=null){
            hqlHelper.addWhere(" o.createdate > ?",entity.getCreatedate());
            request.setAttribute("searchDate",entity.getCreatedate());
        }
        //查找没有删除的
        hqlHelper.addWhere(" o.isDelete != 1");

        //设置页数
        PaginationBean pageBean = clCreditService.getPageBean(hqlHelper, page);
        request.setAttribute("pageBean",pageBean);

        return "creditInfo";
    }

    /**
     * 添加页面
     *
     * @return
     */
    public String creditAddHtml() {
        return "creditAddHtml";
    }

    /**
     * 修改页面
     *
     * @return
     */
    public String creditUpdateHtml() {
        if (entityId!=null && entityId>0){
            GcloancreditEntity entity = clCreditService.findObjectById(entityId);
            request.setAttribute("updateEntity", entity);
        }
        return "creditUpdateHtml";
    }

    /**
     * 修改
     *
     * @return
     */
    public String creditUpdate() {
        JsonResult jsonResult = new JsonResult(0,"修改失败");
        clCreditService.update(updateEntity);

        jsonResult = new JsonResult(1,"修改成功");
        result = GsonUtils.toJson(jsonResult);

        return "creditUpdate";
    }


    /**
     * 删除
     * @return
     */
    public String creditDelete(){
        JsonResult jsonResult = new JsonResult(0,"删除失败");

        if (IsNullUtils.isNotNull(deletes)){
            clCreditService.deleteAll(deletes);
            jsonResult = new JsonResult(1,"删除成功");
        }
        result = GsonUtils.toJson(jsonResult);
        return "delete";
    }

    /**
     * 添加
     *
     * @return
     */
    public String creditAdd() {
        JsonResult jsonResult = new JsonResult(0, "添加失败");
        //设置创建日期
        entity.setCreatedate(new Date());
        entity.setIsDelete(0);
        clCreditService.add(entity);
        jsonResult = new JsonResult(1, "添加成功");
        result = GsonUtils.toJson(jsonResult);

        return "creditAdd";
    }


    //页数
    private Integer currentPage;
    ///////////ajax返回数据使用/////////////
    private String result;
    ///////////批量操作使用/////////////
    private String deletes;


    private Integer entityId;
    private GcloancreditEntity updateEntity;

    public String getDeletes() {
        return deletes;
    }

    public void setDeletes(String deletes) {
        this.deletes = deletes;
    }

    public GcloancreditEntity getUpdateEntity() {
        return updateEntity;
    }

    public void setUpdateEntity(GcloancreditEntity updateEntity) {
        this.updateEntity = updateEntity;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    private GcloancreditEntity entity;

    public GcloancreditEntity getEntity() {
        return entity;
    }

    public void setEntity(GcloancreditEntity entity) {
        this.entity = entity;
    }
}
