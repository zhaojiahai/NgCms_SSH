package com.inspur.cmis.action;

import com.inspur.cmis.entity.PmClassEntity;
import com.inspur.cmis.service.PmClassService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.GsonUtils;
import com.inspur.common.util.HQLHelper;
import com.inspur.common.util.IsNullUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by LiuLiHao on 2018/8/24 10:38.
 * 描述： 参数类别
 * 作者： LiuLiHao
 */
public class ParamClassAction extends BaseAction {
    private static final long serialVersionUID = 711362308004342341L;

    @Autowired
    private PmClassService pmClassService;

    private PmClassEntity pmClassEntity;
    /**
     * 列表
     * @return
     */
    public String pmClassInfo(){
        //分页查询
        HQLHelper hqlHelper = new HQLHelper(PmClassEntity.class);
        int page = 1;
        if (currentPage!=null && currentPage>0){
            page = currentPage;
        }
        //条件查询
        if (pmClassEntity!=null && StringUtils.isNotBlank(pmClassEntity.getPmKey())){
            hqlHelper.addWhere(" o.pmKey = ?",pmClassEntity.getPmKey());
            request.setAttribute("pmKey",pmClassEntity.getPmKey());
        }
        //名字以 xxx开头的
        if (pmClassEntity!=null && StringUtils.isNotBlank(pmClassEntity.getName())){
            hqlHelper.addWhere(" o.name like ?",pmClassEntity.getName()+"%");
            request.setAttribute("pmName",pmClassEntity.getName());
        }
        hqlHelper.addWhere(" o.isDelete != 1");

        //设置页数
        PaginationBean pageBean = pmClassService.getPageBean(hqlHelper, page);
        request.setAttribute("pageBean",pageBean);

        return "pmClassInfo";
    }

    /**
     * 添加页面
     * @return
     */
    public String pmClassAddHtml(){
        return "pmClassAddHtml";
    }

    /**
     * ajax添加
     * @return
     */
    public String pmClassAdd(){
        JsonResult jsonResult = new JsonResult(0,"添加失败");
        pmClassEntity.setIsDelete(0);
        pmClassEntity.setDescription("");
        pmClassService.add(pmClassEntity);
        jsonResult = new JsonResult(1,"添加成功");
        result = GsonUtils.toJson(jsonResult);

        return "pmClassAdd";
    }


    /**
     * 修改页面
     * @return
     */
    public String pmClassUpdateHtml(){
        if (pmClassId!=null && pmClassId>0){
            PmClassEntity entity = pmClassService.findObjectById(pmClassId);
            request.setAttribute("updateEntity",entity);
        }
        return "pmClassUpdateHtml";
    }

    /**
     * ajax修改
     * @return
     */
    public String pmClassUpdate(){
        //先ID查询一下再保存 否则其它字段都空
        PmClassEntity dbEntity = pmClassService.findObjectById(pmClassId);
        JsonResult jsonResult = new JsonResult(0,"修改失败");

        if (IsNullUtils.isNotNull(upPmKey,upPmName)){
            dbEntity.setPmKey(upPmKey);
            dbEntity.setName(upPmName);
            //修改时间
            pmClassService.update(dbEntity);
            jsonResult = new JsonResult(1,"修改成功");
        }
        result = GsonUtils.toJson(jsonResult);

        return "pmClassUpdate";
    }

    /**
     * ajax删除
     * @return
     */
    public String pmClassDelete(){
        JsonResult jsonResult = new JsonResult(0,"删除失败");

        if (IsNullUtils.isNotNull(deletes)){
            pmClassService.deleteAll(deletes);
            jsonResult = new JsonResult(1,"删除成功");
        }
        result = GsonUtils.toJson(jsonResult);
        return "pmClassDelete";
    }


    //页数
    private Integer currentPage;
    private Integer pmClassId;
    ///////////ajax返回数据使用/////////////
    private String result;
    ///////////ajax修改使用/////////////
    private String upPmKey;
    private String upPmName;
    ///////////删除使用/////////////
    private String deletes;

    public String getDeletes() {
        return deletes;
    }

    public void setDeletes(String deletes) {
        this.deletes = deletes;
    }

    public String getUpPmKey() {
        return upPmKey;
    }

    public void setUpPmKey(String upPmKey) {
        this.upPmKey = upPmKey;
    }

    public String getUpPmName() {
        return upPmName;
    }

    public void setUpPmName(String upPmName) {
        this.upPmName = upPmName;
    }

    public Integer getPmClassId() {
        return pmClassId;
    }

    public void setPmClassId(Integer pmClassId) {
        this.pmClassId = pmClassId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public PmClassEntity getPmClassEntity() {
        return pmClassEntity;
    }

    public void setPmClassEntity(PmClassEntity pmClassEntity) {
        this.pmClassEntity = pmClassEntity;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

}
