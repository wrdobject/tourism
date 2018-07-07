package com.sdgl.controller.suppliersfei;

import com.sdgl.pojo.suppliersfei.TicketFares;
import com.sdgl.service.suppliersfei.TicketFareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketFareController {

    @Autowired
    private TicketFareService ticketFareService;

    @PostMapping("/updateTicketFare")
    public int updateTicketFare(TicketFares ticketFares){
        return ticketFareService.updateTicketFare(ticketFares);
    }

    @PostMapping("/deletebyfareid")
    public int deletebyfareid(Integer ticketFareId){
        return ticketFareService.deletebyfareid(ticketFareId);
    }

    @PostMapping("/insertTicketFare")
    public int insertTicketFare(TicketFares ticketFares){
        ticketFares.setTicketFareOwner(1);
        return ticketFareService.insertTicketFare(ticketFares);
    }
}
