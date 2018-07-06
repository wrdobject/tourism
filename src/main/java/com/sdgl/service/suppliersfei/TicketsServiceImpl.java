package com.sdgl.service.suppliersfei;

import com.sdgl.mapper.suppliersfei.TicketsMapper;
import com.sdgl.pojo.suppliersfei.AllTickets;
import com.sdgl.pojo.suppliersfei.Tickets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsServiceImpl implements TicketsService {

    @Autowired
    private TicketsMapper ticketsMapper;

    @Override
    public List<AllTickets> selectAllTickets(Tickets tickets) {
        return ticketsMapper.selectAllTickets(tickets);
    }

    @Override
    public int addTickets(Tickets tickets) {
        System.out.println(tickets.getTicketId());
        if(tickets.getTicketId()!=null){
            return ticketsMapper.updateByPrimaryKeySelective(tickets);
        }
        return ticketsMapper.insertSelective(tickets);
    }

    @Override
    public Tickets selectTicketsById(Integer id) {
        return ticketsMapper.selectByPrimaryKey(id);
    }
}
