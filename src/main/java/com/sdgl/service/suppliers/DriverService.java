package com.sdgl.service.suppliers;

import com.sdgl.pojo.suppliers.suppliers.Driver;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/3 14:08
 */
public interface DriverService {

    /**
     * 查询所有公司信息
     * @return
     */
    List<Driver> selDriver();

    /**
     * 添加公司信息
     * @param driver
     * @return
     */
    int addDriver(Driver driver);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Driver selDriver(int id);

    /**
     * 动态查询公司信息
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
