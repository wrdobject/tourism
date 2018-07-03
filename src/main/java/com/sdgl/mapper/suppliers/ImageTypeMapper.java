package com.sdgl.mapper.suppliers;


import com.sdgl.pojo.suppliers.ImageType;
import com.sdgl.pojo.suppliers.suppliers.ImageType;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:55
 */
public interface ImageTypeMapper {

    /**
     * 查询所有公司信息
     * @return
     */
    List<ImageType> selImageType();

    /**
     * 添加公司信息
     * @param imageType
     * @return
     */
    int addImageType(ImageType imageType);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    ImageType selImageType(int id);

    /**
     * 动态查询公司信息
     * @param imageType
     * @return
     */
    List<ImageType> AllImageType(ImageType imageType);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param imageType
     * @return
     */
    int upImageType(ImageType imageType);


}
