package com.sdgl.controller.onefei;

import com.sdgl.mapper.onefei.RoutingMapper;
import com.sdgl.pojo.onefei.RoutingExample;
import com.sdgl.pojo.onefei.Routings;
import com.sdgl.pojo.onefei.TeamAll;
import com.sdgl.service.onefei.UntitledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UntitledController {

    @Autowired
    private UntitledService untitledService;

    @Autowired
    private RoutingMapper routingMapper;


    @RequestMapping("/goUntitled/{id}")
    public String goUntitled(){
        return "/1_one/Untitled-1";
    }


    @RequestMapping("/selectTeamAll")
    @ResponseBody
    public TeamAll getTeam(Integer id){
        TeamAll teamAll = untitledService.selectTeamAll(id);
        System.out.println(teamAll);
        return teamAll;
    }

    @RequestMapping("/getRouting")
    @ResponseBody
    public List<Routings> getRouting(Integer basicId){

        return routingMapper.selectAllRout(basicId);
    }
}
