package com.sdgl.mapper.suppliers;



import com.sdgl.pojo.suppliers.Ticketing;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:23
 */
public interface TicketingMapper {
    /**
     * 查询所有公司信息
     * @return
     */
    List<Ticketing> selTicketing();

    /**
     * 添加航班信息
     * @param ticketing
     * @return
     */
    int addTicketing(Ticketing ticketing);

    /**
     * 根据id查询航空信息
     * @param id
     * @return
     */
    Ticketing selTicketing(int id);

    /**
     * 动态查询航空公司信息
     * @param ticketing
     * @return
     */
    List<Ticketing> AllTicketing(Ticketing ticketing);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param ticketing
     * @return
     */
    int upTicketing(Ticketing ticketing);


}
