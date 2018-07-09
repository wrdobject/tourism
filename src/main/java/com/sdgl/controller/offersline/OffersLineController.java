package com.sdgl.controller.offersline;


import com.alibaba.fastjson.JSON;
import com.sdgl.pojo.offersline.Basic;
import com.sdgl.service.offersline.OffersLineService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 线路页面相关
 */
@Controller
public class OffersLineController {

    @Autowired
    private OffersLineService offersLineService;

    /**
     * 查询全部
     *
     * @param basic_name    线路名称
     * @param basic_num     线路编号
     * @param basic_days    行程天数
     * @return
     */

    @ResponseBody
    @RequestMapping(value="/getAll",produces={"application/json;charset=utf-8"})
    public  Object getAll(@RequestParam(value="basic_name",required = false) String basic_name,@RequestParam(value="basic_num",required = false) String basic_num, @RequestParam(value="basic_days",required = false)Integer basic_days){
        List<Basic> lb=offersLineService.selectBasic(basic_name,basic_num,basic_days);
        System.out.println(lb);
        return  lb;
    }
}
