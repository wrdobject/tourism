package com.sdgl.mapper.set;

import com.sdgl.pojo.set.User;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

@Repository
public interface UserMapper {

    /**
     * 新增员工账号
     * @param user 员工信息类
     * @return 1为成功，0为失败
     */
    public int insert(User user);

    /**
     * 通过用户名获取密码
     * @param userName 用户名
     * @return 密码
     */
    public String getPwdByUserName(@Param("userName") String userName);

    /**
     *通过用户名获取此用户名的权限
     * @param userName
     * @return权限集合
     */
    public Set<String> getPermissionByUserName(@Param("userName") String userName);
}
