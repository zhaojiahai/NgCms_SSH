package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.ClCreditDao;
import com.inspur.cmis.entity.GcloancreditEntity;
import com.inspur.cmis.service.ClCreditService;
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
public class ClCreditServiceImpl extends BaseServiceImpl<GcloancreditEntity> implements ClCreditService {

    private ClCreditDao clCreditDao;

    @Resource
    public void setClCreditDao(ClCreditDao clCreditDao) {
        super.setBaseDao(clCreditDao);
        this.clCreditDao = clCreditDao;
    }


    @Override
    public List<GcloancreditEntity> findAll() {
        return null;
    }
}
