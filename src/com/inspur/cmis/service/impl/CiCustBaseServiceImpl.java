package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.CiCustBaseDao;
import com.inspur.cmis.entity.CicustbasinfoEntity;
import com.inspur.cmis.service.CiCustBaseService;
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
public class CiCustBaseServiceImpl extends BaseServiceImpl<CicustbasinfoEntity> implements CiCustBaseService {

    private CiCustBaseDao ciCustBaseDao;

    @Resource
    public void setCiCustBaseDao(CiCustBaseDao ciCustBaseDao) {
        super.setBaseDao(ciCustBaseDao);
        this.ciCustBaseDao = ciCustBaseDao;
    }


    @Override
    public List<CicustbasinfoEntity> findAll() {
        List<CicustbasinfoEntity> list = ciCustBaseDao.list("FROM CicustbasinfoEntity u ", null);
        return list;
    }

    @Override
    public void deleteAll(String deletes) {
        ciCustBaseDao.deleteAll(deletes);
    }
}
