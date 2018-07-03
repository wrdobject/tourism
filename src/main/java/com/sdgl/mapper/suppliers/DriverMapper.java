package com.sdgl.mapper.suppliers;

import com.sdgl.pojo.suppliers.Driver;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/3 17:16
 */
public interface DriverMapper {


    /**
     * 查询所有司机信息
     * @return
     */
    List<Driver> selDriver();

    /**
     * 添加司机信息
     * @param driver
     * @return
     */
    int addDriver(Driver driver);

    /**
     * 根据id查询司机信息
     * @param id
     * @return
     */
    Driver selDriver(int id);

    /**
     * 动态查询司机信息
     * @param driver
     * @return
     */
    List<Driver> AllDriver(Driver driver);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param driver
     * @return
     */
    int updDriver(Driver driver);
}
