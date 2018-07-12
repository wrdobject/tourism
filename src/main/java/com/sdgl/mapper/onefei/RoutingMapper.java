package com.sdgl.mapper.onefei;

import com.sdgl.pojo.onefei.Routings;
import com.sdgl.pojo.onefei.RoutingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutingMapper {
    int countByExample(RoutingExample example);

    int deleteByExample(RoutingExample example);

    int deleteByPrimaryKey(Integer routingId);

    int insert(Routings record);

    int insertSelective(Routings record);

    List<Routings> selectByExample(RoutingExample example);

    Routings selectByPrimaryKey(Integer routingId);

    int updateByExampleSelective(@Param("record") Routings record, @Param("example") RoutingExample example);

    int updateByExample(@Param("record") Routings record, @Param("example") RoutingExample example);

    int updateByPrimaryKeySelective(Routings record);

    int updateByPrimaryKey(Routings record);

    List<Routings> selectAllRout(Integer basicId);
}