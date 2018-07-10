package com.sdgl.controller.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addsController {

    @ResponseBody
    @RequestMapping(value = "addsgroups",method = RequestMethod.GET)
    public ModelAndView addgruoup(ModelAndView mv){



        mv.setViewName("adjustment");
        return mv;
    }

}
