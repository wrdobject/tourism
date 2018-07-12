package com.sdgl.controller.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/one")
public class onecontroller {


    @RequestMapping("/adjustment")
    public String ssa(){
        return "1_one/adjustment";
    }

    @RequestMapping("/addgroupss")
    public String ssc(){
        return "1_one/addgroup";
    }

    @RequestMapping("car")
    public String ssv(){
        return "1_one/car";
    }

    @RequestMapping("rili")
    public String ssn(){
        return "1_one/rili";
    }
    @RequestMapping("sss")
    public String ssm(){
        return "1_one/sss";
    }
    @RequestMapping("Untitled-1")
    public String ssu(){
        return "1_one/Untitled-1";
    }
}
