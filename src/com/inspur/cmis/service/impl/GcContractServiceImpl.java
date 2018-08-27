package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.GcContractDao;
import com.inspur.cmis.entity.GccontractmainEntity;
import com.inspur.cmis.service.GcContractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/24 11:02.
 * 描述：
 * 作者： LiuLiHao
 */
@Service
@Transactional
public class GcContractServiceImpl extends BaseServiceImpl<GccontractmainEntity> implements GcContractService {

    private GcContractDao gcContractDao;

    @Resource
    public void setGcContractDao(GcContractDao gcContractDao) {
        super.setBaseDao(gcContractDao);
        this.gcContractDao = gcContractDao;
    }

    @Override
    public List<GccontractmainEntity> findAll() {
        return null;
    }

}
