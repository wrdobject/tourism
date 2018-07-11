package com.sdgl.mapper.onefei;

import com.sdgl.pojo.onefei.CarRecord;
import com.sdgl.pojo.onefei.CarRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarRecordMapper {
    int countByExample(CarRecordExample example);

    int deleteByExample(CarRecordExample example);

    int deleteByPrimaryKey(Integer qId);

    int insert(CarRecord record);

    int insertSelective(CarRecord record);

    List<CarRecord> selectByExample(CarRecordExample example);

    CarRecord selectByPrimaryKey(Integer qId);

    int updateByExampleSelective(@Param("record") CarRecord record, @Param("example") CarRecordExample example);

    int updateByExample(@Param("record") CarRecord record, @Param("example") CarRecordExample example);

    int updateByPrimaryKeySelective(CarRecord record);

    int updateByPrimaryKey(CarRecord record);
}