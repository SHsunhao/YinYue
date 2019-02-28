package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.utils.JsonUtils;
import com.sun.tools.javac.jvm.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public JsonBean findLogin(String name, String password){
        JsonBean bean = null;
        try {
            User user = userService.findLogin(name, password);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }

        return bean;
    }
}
