package com.inspur.cmis.action;

import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.service.GroupService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.util.IsNullUtils;
import org.springframework.beans.factory.annotation.Autowired;

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
                group.getCode(),group.getCreatedtime(),group.getParentid()
                )){
            groupService.add(group);
        }
        return "groupList";
    }



    private GroupEntity group;

    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }
}
