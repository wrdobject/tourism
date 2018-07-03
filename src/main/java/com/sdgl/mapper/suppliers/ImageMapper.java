package com.sdgl.mapper.suppliers;



import com.sdgl.pojo.suppliers.Image;
import com.sdgl.pojo.suppliers.suppliers.Image;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:54
 */
public interface ImageMapper {


    /**
     * 查询所有公司信息
     * @return
     */
    List<Image> selImage();

    /**
     * 添加公司信息
     * @param image
     * @return
     */
    int addImage(Image image);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Image selImage(int id);

    /**
     * 动态查询公司信息
     * @param image
     * @return
     */
    List<Image> AllImage(Image image);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param image
     * @return
     */
    int upImage(Image image);


}
