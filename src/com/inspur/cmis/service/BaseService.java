package com.inspur.cmis.service;

import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.HQLHelper;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/18 22:38.
 * 描述： 基础操作
 * 作者： LiuLiHao
 */
public interface BaseService<T> {
    void add(T t);

    void update(T t);

    void delete(int id);

    public T findObjectById(Serializable id);

    public PaginationBean getPageBean(HQLHelper hh, int currentPage);

}
