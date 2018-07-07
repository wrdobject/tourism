package com.sdgl.mapper.suppliersfei;

import com.sdgl.pojo.suppliersfei.Relations;
import com.sdgl.pojo.suppliersfei.RelationExample;
import com.sdgl.pojo.suppliersfei.RelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationMapper {
    int countByExample(RelationExample example);

    int deleteByExample(RelationExample example);

    int deleteByPrimaryKey(RelationKey key);

    int insert(Relations record);

    int insertSelective(Relations record);

    List<Relations> selectByExample(RelationExample example);

    Relations selectByPrimaryKey(RelationKey key);

    int updateByExampleSelective(@Param("record") Relations record, @Param("example") RelationExample example);

    int updateByExample(@Param("record") Relations record, @Param("example") RelationExample example);

    int updateByPrimaryKeySelective(Relations record);

    int updateByPrimaryKey(Relations record);
}