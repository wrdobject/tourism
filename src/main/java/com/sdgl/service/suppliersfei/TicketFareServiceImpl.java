package com.sdgl.service.suppliersfei;

import com.sdgl.mapper.suppliersfei.TicketFareMapper;
import com.sdgl.pojo.suppliers.TicketFare;
import com.sdgl.pojo.suppliersfei.TicketFares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketFareServiceImpl implements TicketFareService {

    @Autowired
    private TicketFareMapper ticketFareMapper;

    @Override
    public int updateTicketFare(TicketFares ticketFares) {
        return ticketFareMapper.updateByPrimaryKeySelective(ticketFares);
    }

    @Override
    public int deletebyfareid(Integer ticketFareId) {
        return ticketFareMapper.deleteByPrimaryKey(ticketFareId);
    }

    @Override
    public int insertTicketFare(TicketFares ticketFares) {
        return ticketFareMapper.insert(ticketFares);
    }
}
