package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.BaseDao;
import com.inspur.common.entity.PaginationBean;
import com.inspur.common.util.HQLHelper;
import com.inspur.common.util.IsNullUtils;
import org.hibernate.Query;
import org.hibernate.Session;
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

    @Override
    public PaginationBean getPageBean(HQLHelper hh, int currentPage) {
        // 获取到页面大小
        int pagesize = PaginationBean.pageSize;
        int startFist = (currentPage - 1) * pagesize;
        // 获取拼接号的Hql语句
        String listHQL = hh.getListHQL();
        String countHQL = hh.getCountHQL();
        List<Object> args = hh.getArgs();
        Session session = sessionFactory.getCurrentSession();
        // 获取list的HQL语句
        Query query = session.createQuery(listHQL);
        // 拼接查询参数
        for (int i = 0; i < args.size(); i++) {
            query.setParameter(i, args.get(i));
        }
        query.setFirstResult(startFist);
        query.setMaxResults(pagesize);
        List list = query.list();

        Query q = session.createQuery(countHQL);
        //先转为Long 如果直接转为Int会报错
        long uniqueResult = (Long) q.uniqueResult();
        return new PaginationBean(currentPage, pagesize, (int)uniqueResult, list);
    }
}
