package com.inspur.cmis.dao;

import com.inspur.cmis.entity.GcloancreditEntity;

/**
 * Created by LiuLiHao on 2018/8/16 21:44.
 * 描述： 授信
 * 作者： LiuLiHao
 */
public interface ClCreditDao extends BaseDao<GcloancreditEntity>{

    void deleteAll(String deletes);
}
