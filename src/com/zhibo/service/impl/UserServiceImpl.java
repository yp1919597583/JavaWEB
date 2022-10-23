package com.zhibo.service.impl;

import com.zhibo.bean.User;
import com.zhibo.dao.UserDao;
import com.zhibo.dao.impl.UserDaoImpl;
import com.zhibo.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public void registUser(User user) {
    userDao.saveUser(user);

    }

    @Override
    public User login(User user) {

        return userDao.queryByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryByUsername(username)==null) {
         //用户名不存在，可以创建
            return false;
        }
        return true;//用户名已经存在，不能注册
    }
    //判断电话号码是否被注册
    public boolean existPhonenum(String phoneNumber){
        if (userDao.queryByPhone(phoneNumber)==null){
            return false;
        }else {
            return true;
        }


    }
}
