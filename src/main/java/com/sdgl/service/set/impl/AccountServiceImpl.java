package com.sdgl.service.set.impl;

import com.sdgl.mapper.set.AccountMapper;
import com.sdgl.pojo.set.Account;
import com.sdgl.service.set.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> selectAll() {
        List<Account> la= accountMapper.selectAll();
        return la;
    }

    @Override
    public int insert(Account acc) {
        return accountMapper.insert(acc);
    }

    @Override
    public int update(Integer id, String acc_status) {
        return accountMapper.update(id,acc_status);
    }

    @Override
    public int delete(Integer id) {
        return accountMapper.delete(id);
    }
}
