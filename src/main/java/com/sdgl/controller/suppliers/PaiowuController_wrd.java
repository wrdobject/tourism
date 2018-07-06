package com.sdgl.controller.suppliers;


import com.alibaba.fastjson.JSON;
import com.sdgl.pojo.suppliers.Ticketing;
import com.sdgl.service.suppliers.TicketingService_wrd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class PaiowuController_wrd {
    @Autowired
    private TicketingService_wrd ticketingService_wrd;
    @RequestMapping("/wrd_upload")
    public Object add_wrd(Ticketing ticketing){
        System.out.println(ticketing);
        ticketing.setTicketing_time(new Date());
        ticketing.setTicketing_owner(111);
        ticketingService_wrd.addTicketing(ticketing);
        return "3/piaowu/ticketing";
    }
    @PostMapping("/cha_wrd")
    @ResponseBody
    public String cha_wrd(){
       List<Ticketing> list=ticketingService_wrd.selTicketing();
        return JSON.toJSONString(list);
    }
}
