package com.zhibo.dao.impl;

import com.zhibo.bean.User;
import com.zhibo.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryByUsername(String username) {
        String sql="select `id`,`username`,`password`,`email`,`phonenumber` from t_user where username=?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryByPhone(String phoneNumber) {
        String sql="select `id`,`username`,`password`,`email`,`phonenumber` from t_user where phonenumber=?";
        return queryForOne(User.class, sql, phoneNumber);
    }


    @Override
    public int saveUser(User user) {
        String sql="insert into t_user(`username`,`password`,`email`,`phonenumber`) VALUES(?,?,?,?)";

        return update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getPhonenumber());


    }

    @Override
    public User queryByUsernameAndPassword(String username, String password) {
        String sql="select `id`,`username`,`password`,`email`,`phonenumber` from t_user where username=? and password=?";
        return queryForOne(User.class,sql,username,password);

    }
}
