package com.inspur.cmis.action.ci;

import com.inspur.cmis.entity.CicustbasinfoEntity;
import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.service.CiCustBaseService;
import com.inspur.cmis.service.GroupService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.GsonUtils;
import com.inspur.common.util.HQLHelper;
import com.inspur.common.util.IsNullUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/29 13:18.
 * 描述： 对公客户操作
 * 作者： LiuLiHao
 */
public class CiCustBaseAction extends BaseAction {
    @Autowired
    private CiCustBaseService ciCustBaseService;
    @Autowired
    private GroupService groupService;

    /**
     * 列表
     * @return
     */
    public String ciCustBaseInfo() {
        //分页查询
        HQLHelper hqlHelper = new HQLHelper(CicustbasinfoEntity.class);
        int page = 1;
        if (currentPage!=null && currentPage>0){
            page = currentPage;
        }
        if (entity!=null){
            //id
            if (IsNullUtils.isNotNull(entity.getCustid())){
                hqlHelper.addWhere(" o.custid like ? ",entity.getCustid()+"%");
                request.setAttribute("custid",entity.getCustid());
            }
            //cname
            if (IsNullUtils.isNotNull(entity.getCname())){
                hqlHelper.addWhere(" o.cname like ? ",entity.getCname()+"%");
                request.setAttribute("cname",entity.getCname());
            }
            //类型
            if (IsNullUtils.isNotNull(entity.getCusttype()) && !entity.getCusttype().equals("0")){
                hqlHelper.addWhere(" o.custtype = ? ",entity.getCusttype());
                request.setAttribute("custtype",entity.getCusttype());
            }
        }
        //设置页数
        PaginationBean pageBean = ciCustBaseService.getPageBean(hqlHelper, page);
        request.setAttribute("pageBean",pageBean);

        return "ciCustBaseInfo";
    }
    /**
     * 添加页面
     *
     * @return
     */
    public String ciCustBaseAddHtml() {
        //查询所有机构
        List<GroupEntity> list = groupService.findAll();
        request.setAttribute("groups",list);
        return "ciCustBaseAddHtml";
    }

    /**
     * 添加
     * @return
     */
    public String ciCustBaseAdd(){
        JsonResult jsonResult = new JsonResult(0, "添加失败");
        //设置创建日期
        ciCustBaseService.add(entity);
        jsonResult = new JsonResult(1, "添加成功");
        result = GsonUtils.toJson(jsonResult);
        return "ciCustBaseAdd";
    }
    /**
     * 修改页面
     *
     * @return
     */
    public String ciCustBaseUpdateHtml() {
        if (entityId!=null && entityId>0){
            CicustbasinfoEntity entity = ciCustBaseService.findObjectById(entityId);
            request.setAttribute("entity", entity);
        }
        return "ciCustBaseUpdateHtml";
    }

    /**
     * 详情页面
     * @return
     */
    public String ciCustBaseDetailHtml() {
        if (entityId!=null && entityId>0){
            CicustbasinfoEntity entity = ciCustBaseService.findObjectById(entityId);
            request.setAttribute("entity", entity);
        }
        return "ciCustBaseDetail";
    }


    /**
     * 修改
     *
     * @return
     */
    public String ciCustBaseUpdate() {
        JsonResult jsonResult = new JsonResult(0,"修改失败");
        ciCustBaseService.update(entity);

        jsonResult = new JsonResult(1,"修改成功");
        result = GsonUtils.toJson(jsonResult);

        return "ciCustBaseUpdate";
    }


    private CicustbasinfoEntity entity;
    ///////////ajax返回数据使用/////////////
    private String result;

    private Integer entityId;
    //页数
    private Integer currentPage;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CicustbasinfoEntity getEntity() {
        return entity;
    }

    public void setEntity(CicustbasinfoEntity entity) {
        this.entity = entity;
    }
}