package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.BaseDao;
import com.inspur.cmis.service.BaseService;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.HQLHelper;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/18 22:39.
 * 描述：
 * 作者： LiuLiHao
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao<T> baseDao;

    public void setBaseDao(BaseDao<T> baseDao) {
        this.baseDao=baseDao;
    }

    @Override
    public void add(T t) {
        baseDao.add(t);
    }

    @Override
    public void update(T t) {
        baseDao.update(t);
    }

    @Override
    public void delete(int id) {
        baseDao.delete(id);
    }

    @Override
    public T findObjectById(Serializable id) {
        return baseDao.findById(id);
    }

    @Override
    public PaginationBean getPageBean(HQLHelper hh, int currentPage) {
        return baseDao.getPageBean(hh,currentPage);
    }

}
