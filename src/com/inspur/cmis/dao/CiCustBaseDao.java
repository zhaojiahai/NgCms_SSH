package com.inspur.cmis.dao;

import com.inspur.cmis.entity.CicustbasinfoEntity;

/**
 * Created by LiuLiHao on 2018/8/16 21:44.
 * 描述： 客户
 * 作者： LiuLiHao
 */
public interface CiCustBaseDao extends BaseDao<CicustbasinfoEntity>{

    void deleteAll(String deletes);
}
