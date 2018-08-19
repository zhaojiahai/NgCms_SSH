package com.inspur.cmis.service;

import com.inspur.cmis.entity.User;

/**
 * Created by LiuLiHao on 2018/8/16 21:59.
 * 描述：
 * 作者： LiuLiHao
 */
public interface UserService extends BaseService<User> {
    /**
     * 登录
     * @param loginName
     * @param password
     * @return
     */
    public User login(String loginName, String password);

}
