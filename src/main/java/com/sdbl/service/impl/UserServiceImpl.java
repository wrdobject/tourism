package com.sdbl.service.impl;


import com.sdbl.mapper.UserMapper;
import com.sdbl.pojo.User;
import com.sdbl.pojo.UserExample;
import com.sdbl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andPasswordEqualTo(user.getPassword());
        List<User> list = userMapper.selectByExample(userExample);
        return list.size();
    }

    @Override
    public User selectByUser(User user) {
        if(user.getId() != null && user.getId() != 0) {
            return userMapper.selectByPrimaryKey(user.getId());
        }else if(user.getUsername() != null && user.getUsername() != ""){
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> list = userMapper.selectByExample(userExample);
            if(list.size()>0){
                return list.get(0);
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertSelective(user);
    }
}
