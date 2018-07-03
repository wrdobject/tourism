package com.sdgl.mapper.suppliers;


import com.sdgl.pojo.suppliers.Ticket;
import com.sdgl.pojo.suppliers.suppliers.Ticket;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 16:03
 */
public interface TicketMapper {
    /**
     * 查询所有公司信息
     * @return
     */
    List<Ticket> selTicket();

    /**
     * 添加公司信息
     * @param ticket
     * @return
     */
    int addTicketing(Ticket ticket);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Ticket selTicket(int id);

    /**
     * 动态查询公司信息
     * @param ticket
     * @return
     */
    List<Ticket> AllTicket(Ticket ticket);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param ticket
     * @return
     */
    int upTicket(Ticket ticket);


}
