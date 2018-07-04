package com.sdgl.controller.suppliers;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.HotelPrice;
import com.sdgl.pojo.suppliers.Image;
import com.sdgl.pojo.suppliers.Relation;
import com.sdgl.service.op.TestService;
import com.sdgl.service.suppliers.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;
    //以下测试时自备数据? ? = ?

    /**
     * 查询首页列表
     * @param hotel
     * @param yema
     * @return
     */
    @RequestMapping("/hotelList")
    public String selectAllHotel(Hotel hotel,@RequestParam(value = "yema") Integer yema){
        PageHelper.startPage(yema, 6);
        List<Hotel> hotelList=hotelService.selectAllHotel(new Hotel());
        PageInfo<Hotel> pageInfo = new PageInfo<Hotel>(hotelList);
        return JSON.toJSONString(pageInfo);
    }

    /**
     * 根据id查询某酒店相关信息
     * @param hotel_id
     * @return
     */
    @RequestMapping("/hotelById")
    public String selectHotelById(@RequestParam(value = "hotel_id") Integer hotel_id){
        Hotel hotel = hotelService.selectHotelById(hotel_id);
        return JSON.toJSONString(hotel);
    }

    /**
     * 添加酒店
     * @param hotel
     * @return
     */
    @RequestMapping("/addHotel")
    public String addHotel(Hotel hotel){
        Integer addResult = hotelService.addHotel(hotel);
        return JSON.toJSONString(addResult);
    }

    /**
     * 添加图片，还是多图片哦
     * @param hotel_id
     * @return
     */
    @RequestMapping("/addImage")
    public String addImage(@RequestParam("hotel_id")Integer hotel_id,HttpServletRequest request){
        String filePath = request.getSession().getServletContext().getRealPath("/")+ "static/img/";
        List<File> files = FileUtil.getInstance(filePath).upload(request);
        Image image = new Image();
        image.setSupplier_type(2);
        image.setImg_type(1);
        image.setOther_id(hotel_id);
        Integer addImageResult = hotelService.addHotelImg(image,files);
        return JSON.toJSONString(files);
    }

    /**
     * 修改酒店
     * @param hotel
     * @return
     */
    @RequestMapping("/updateHotel")
    public String updateHotel(Hotel hotel){
        Integer updateResult = hotelService.updateHotel(hotel);
        return JSON.toJSONString(updateResult);
    }

    /**
     * 联系人增
     * @param
     * @return
     */
    @RequestMapping("/addHotelRelation")
    public String addHotelRelation(Relation relation){
        Integer addHotelRelationResult = hotelService.addHotelRelation(relation);
        return JSON.toJSONString(addHotelRelationResult);
    }

    /**
     * 联系人删
     * @param
     * @return
     */
    @RequestMapping("/deleteHotelRelation")
    public String deleteHotelRelation(Relation relation){
        Integer deleteHotelRelation = hotelService.deleteHotelRelation(relation);
        return JSON.toJSONString(deleteHotelRelation);
    }

    /**
     * 联系人改
     * @param
     * @return
     */
    @RequestMapping("/updateHotelRelation")
    public String updateHotelRelation(Relation relation){
        Integer updateHotelRelation = hotelService.updateHotelRelation(relation);
        return JSON.toJSONString(updateHotelRelation);
    }

    /**
     * 联系人查
     * @param
     * @return
     */
    @RequestMapping("/selectHotelRelation")
    public String selectHotelRelation(Relation relation){
        List<Relation> selectHotelRelation = hotelService.selectHotelRelation(relation);
        return JSON.toJSONString(selectHotelRelation);
    }

    /**
     * 酒店价格增
     * @param
     * @return
     */
    @RequestMapping("/addHotelPrice")
    public String addHotelPrice(HotelPrice hotelPrice){
        Integer addHotelPrice = hotelService.addHotelPrice(hotelPrice);
        return JSON.toJSONString(addHotelPrice);
    }

    /**
     * 酒店价格删
     * @param
     * @return
     */
    @RequestMapping("/deleteHotelPrice")
    public String deleteHotelPrice(HotelPrice hotelPrice){
        Integer deleteHotelPrice = hotelService.deleteHotelPrice(hotelPrice);
        return JSON.toJSONString(deleteHotelPrice);
    }

    /**
     * 酒店价格改
     * @param
     * @return
     */
    @RequestMapping("/updateHotelPrice")
    public String updateHotelPrice(HotelPrice hotelPrice){
        Integer updateHotelPrice = hotelService.updateHotelPrice(hotelPrice);
        return JSON.toJSONString(updateHotelPrice);
    }

    /**
     * 酒店价格查
     * @param
     * @return
     */
    @RequestMapping("/selectHotelPrice")
    public String selectHotelPrice(HotelPrice hotelPrice){
        List<HotelPrice> selectHotelPrice = hotelService.selectHotelPrice(hotelPrice);
        return JSON.toJSONString(selectHotelPrice);
    }
}
