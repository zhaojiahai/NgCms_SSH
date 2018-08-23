package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.UserDao;
import com.inspur.cmis.entity.User;
import com.inspur.cmis.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/16 21:59.
 * 描述：
 * 作者： LiuLiHao
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    public void setUserDao(UserDao userDao) {
        super.setBaseDao(userDao);
        this.userDao = userDao;
    }

    private UserDao userDao;


    @Override
    @Transactional(readOnly = true)
    public User login(String loginName, String password) {
        return userDao.login(loginName,password);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        List<User> list = userDao.list("FROM User u ", null);
        return list;
    }

    @Override
    public void deleteAll(String ids) {
        int i = userDao.deleteAll(ids);
        if (i<=0) throw new RuntimeException("删除用户失败");
    }

}
