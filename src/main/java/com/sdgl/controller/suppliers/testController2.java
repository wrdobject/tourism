package com.sdgl.controller.suppliers;

import com.sdgl.service.op.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController2 {

    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public String get(){
        System.out.println(testService.get());
        return "index";
    }
}
