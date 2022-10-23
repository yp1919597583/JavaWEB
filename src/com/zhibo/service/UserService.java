package com.zhibo.service;

import com.zhibo.bean.User;

//业务层，（比如登录,注册等都是一个业务）
public interface UserService {

    /**
     *注册用户业务
     * @param user 用户对象
     */
    public void registUser(User user);

    /**
     * 登录业务
     * @param user
     * @return
     */
    public  User login(User user);

    /**
     * 检查用户名是否已经存在
     * @param username
     * @return 返回true用户名已经被注册，返回false则可以注册
     */
    public boolean existsUsername(String username);

    /**
     * 检查电话号码是否被注册
     * @param phoneNumber
     * @return false未被注册
     */
    public  boolean existPhonenum(String phoneNumber);

}
