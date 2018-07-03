package com.sdgl.mapper.suppliers;


import com.sdgl.pojo.suppliers.Vehicle;
import com.sdgl.pojo.suppliers.suppliers.Vehicle;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 14:42
 */
public interface VehicleMapper {
    /**
     * 查询所有公司信息
     * @return
     */
    List<Vehicle> selVehicle();

    /**
     * 添加公司信息
     * @param vehicle
     * @return
     */
    int addVehicle(Vehicle vehicle);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Vehicle selVehicle(int id);

    /**
     * 动态查询公司信息
     * @param vehicle
     * @return
     */
    List<Vehicle> AllVehicle(Vehicle vehicle);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param vehicle
     * @return
     */
    int upTicketing(Vehicle vehicle);

}
