package com.sdgl.mapper.suppliersfei;

import com.sdgl.pojo.suppliersfei.Images;
import com.sdgl.pojo.suppliersfei.ImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {
    int countByExample(ImageExample example);

    int deleteByExample(ImageExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(Images record);

    int insertSelective(Images record);

    List<Images> selectByExample(ImageExample example);

    Images selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") Images record, @Param("example") ImageExample example);

    int updateByExample(@Param("record") Images record, @Param("example") ImageExample example);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}