package com.sdgl.service.suppliersfei;

import com.sdgl.pojo.suppliersfei.AllTickets;
import com.sdgl.pojo.suppliersfei.Tickets;

import java.util.List;

public interface TicketsService {

    List<AllTickets> selectAllTickets(Tickets tickets);

    int addTickets(Tickets tickets);

    Tickets selectTicketsById(Integer id);
}
