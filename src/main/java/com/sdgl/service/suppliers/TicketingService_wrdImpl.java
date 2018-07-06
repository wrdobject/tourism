package com.sdgl.service.suppliers;

import com.sdgl.mapper.suppliers.TicketingMapper;
import com.sdgl.pojo.suppliers.Ticketing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketingService_wrdImpl implements TicketingService_wrd {
    @Autowired
    private TicketingMapper ticketingMapper;
    @Override
    public int addTicketing(Ticketing ticketing) {
        return ticketingMapper.addTicketing(ticketing) ;
    }

    @Override
    public List<Ticketing> selTicketing() {
        return ticketingMapper.selTicketing();
    }
}
