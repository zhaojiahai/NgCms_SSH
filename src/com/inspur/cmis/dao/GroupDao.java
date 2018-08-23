package com.inspur.cmis.dao;

import com.inspur.cmis.entity.GroupEntity;

/**
 * Created by LiuLiHao on 2018/8/16 21:44.
 * 描述： Jigou
 * 作者： LiuLiHao
 */
public interface GroupDao extends BaseDao<GroupEntity>{

    int disableAll(String deletes);

    int enableAll(String deletes);
}
