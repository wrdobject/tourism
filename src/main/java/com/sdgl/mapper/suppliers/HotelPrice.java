package com.sdgl.mapper.suppliers;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:39
 */
public interface HotelPrice {

    /**
     * 查询所有公司信息
     * @return
     */
    List< HotelPrice> selHotelPrice();

    /**
     * 添加公司信息
     * @param hotelPrice
     * @return
     */
    int addHotelPrice(HotelPrice hotelPrice);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    HotelPrice selHotelPrice(int id);

    /**
     * 动态查询公司信息
     * @param hotelPrice
     * @return
     */
    List<HotelPrice> AllHotelPrice(HotelPrice hotelPrice);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param hotelPrice
     * @return
     */
    int upHotelPrice(HotelPrice hotelPrice);


}
