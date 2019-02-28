package com.qianfeng.service;

import com.qianfeng.pojo.User;

public interface UserService {
    public User findLogin(String name, String password);
}
