package com.sdgl.controller.suppliers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 许泽
 * @Description:
 * @Date: 2018/7/4 15:45
 */
@Controller
public class Page {

    /**
     * 添加餐厅信息
     * @return
     */
    @RequestMapping("/restaurant_add.do")
    public String restaurant_add(){
        return "3/canting/restaurant_add";
    }

    /**
     * 查看餐厅详情
     * @return
     */
    @RequestMapping("/restaurant_info.do")
    public String restaurant_info(){
        return "3/canting/restaurant_info";
    }

    /**
     * 添加车队信息
     * @return
     */
    @RequestMapping("/bus_fleet_add.do")
    public String bus_fleet_add(){
        return "3/chedui/bus_fleet_add";
    }

    /**
     * 查看车队详情
     * @return
     */
    @RequestMapping("/bus_fleet_info.do")
    public String bus_fleet_info(){
        return "3/chedui/bus_fleet_info";
    }

    /**
     * 添加地接社信息
     * @return
     */
    @RequestMapping("/agency_add.do")
    public String agency_add(){
        return "3/dijieshe/restaurant_add";
    }

    /**
     * 查看地接社详情
     * @return
     */
    @RequestMapping("/agency_info.do")
    public String agency_info(){
        return "3/dijieshe/agency_info";
    }

    /**
     * 添加购物信息
     * @return
     */
    @RequestMapping("/product_add.do")
    public String product_add(){
        return "3/gouwu/product_add";
    }

    /**
     * 查看购物详情
     * @return
     */
    @RequestMapping("/product_info.do")
    public String product_info(){
        return "3/gouwu/product_info";
    }

    /**
     * 添加酒店信息
     * @return
     */
    @RequestMapping("/hotel_add.do")
    public String hotel_add(){
        return "3/jiudian/hotel_add";
    }

    /**
     * 查看酒店详情
     * @return
     */
    @RequestMapping("/hotel_show.do")
    public String hotel_show(){
        return "3/jiudian/hotel_show";
    }

    /**
     * 添加门票信息
     * @return
     */
    @RequestMapping("/ticket_add.do")
    public String ticket_add(){
        return "3/menpiao/ticket_add";
    }

    /**
     * 查看门票详情
     * @return
     */
    @RequestMapping("/ticket_info.do")
    public String ticket_info(){
        return "3/menpiao/ticket_info";
    }

    /**
     * 添加票务信息
     * @return
     */
    @RequestMapping("/ticketing_add.do")
    public String ticketing_add(){
        return "3/piaowu/ticketing_add";
    }

    /**
     * 查看票务详情
     * @return
     */
    @RequestMapping("/ticketing_info.do")
    public String ticketing_info(){
        return "3/piaowu/ticketing_info";
    }

}
