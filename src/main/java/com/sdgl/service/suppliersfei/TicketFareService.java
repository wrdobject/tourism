package com.sdgl.service.suppliersfei;

import com.sdgl.pojo.suppliersfei.TicketFares;

public interface TicketFareService {

    int updateTicketFare(TicketFares ticketFares);

    int deletebyfareid(Integer ticketFareId);

    int insertTicketFare(TicketFares ticketFares);
}
