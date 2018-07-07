package com.sdgl.controller.set;

import com.sdgl.pojo.set.User;
import com.sdgl.service.set.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    //新增员工账号
    @RequestMapping(value = "/insert")
    public String insert(User user){
        int result=userService.insert(user);
        return null;
    }

}
