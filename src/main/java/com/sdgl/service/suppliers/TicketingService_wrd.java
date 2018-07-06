package com.sdgl.service.suppliers;

import com.sdgl.pojo.suppliers.Ticketing;

import java.util.List;

public interface TicketingService_wrd {
    /**
     * 添加航班信息
     * @param ticketing
     * @return
     */
    int addTicketing(Ticketing ticketing);
    /**
     * 查询所有公司信息
     * @return
     */
    List<Ticketing> selTicketing();
}
