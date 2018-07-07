package com.sdgl.service.set;

import com.sdgl.pojo.set.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountService {
    /*
        查询所有信息
     */
    public List<Account> selectAll();

    /*
    新增银行信息
     */
    public int insert(Account acc);
    /*
    修改银行信息
     */
    public int update(Integer id, String acc_status);
    /*
    删除银行信息
     */
    public int delete(Integer id);
}
