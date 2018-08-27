package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.GcContractDao;
import com.inspur.cmis.entity.GccontractmainEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by LiuLiHao on 2018/8/24 10:59.
 * 描述：
 * 作者： LiuLiHao
 */
@Repository("gcContractDao")
public class GcContractDaoImpl extends BaseDaoImpl<GccontractmainEntity> implements GcContractDao {
    @Autowired
    private SessionFactory sessionFactory;



}
