package com.sdgl.controller.suppliers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 许泽
 * @Description:
 * @Date: 2018/7/4 11:59
 */
@Controller
public class TestXu {

    @RequestMapping("/canting")
    public String canting(){
        return "/3/canting/restaurant";
    }
    @RequestMapping("/chedui")
    public String chedui(){
        return "/3/chedui/bus_fleet";
    }
    @RequestMapping("/dijieshe")
    public String dijieshe(){
        return "/3/dijieshe/agency";
    }
    @RequestMapping("/gouwu")
    public String gouwu(){
        return "/3/gouwu/product";
    }
    @RequestMapping("/jiudian")
    public String jiudian(){
        return "/3/jiudian/hotel";
    }
    @RequestMapping("/menpiao")
    public String menpiao(){
        return "/3/menpiao/ticket";
    }
    @RequestMapping("/piaowu")
    public String piaowu(){
        return "/3/piaowu/ticketing";
    }

}
