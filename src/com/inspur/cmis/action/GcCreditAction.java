package com.inspur.cmis.action;

import com.inspur.cmis.entity.GccontractmainEntity;
import com.inspur.cmis.entity.GcloancreditEntity;
import com.inspur.cmis.service.GcContractService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.GsonUtils;
import com.inspur.common.util.HQLHelper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by LiuLiHao on 2018年8月28日11:03:57
 * 描述： 授信
 * 作者： LiuLiHao
 */
public class GcCreditAction extends BaseAction {
    private static final long serialVersionUID = 711362308004342341L;

    @Autowired
    private GcContractService gcContractService;

    /**
     * 列表
     * @return
     */
    public String creditInfo(){
        //分页查询
        HQLHelper hqlHelper = new HQLHelper(GccontractmainEntity.class);
        int page = 1;
        if (currentPage!=null && currentPage>0){
            page = currentPage;
        }
        //设置页数
        PaginationBean pageBean = gcContractService.getPageBean(hqlHelper, page);
        request.setAttribute("pageBean",pageBean);

        return "creditInfo";
    }

    /**
     * 添加页面
     * @return
     */
    public String creditAddHtml(){
        return "creditAddHtml";
    }

    /**
     * 添加
     * @return
     */
    public String creditAdd(){
        JsonResult jsonResult = new JsonResult(0,"添加失败");

        //if (IsNullUtils.isNotNull(entity.getAppcode(),entity.getMoney() )){
            //gcContractService.add(entity);
        //}
        jsonResult = new JsonResult(1,"添加成功");
        result = GsonUtils.toJson(jsonResult);

        return "creditAdd";
    }



    //页数
    private Integer currentPage;
    ///////////ajax返回数据使用/////////////
    private String result;

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
