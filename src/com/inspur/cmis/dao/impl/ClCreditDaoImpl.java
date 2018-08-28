package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.ClCreditDao;
import com.inspur.cmis.entity.GcloancreditEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by LiuLiHao on 2018/8/24 10:59.
 * 描述：
 * 作者： LiuLiHao
 */
@Repository("clCreditDao")
public class ClCreditDaoImpl extends BaseDaoImpl<GcloancreditEntity> implements ClCreditDao {

    @Autowired
    private SessionFactory sessionFactory;



}
