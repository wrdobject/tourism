package com.sdgl.service.suppliers;



import com.sdgl.pojo.suppliers.suppliers.Ticketing;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 14:11
 */
public interface TicketingService {

    /**
     * 查询所有公司信息
     * @return
     */
    List<Ticketing> selTicketing();

    /**
     * 添加公司信息
     * @param ticketing
     * @return
     */
    int addTicketing(Ticketing ticketing);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Ticketing selTicketing(int id);

    /**
     * 动态查询公司信息
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
