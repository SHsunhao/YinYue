package com.qianfeng.service.impl;

import com.qianfeng.dao.userMapper;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private userMapper userDao;

    @Override
    public User findLogin(String name, String password) {

        User user = userDao.findLogin(name);

        if (user == null){
            throw  new RuntimeException("用户名不存在");
        }
        if (!user.getuPassword().equals(password)){
            throw  new  RuntimeException("用户密码错误");
        }
        return user;
    }
}
