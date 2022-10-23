package com.zhibo.test;

import com.zhibo.bean.User;
import com.zhibo.dao.UserDao;
import com.zhibo.dao.impl.UserDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao=new UserDaoImpl();
    @Test
    public void queryByUsername() {

        if (userDao.queryByUsername("zjiba")==null)
        {
            System.out.println("用户名可用!");
        }else {
            System.out.println("用户名已经存在!");
            System.out.println(userDao.queryByUsername("zjiba"));
        }

    }

    @Test
    public void saveUser() {

        System.out.println(userDao.saveUser(new User(null,"曾瑞","qeqw","eqwq","21323")));

    }

    @Test
    public void queryByUsernameAndPassword() {
        if(userDao.queryByUsernameAndPassword("kp","qeqw")==null){
            System.out.println("用户名或密码错误!");
        }else {
            System.out.println("登录成功!");
        }
    }
}