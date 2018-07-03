package com.sdgl.mapper.suppliers;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:36
 */
public interface Hotel {


    /**
     * 查询所有公司信息
     * @return
     */
    List< Hotel> selHotel();

    /**
     * 添加公司信息
     * @param hotel
     * @return
     */
    int addHotel(Hotel hotel);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Hotel selHotel(int id);

    /**
     * 动态查询公司信息
     * @param hotel
     * @return
     */
    List<Hotel> AllHotel(Hotel hotel);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param hotel
     * @return
     */
    int upHotel(Hotel hotel);


}
