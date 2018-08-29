package com.inspur.cmis.service;

import com.inspur.cmis.entity.CicustbasinfoEntity;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/16 21:59.
 * 描述： 授信
 * 作者： LiuLiHao
 */
public interface CiCustBaseService extends BaseService<CicustbasinfoEntity> {

    List<CicustbasinfoEntity> findAll();

    void deleteAll(String deletes);
}
