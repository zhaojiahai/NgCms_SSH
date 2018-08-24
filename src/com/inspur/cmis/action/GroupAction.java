package com.inspur.cmis.action;

import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.entity.User;
import com.inspur.cmis.service.GroupService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.Constants;
import com.inspur.common.util.GsonUtils;
import com.inspur.common.util.HQLHelper;
import com.inspur.common.util.IsNullUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by LiuLiHao on 2018/8/23 16:38.
 * 描述： 机构
 * 作者： LiuLiHao
 */
public class GroupAction extends BaseAction {
    private static final long serialVersionUID = 711362308004342341L;

    @Autowired
    private GroupService groupService;

    /**
     * 机构列表
     * @return
     */
    public String groupInfo(){
        //分页查询
        HQLHelper hqlHelper = new HQLHelper(GroupEntity.class);
        int page = 1;
        if (currentPage!=null && currentPage>0){
            page = currentPage;
        }
        //条件查询
        if (group!=null && StringUtils.isNotBlank(group.getCode())){
            hqlHelper.addWhere(" o.code = ?",group.getCode());
            request.setAttribute("groupCode",group.getCode());
        }
        //名字以 xxx开头的
        if (group!=null && StringUtils.isNotBlank(group.getName())){
            hqlHelper.addWhere(" o.name like ?",group.getName()+"%");
            request.setAttribute("groupName",group.getName());
        }

        //设置页数
        PaginationBean pageBean = groupService.getPageBean(hqlHelper, page);
        request.setAttribute("pageBean",pageBean);

        return "groupInfo";
    }

    /**
     * 添加页面
     * @return
     */
    public String groupAddHtml(){
        return "groupAddHtml";
    }

    /**
     * 添加
     * @return
     */
    public String groupAdd(){
        if (IsNullUtils.isNotNull(group.getName(),group.getBriefname(),
                group.getCode(),group.getCreatedtime())){
            //设置默认
            group.setValid("0");
            User user = (User) session.getAttribute(Constants.USER);
            group.setCreateduserid(user.getId());
            //查询上级名称
            if (StringUtils.isNotBlank(group.getParentid())){
                GroupEntity entity = groupService.findObjectById(Integer.parseInt(group.getParentid()));
                if (entity!=null){
                    group.setParentName(entity.getName());
                }
            }

            groupService.add(group);
        }
        return "groupList";
    }


    /**
     * 修改页面
     * @return
     */
    public String groupUpdateHtml(){
        if (groupId!=null && groupId>0){
            GroupEntity entity = groupService.findObjectById(groupId);
            request.setAttribute("updateGroup",entity);
        }
        return "groupUpdateHtml";
    }

    /**
     * ajax修改
     * @return
     */
    public String groupUpdate(){
        //先ID查询一下再保存 否则其它字段都空
        GroupEntity dbGroup = groupService.findObjectById(group.getId());
        JsonResult jsonResult = new JsonResult(0,"修改失败");

        if (IsNullUtils.isNotNull(upcode,upname,upbriefname,upcreatedtime)){
            dbGroup.setCode(upcode);
            dbGroup.setName(upname);
            dbGroup.setBriefname(upbriefname);
            dbGroup.setCreatedtime(upcreatedtime);
            if (StringUtils.isNotBlank(upparentid)){
                dbGroup.setParentid(upparentid);
            }
            //修改时间
            dbGroup.setModifiedtime(new Date());
            groupService.update(dbGroup);
            jsonResult = new JsonResult(1,"修改成功");
        }
        result = GsonUtils.toJson(jsonResult);
        return "groupUpdate";
    }

    /**
     * 禁用
     * @return
     */
    public String groupDisable(){
        JsonResult jsonResult = new JsonResult(0,"禁用失败");

        if (IsNullUtils.isNotNull(deletes)){
            groupService.disableAll(deletes);
            jsonResult = new JsonResult(1,"禁用成功");
        }
        result = GsonUtils.toJson(jsonResult);
        return "groupDisable";
    }

    /**
     * 启用
     * @return
     */
    public String groupEnable(){
        JsonResult jsonResult = new JsonResult(0,"启用失败");

        if (IsNullUtils.isNotNull(deletes)){
            groupService.enableAll(deletes);
            jsonResult = new JsonResult(1,"启用成功");
        }
        result = GsonUtils.toJson(jsonResult);
        return "groupEnable";
    }


    //页数
    private Integer currentPage;
    //修改使用
    private Integer groupId;
    ///////////ajax返回数据使用/////////////
    private String result;
    ///////////批量操作使用/////////////
    private String deletes;

    public String getDeletes() {
        return deletes;
    }

    public void setDeletes(String deletes) {
        this.deletes = deletes;
    }

    private String upcode;
    private String upname;
    private String upparentid;
    private String upbriefname;
    private Date upcreatedtime;

    public String getUpcode() {
        return upcode;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setUpcode(String upcode) {
        this.upcode = upcode;
    }

    public String getUpname() {
        return upname;
    }

    public void setUpname(String upname) {
        this.upname = upname;
    }

    public String getUpparentid() {
        return upparentid;
    }

    public void setUpparentid(String upparentid) {
        this.upparentid = upparentid;
    }

    public String getUpbriefname() {
        return upbriefname;
    }

    public void setUpbriefname(String upbriefname) {
        this.upbriefname = upbriefname;
    }

    public Date getUpcreatedtime() {
        return upcreatedtime;
    }

    public void setUpcreatedtime(Date upcreatedtime) {
        this.upcreatedtime = upcreatedtime;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    private GroupEntity group;

    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }
}
