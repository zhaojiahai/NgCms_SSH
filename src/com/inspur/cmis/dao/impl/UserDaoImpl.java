package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.UserDao;
import com.inspur.cmis.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by LiuLiHao on 2018/8/16 21:46.
 * 描述：
 * 作者： LiuLiHao
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao  {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User login(String loginName, String password) {
        String hql = "FROM User u WHERE u.loginName = ? and u.passWord=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql).
                setString(0, loginName).setString(1,password);

        User user = (User) query.uniqueResult();
        return user;
    }

    @Override
    public int deleteAll(String ids) {
        String hqlUpdate = "update User o set o.isdelete = 1 where o.id in ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hqlUpdate).setString(0,ids);
        return query.executeUpdate();
    }

}
