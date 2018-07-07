package com.sdgl.controller.suppliersfei;

import com.sdgl.pojo.suppliersfei.Relations;
import com.sdgl.service.suppliersfei.RelationServices;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.io.File;
import java.util.UUID;

@Controller
public class RelationController {

    @Autowired
    private RelationServices relationServices;

    @PostMapping("/updaterelationbyid")
    @ResponseBody
    public int updaterelationbyid(Relations relations){
        return relationServices.updaterelationbyid(relations);
    }

    @PostMapping("/deletebyrelaid")
    @ResponseBody
    public int deletebyrelaid(Relations relations){
        return relationServices.deletebyrelaid(relations);
    }

    @PostMapping("/insertrelation")
    public String insertrelation(Relations relations){
        relations.setRelationOwner(1);
        relations.setRelationType(4);
        relationServices.insertrelation(relations);
        return "/3/menpiao/ticket";
    }
}
