package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.GroupDao;
import com.inspur.cmis.entity.GroupEntity;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by LiuLiHao on 2018/8/23 17:39.
 * 描述： 机构操作
 * 作者： LiuLiHao
 */
@Repository("groupDao")
public class GroupDaoImpl extends BaseDaoImpl<GroupEntity> implements GroupDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int disableAll(String deletes) {
        String hqlUpdate = "update GroupEntity o set o.valid = 1 where o.id in ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hqlUpdate).setString(0,deletes);
        return query.executeUpdate();
    }

    @Override
    public int enableAll(String deletes) {
        String hqlUpdate = "update GroupEntity o set o.valid = 0 where o.id in ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hqlUpdate).setString(0,deletes);
        return query.executeUpdate();
    }
}
