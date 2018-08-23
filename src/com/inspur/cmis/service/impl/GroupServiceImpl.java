package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.GroupDao;
import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.service.GroupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/23 17:36.
 * 描述：
 * 作者： LiuLiHao
 */
@Service
@Transactional
public class GroupServiceImpl extends BaseServiceImpl<GroupEntity> implements GroupService {

    private GroupDao groupDao;


    @Resource
    public void setGroupDao(GroupDao groupDao) {
        super.setBaseDao(groupDao);
        this.groupDao = groupDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<GroupEntity> findAll() {
        List<GroupEntity> list = groupDao.list("FROM GroupEntity u ", null);
        return list;
    }

    @Override
    @Transactional(readOnly = true)
    public List<GroupEntity> findAllUseable() {
        List<GroupEntity> list = groupDao.list("FROM GroupEntity u where u.valid != 1 ", null);
        return list;
    }

    @Override
    public void disableAll(String deletes) {
        groupDao.disableAll(deletes);
    }

    @Override
    public void enableAll(String deletes) {
        groupDao.enableAll(deletes);
    }

}
