package com.sdgl.controller.one;

import com.alibaba.fastjson.JSON;
import com.sdgl.pojo.op.P_Team;
import com.sdgl.service.one.addgroupservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping(value = "/add")
public class addsController {

    @Autowired
    private addgroupservice as;

    @ResponseBody
    @RequestMapping(value = "/addsgroups",method = RequestMethod.GET)
    public Object addgruoup(P_Team pt){
        System.out.print("新增");
        System.out.print(pt);
        int result=as.insert(pt);
        if(result>0){
            return "{\"jia\":\"true\"}";
        }
            return "{\"jia\":\"false\"}";
    }


}
