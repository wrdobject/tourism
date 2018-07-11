package com.sdgl.mapper.onefei;

import com.sdgl.pojo.onefei.DjsTe;
import com.sdgl.pojo.onefei.DjsTeExample;
import java.util.List;

import com.sdgl.pojo.onefei.TeamAll;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DjsTeMapper {
    int countByExample(DjsTeExample example);

    int deleteByExample(DjsTeExample example);

    int deleteByPrimaryKey(Integer qTeamId);

    int insert(DjsTe record);

    int insertSelective(DjsTe record);

    List<DjsTe> selectByExample(DjsTeExample example);

    DjsTe selectByPrimaryKey(Integer qTeamId);

    int updateByExampleSelective(@Param("record") DjsTe record, @Param("example") DjsTeExample example);

    int updateByExample(@Param("record") DjsTe record, @Param("example") DjsTeExample example);

    int updateByPrimaryKeySelective(DjsTe record);

    int updateByPrimaryKey(DjsTe record);

    TeamAll selectTeamAll(int id);
}