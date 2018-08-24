package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.PmClassDao;
import com.inspur.cmis.entity.PmClassEntity;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by LiuLiHao on 2018/8/24 10:59.
 * 描述：
 * 作者： LiuLiHao
 */
@Repository("pmClassDao")
public class PmClassDaoImpl extends BaseDaoImpl<PmClassEntity> implements PmClassDao {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public int deleteAll(String deletes) {
        String hqlUpdate = "update PmClassEntity o set o.isDelete = 1 where o.id in ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hqlUpdate).setString(0,deletes);
        return query.executeUpdate();
    }

}
