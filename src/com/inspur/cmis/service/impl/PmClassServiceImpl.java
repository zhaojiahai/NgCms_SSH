package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.PmClassDao;
import com.inspur.cmis.entity.PmClassEntity;
import com.inspur.cmis.exception.SysException;
import com.inspur.cmis.service.PmClassService;
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
public class PmClassServiceImpl extends BaseServiceImpl<PmClassEntity> implements PmClassService {
    private PmClassDao pmClassDao;

    @Resource
    public void setPmClassDao(PmClassDao pmClassDao) {
        super.setBaseDao(pmClassDao);
        this.pmClassDao = pmClassDao;
    }

    @Override
    public List<PmClassEntity> findAll() {
        return null;
    }

    @Override
    public void deleteAll(String deletes) {
        try {
            pmClassDao.deleteAll(deletes);
        } catch (Exception e) {
            throw new SysException("更新失败");
        }
    }
}
