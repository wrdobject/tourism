package com.sdgl.controller.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RiChangController_wrd {

    @RequestMapping("/richang")
    public String show(){
        return "/1_one/Untitled-1";
    }
}
