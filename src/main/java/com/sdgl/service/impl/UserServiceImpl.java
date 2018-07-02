package com.sdgl.service.impl;


import com.sdgl.mapper.UserMapper;
import com.sdgl.pojo.User;
import com.sdgl.pojo.UserExample;
import com.sdgl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //在service层上加，对该类所有的方法添加注解
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
