package com.sdgl.controller.suppliersfei;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketPageController {

    @RequestMapping("/goTicketInfo/{id}")
    public String goTicketInfo(){
        return "3/menpiao/ticket_info";
    }

    @RequestMapping("/goTicketAdd/{id}")
    public String goTicketAdd(){
        return "3/menpiao/ticket_add";
    }
}
