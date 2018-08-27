package com.inspur.cmis.service;

import com.inspur.cmis.entity.GccontractmainEntity;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/16 21:59.
 * 描述： 合同信息
 * 作者： LiuLiHao
 */
public interface GcContractService extends BaseService<GccontractmainEntity> {

    List<GccontractmainEntity> findAll();

}
