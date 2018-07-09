package com.sdgl.service.set;

import com.sdgl.pojo.set.User;

import java.util.Set;

public interface UserService {
    /**
     * 新增账号
     * @param user
     * @return
     */
    public int insert(User user);

    /**
     * 通过用户名获取密码
     * @param userName 用户名
     * @return 密码
     */
    public String getPwdByUserName(String userName);

    /**
     *通过用户名获取此用户名的权限
     * @param userName
     * @return权限集合
     */
    public Set<String> getPermissionByUserName(String userName);

}
