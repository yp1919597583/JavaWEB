package com.zhibo.test;

import com.zhibo.bean.User;
import com.zhibo.service.UserService;
import com.zhibo.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
    UserService userService=new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(1324232, null, "张三", "qwqeqe", "wqeeq@gumail.com"));

    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"kp","qeqw","121313","1233")));
    }

    @Test
    public void existsUsername(){
    if (userService.existsUsername("kp人")) {
        System.out.println("已经存在该用户");
    }else {
        System.out.println("用户名正确");
    }
    }
}