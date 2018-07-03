package com.sdgl.service.suppliers;

import com.sdgl.pojo.suppliers.suppliers.BusFleet;

import java.util.List;


public interface BusFleetService{
    /**
     * 查询所有车队公司信息
     * @return
     */
    List<BusFleet> selBusFleet();

    /**
     * 添加公司信息
     * @param busFleet
     * @return
     */
    int addBusFleet(BusFleet busFleet);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
     BusFleet selBusFleet(int id);

    /**
     * 动态查询公司信息
     * @param busFleet
     * @return
     */
    List<BusFleet> AllBusFleet(BusFleet busFleet);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param busFleet
     * @return
     */
    int upBusFleet(BusFleet busFleet);


}
