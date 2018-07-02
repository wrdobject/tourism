package com.sdgl.service;


import com.sdgl.pojo.User;
public interface UserService {
    /**
     * 用户登陆
     * @param user
     * @return
     */
    int login(User user);

    /**
     * 通过用户信息查询此用户是否存在
     * @param user
     * @return
     */
    User selectByUser(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    int insertUser(User user);
}
