package com.inspur.cmis.action;

import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.entity.User;
import com.inspur.cmis.service.GroupService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.util.Constants;
import com.inspur.common.util.IsNullUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by LiuLiHao on 2018年8月27日15:48:23
 * 描述： 合同信息
 * 作者： LiuLiHao
 */
public class GcContractAction extends BaseAction {
    private static final long serialVersionUID = 711362308004342341L;

    @Autowired
    private GroupService groupService;

    /**
     * 列表
     * @return
     */
    public String contractInfo(){
        //分页查询
//        HQLHelper hqlHelper = new HQLHelper(GccontractmainEntity.class);
//        int page = 1;
//        if (currentPage!=null && currentPage>0){
//            page = currentPage;
//        }
//        //条件查询
//        if (group!=null && StringUtils.isNotBlank(group.getCode())){
//            hqlHelper.addWhere(" o.code = ?",group.getCode());
//            request.setAttribute("groupCode",group.getCode());
//        }
//        //名字以 xxx开头的
//        if (group!=null && StringUtils.isNotBlank(group.getName())){
//            hqlHelper.addWhere(" o.name like ?",group.getName()+"%");
//            request.setAttribute("groupName",group.getName());
//        }
//
//        //设置页数
//        PaginationBean pageBean = groupService.getPageBean(hqlHelper, page);
//        request.setAttribute("pageBean",pageBean);

        return "contractInfo";
    }

    /**
     * 添加页面
     * @return
     */
    public String contractAddHtml(){
        return "contractAddHtml";
    }

    /**
     * 添加
     * @return
     */
    public String contractAdd(){
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
        return "contractList";
    }



    //页数
    private Integer currentPage;
    ///////////ajax返回数据使用/////////////
    private String result;


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
