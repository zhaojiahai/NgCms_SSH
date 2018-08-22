package com.inspur.cmis.dao;

import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.HQLHelper;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	public void add(T t);

	public void delete(int id);

	public void update(T t);


	public List<T> list(String hql, Object[] args);

	public T findById(Serializable id);

	public PaginationBean getPageBean(HQLHelper hh, int currentPage);
}
