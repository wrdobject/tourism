package com.sdgl.mapper.suppliers;

import com.sdgl.pojo.suppliers.TicketFare;
import com.sdgl.pojo.suppliers.suppliers.TicketFare;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:58
 */
public interface TicketFareMapper {
    /**
     * 查询所有公司信息
     * @return
     */
    List<TicketFare> selTicketFare();

    /**
     * 添加公司信息
     * @param ticketFare
     * @return
     */
    int addTicketFare(TicketFare ticketFare);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    TicketFare selTicketFare(int id);

    /**
     * 动态查询公司信息
     * @param ticketFare
     * @return
     */
    List<TicketFare> AllTicketFare(TicketFare ticketFare);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param ticketFare
     * @return
     */
    int upTicketFare(TicketFare ticketFare);


}
