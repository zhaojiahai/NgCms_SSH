package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.GroupDao;
import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.exception.SysException;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by LiuLiHao on 2018/8/23 17:39.
 * 描述： 机构操作
 * 作者： LiuLiHao
 */
@Repository("groupDao")
public class GroupDaoImpl extends BaseDaoImpl<GroupEntity> implements GroupDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int disableAll(String deletes) {
        //使用jdbc
        sessionFactory.getCurrentSession().doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                String sql = "UPDATE pop_group SET valid=1 WHERE id IN ( "+deletes+" )";
                Statement st = connection.createStatement();
                int i = st.executeUpdate(sql);
                if (i<=0) throw new SysException("更新失败");
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
                String sql = "UPDATE pop_group SET valid=0 WHERE id IN ( "+deletes+" )";
                Statement st = connection.createStatement();
                int i = st.executeUpdate(sql);
                if (i<=0) throw new SysException("更新失败");
            }
        });
        return 0;
    }
}
