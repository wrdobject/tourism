package com.sdgl.service.set.impl;

import com.sdgl.mapper.set.UserMapper;
import com.sdgl.pojo.set.User;
import com.sdgl.service.set.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public String getPwdByUserName(String userName) {
        return userMapper.getPwdByUserName(userName);
    }

    @Override
    public Set<String> getPermissionByUserName(String userName) {
        return userMapper.getPermissionByUserName(userName);
    }
}
