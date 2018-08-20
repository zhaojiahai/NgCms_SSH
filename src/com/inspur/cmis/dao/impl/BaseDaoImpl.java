package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.BaseDao;
import com.inspur.common.util.IsNullUtils;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/18 10:44.
 * 描述： 数据操作基础类 普通的 增删改查
 * 作者： LiuLiHao
 */
@Repository
public class BaseDaoImpl<T>  implements BaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 创建一个Class的对象来获取泛型的class
     */
    private Class<T> clz;

    @SuppressWarnings("unchecked")
    public Class<T> getClz(){
        if (clz==null) {
            clz=(Class<T>)(((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        }
        return clz;
    }

    @Override
    public void add(T t) {
        //hibernateTemplate.save(t);
        sessionFactory.getCurrentSession().save(t);
    }

    @Override
    public void delete(int id) {
        sessionFactory.getCurrentSession().delete(id);
    }

    @Override
    public void update(T t) {
        sessionFactory.getCurrentSession().update(t);
    }


    @Override
    public List<T> list(String hql, Object[] args) {
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        if (IsNullUtils.arrayIsNotNull(args)){
            for (int i = 0; i < args.length; i++) {
                query.setParameter(i, args[i]);
            }
        }

        List<T> list=query.list();
        return list;
    }

    @Override
    public T findById(Serializable id) {
        return (T) sessionFactory.getCurrentSession().get(getClz(),id);
    }
}
