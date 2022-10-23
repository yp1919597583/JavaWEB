package com.zhibo.dao;

import com.zhibo.bean.User;

public interface UserDao  {



    /**
     *  检查用户名是否可用
     * @param username 注册时的用户名
     * @return 返回null说明没有这个用户，可以注册，反之则有
     */
    public User queryByUsername(String username);


    /**
     *  检查电话号码是否被注册
     * @param phoneNumber
     * @return null未被注册
     */
    public User queryByPhone(String phoneNumber);


    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);


    /**
     * 登陆时根据用户名和密码查询
     * @param username
     * @param password
     * @return 返回null说明没有这个用户，或者密码，或用户名错误
     */
    public User queryByUsernameAndPassword(String username,String password);


}
