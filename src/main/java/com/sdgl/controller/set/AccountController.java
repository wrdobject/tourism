package com.sdgl.controller.set;

import com.sdgl.pojo.set.Account;
import com.sdgl.service.set.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(value="/qq")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/ww")
    public String seleec(){
        Account acc=new Account();
        acc.setId(1);
        acc.setAcc_id(123165);
        acc.setAcc_name("sdfsafd");
        acc.setAcc_number("sdfsf");
        acc.setAcc_open("sdfgf");
        acc.setAcc_status("dfdfg");
        String name="asdfasdfasdf";
        List<Account> la=accountService.selectAll();
        int result=accountService.insert(acc);
        int result1=accountService.update(acc.getId(),name);
        int result2=accountService.delete(acc.getId());
        System.out.println(la+"*******"+result+"----"+result1+"------"+result2);

        return null;
    }
}
