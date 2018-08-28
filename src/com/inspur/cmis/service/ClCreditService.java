package com.inspur.cmis.service;

import com.inspur.cmis.entity.GcloancreditEntity;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/16 21:59.
 * 描述： 授信
 * 作者： LiuLiHao
 */
public interface ClCreditService extends BaseService<GcloancreditEntity> {

    List<GcloancreditEntity> findAll();

}
