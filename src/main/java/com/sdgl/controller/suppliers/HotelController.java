package com.sdgl.controller.suppliers;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.HotelPrice;
import com.sdgl.pojo.suppliers.Image;
import com.sdgl.pojo.suppliers.Relation;
import com.sdgl.pojo.suppliersfei.Images;
import com.sdgl.service.suppliers.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;

@Controller
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
    @ResponseBody
    @RequestMapping("/hotelList")
    public Object selectAllHotel(Hotel hotel, @RequestParam(value = "yema") Integer yema){
        System.out.println("传入的参数：yema"+yema+"-"+hotel.getHotel_city()+"-"+hotel.getHotel_abbreviation()+"-"+hotel.getHotel_county()+"-"+hotel.getHotel_name());
        PageHelper.startPage(yema, 6);
        List<Hotel> hotelList=hotelService.selectAllHotel(new Hotel());
        System.out.println("数量："+hotelList.size());
        PageInfo<Hotel> pageInfo = new PageInfo<Hotel>(hotelList);
        return pageInfo;
    }

    /**
     * 根据id查询某酒店相关信息
     * @param hotel_id
     * @return
     */
    @RequestMapping("/hotelById")
    public String selectHotelById(@RequestParam(value = "hotel_id") Integer hotel_id,HttpSession session){


        Hotel hotel = hotelService.selectHotelById(hotel_id);

        HotelPrice h = new HotelPrice();

        h.setHotel_id(hotel_id);

        List<HotelPrice> hotelPrice = hotelService.selectHotelPrice(h);

        System.out.println("价钱："+hotelPrice.size());
        session.setAttribute("hotel",hotel);
        session.setAttribute("hotelPrice",hotelPrice);
        //System.out.println("根据id查询出的："+hotel.getHotel_id());
        return "/hotel_show.do";
    }

     /**
     * 根据id查询某酒店相关信息
     * @param hotel_id
     * @return
     */
    @ResponseBody
    @RequestMapping("/hotelById1")
    public Object selectHotelById1(@RequestParam(value = "hotel_id") Integer hotel_id){
        Hotel hotel = hotelService.selectHotelById(hotel_id);
        System.out.println(JSON.toJSONString(hotel));
        return hotel;
    }

    /**
     * 添加或修改酒店
     * @param hotel
     * @return
     */
    @RequestMapping("/addHotel")
    public String addHotel(Hotel hotel){
        System.out.println("修改的id："+hotel.getHotel_id());
        if(hotel.getHotel_id()!=null && !"".equals(hotel.getHotel_id())){
            int re = hotelService.updateHotel(hotel);
            if(re>0){
                System.out.println("修改成功");
                return "redirect:/jiudian";
            }
            System.out.println("错误1");
            return "/hotelById?hotel_id="+hotel.getHotel_id();
        }else{
            System.out.println("没走修改");
            if("请选择省份".equals(hotel.getHotel_province())){
                hotel.setHotel_province(null);
            }
            System.out.println("酒店添加："+hotel.getHotel_name()+"-"+hotel.getHotel_facilities());
            Integer addResult = hotelService.addHotel(hotel);
            System.out.println("添加结果"+addResult);
            return "redirect:/jiudian";
        }

    }

    /**
     * 添加图片，还是多图片哦
     * @param
     * @return
     */
    @PostMapping("/addImage")
    public int relationuploadimg(@RequestParam(value ="image") MultipartFile multipartFile, HttpServletRequest request){
        System.out.println("");
        Images images = new Images();
        if(!multipartFile.isEmpty()){

            String url = ClassUtils.getDefaultClassLoader().getResource("static/img").getPath();
            String name = multipartFile.getOriginalFilename();
            File file = new File(url,name);
            try {
                multipartFile.transferTo(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            images.setImgPath(name);
            images.setImgTime(new Date());
            images.setSupplierType(2);
            int id = hotelService.selectMaxHotelId();
            images.setOtherId(id+1);
            images.setImgType(1);
        }
        return hotelService.addHotelImg(images);
    }



    /**
     * 跳修改页面
     * @param
     * @return
     */
    @RequestMapping("/tiaoXiuGai/{hotel_id}")
    public String tiaoXiuGai(){
        System.out.println("进来了吗");
        return "/hotel_add.do";
    }

    /**
     * 联系人增
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/addHotelRelation")
    public Object addHotelRelation(Relation relation){
        System.out.println("名字"+relation.getRelation_name());
        relation.setRelation_owner(1);
        Integer addHotelRelationResult = hotelService.addHotelRelation(relation);
        return addHotelRelationResult;
    }

    /**
     * 联系人删
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteHotelRelation")
    public Object deleteHotelRelation(Relation relation){
        Integer deleteHotelRelation = hotelService.deleteHotelRelation(relation);
        return deleteHotelRelation;
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
    @ResponseBody
    @RequestMapping("/addHotelPrice")
    public Object addHotelPrice(HotelPrice hotelPrice){
        hotelPrice.setHotel_price_owner(1);
        Integer addHotelPrice = hotelService.addHotelPrice(hotelPrice);
        return addHotelPrice;
    }

    /**
     * 酒店价格删
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteHotelPrice")
    public Object deleteHotelPrice(HotelPrice hotelPrice){
        hotelPrice.setHotel_price_owner(1);
        System.out.println(hotelPrice.getHotel_price_id());
        Integer deleteHotelPrice = hotelService.deleteHotelPrice(hotelPrice);
        return deleteHotelPrice;
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
