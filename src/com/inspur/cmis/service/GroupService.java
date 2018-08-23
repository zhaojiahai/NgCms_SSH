package com.inspur.cmis.service;

import com.inspur.cmis.entity.GroupEntity;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/16 21:59.
 * 描述： 机构
 * 作者： LiuLiHao
 */
public interface GroupService extends BaseService<GroupEntity> {

    List<GroupEntity> findAll();

    /**
     * 查询所有可用的列表
     * @return
     */
    List<GroupEntity> findAllUseable();

    /**
     * 禁用用户
     * @param deletes
     */
    void disableAll(String deletes);

    /**
     * 启用用户
     * @param deletes
     */
    void enableAll(String deletes);

}
