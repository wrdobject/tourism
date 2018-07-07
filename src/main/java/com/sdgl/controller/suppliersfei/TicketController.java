package com.sdgl.controller.suppliersfei;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdgl.pojo.suppliers.Ticket;
import com.sdgl.pojo.suppliersfei.AllTickets;
import com.sdgl.pojo.suppliersfei.Tickets;
import com.sdgl.service.suppliersfei.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class TicketController {

    @Autowired
    private TicketsService ticketsService;

    @PostMapping("/selectAllTickets")
    @ResponseBody
    public List<AllTickets> selectAllTickets(Tickets tickets, Integer pageIndex, Integer pageCount, HttpServletRequest request,String name){
        if("请选择省份".equals(tickets.getTicketProvince())){
            tickets.setTicketProvince(null);
        }
        if(pageIndex != null){
            PageHelper.startPage(pageIndex,pageCount);
        }
        tickets.setTicketName(name);
        List<AllTickets> list = ticketsService.selectAllTickets(tickets);
        if(list.size()==0){
            tickets.setTicketName(null);
            tickets.setTicketAbbreviation(name);
        }
        list = ticketsService.selectAllTickets(tickets);
        request.setAttribute("pageIndex",pageIndex);
        request.setAttribute("pages",new PageInfo<AllTickets>(list).getPages());

        return list;
    }


    @PostMapping("/addTickets")
    public String addTickets(Tickets tickets){
        tickets.setTicketTime(new Date());
        tickets.setTicketOwner(1);
        ticketsService.addTickets(tickets);
        return "redirect:/menpiao";
    }

    @PostMapping("/selectTicketsById")
    @ResponseBody
    public Tickets selectTicketsById(Integer id){
        return ticketsService.selectTicketsById(id);
    }
}
