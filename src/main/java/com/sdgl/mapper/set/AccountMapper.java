package com.sdgl.mapper.set;

import com.sdgl.pojo.set.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
//数据访问层的注解，意思是告诉他这个数据访问层
public interface AccountMapper {
    public List<Account> selectAll();

    public int insert(Account acc);

    public int update(@Param("id") Integer id, @Param("acc_status") String acc_status);

    public int delete(@Param("id") Integer id);


}
