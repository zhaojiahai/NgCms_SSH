package com.inspur.cmis.dao;

import com.inspur.cmis.entity.User;

/**
 * Created by LiuLiHao on 2018/8/16 21:44.
 * 描述： 用户数据操作
 * 作者： LiuLiHao
 */
public interface UserDao extends BaseDao<User>{

    /**
     * 登录
     * @param loginName
     * @param password
     * @return
     */
    public User login(String loginName, String password);

    //int saveUser(User user);
}
