package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.UserDao;
import com.inspur.cmis.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
        String hql = "FROM User u WHERE u.loginName = ? and u.passWord=? and u.isdelete=0 ";
        Query query = sessionFactory.getCurrentSession().createQuery(hql).
                setString(0, loginName).setString(1,password);

        User user = (User) query.uniqueResult();
        return user;
    }

    @Override
    public int deleteAll(String ids) {
        //使用jdbc
        sessionFactory.getCurrentSession().doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                String sql = " update pop_user set isdelete=1 where id in ( "+ids+" )";
                Statement st = connection.createStatement();
                 st.executeUpdate(sql);
            }
        });
        return 0;
    }

    @Override
    public int disableAll(String deletes) {
        //使用jdbc
        sessionFactory.getCurrentSession().doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                String sql = " update pop_user set locked='1' where id in ( "+deletes+" )";
                Statement st = connection.createStatement();
                st.executeUpdate(sql);
            }
        });
        return 0;
    }

    @Override
    public int enableAll(String deletes) {
        //使用jdbc
        sessionFactory.getCurrentSession().doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                String sql = " update pop_user set locked='0' where id in ( "+deletes+" )";
                Statement st = connection.createStatement();
                 st.executeUpdate(sql);
            }
        });
        return 0;
    }

}
