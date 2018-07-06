package com.sdgl.pojo.offersline;

import java.io.Serializable;
import java.util.Date;

/**
 * Offers
 *
 * 报价表
 */
public class Offers implements Serializable {

    private Integer offer_id;           //id主键
    private Integer offer_travel_id;    //组团社id
    private Integer travel_num;         //出游人数
    private Date travel_time;           //出游日期
    private Date scattered;             //散团日期
    private Integer daystrip;           //行程天数
    private String routing_requirements;//行程要求
    private String offer_document;      //相关文件
    private Integer o_basic_id;         //线路基本信息id
    private Double offer_car;           //车辆报价
    private Integer offer_yroom;        //加床房间数
    private Integer offer_nroom;        //不加床房间数
    private String itinerary_features;  //行程特色
    private String offer_yincludes;     //费用包含
    private String offer_nincludes;     //费用不包含
    private String need_know;           //预定须知
    private String warm_prompt;         //温馨提示
    private String offer_remark;        //报价备注
    private String standard;            //接待标准
    private Integer offer_type;          //报价状态
    private String offer_sp;            //购物项sp
    private Date entering_time;         //录入时间
    private String entering_person;     //录入人
    private String offer_person;        //报价人
    private Date offer_time;            //报价日期
    private String offer_one;           //冗余字段
    private String offer_two;           //冗余字段
    private String offer_three;         //冗余字段

    public Integer getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(Integer offer_id) {
        this.offer_id = offer_id;
    }

    public Integer getOffer_travel_id() {
        return offer_travel_id;
    }

    public void setOffer_travel_id(Integer offer_travel_id) {
        this.offer_travel_id = offer_travel_id;
    }

    public Integer getTravel_num() {
        return travel_num;
    }

    public void setTravel_num(Integer travel_num) {
        this.travel_num = travel_num;
    }

    public Date getTravel_time() {
        return travel_time;
    }

    public void setTravel_time(Date travel_time) {
        this.travel_time = travel_time;
    }

    public Date getScattered() {
        return scattered;
    }

    public void setScattered(Date scattered) {
        this.scattered = scattered;
    }

    public Integer getDaystrip() {
        return daystrip;
    }

    public void setDaystrip(Integer daystrip) {
        this.daystrip = daystrip;
    }

    public String getRouting_requirements() {
        return routing_requirements;
    }

    public void setRouting_requirements(String routing_requirements) {
        this.routing_requirements = routing_requirements;
    }

    public String getOffer_document() {
        return offer_document;
    }

    public void setOffer_document(String offer_document) {
        this.offer_document = offer_document;
    }

    public Integer getO_basic_id() {
        return o_basic_id;
    }

    public void setO_basic_id(Integer o_basic_id) {
        this.o_basic_id = o_basic_id;
    }

    public Double getOffer_car() {
        return offer_car;
    }

    public void setOffer_car(Double offer_car) {
        this.offer_car = offer_car;
    }

    public Integer getOffer_yroom() {
        return offer_yroom;
    }

    public void setOffer_yroom(Integer offer_yroom) {
        this.offer_yroom = offer_yroom;
    }

    public Integer getOffer_nroom() {
        return offer_nroom;
    }

    public void setOffer_nroom(Integer offer_nroom) {
        this.offer_nroom = offer_nroom;
    }

    public String getItinerary_features() {
        return itinerary_features;
    }

    public void setItinerary_features(String itinerary_features) {
        this.itinerary_features = itinerary_features;
    }

    public String getOffer_yincludes() {
        return offer_yincludes;
    }

    public void setOffer_yincludes(String offer_yincludes) {
        this.offer_yincludes = offer_yincludes;
    }

    public String getOffer_nincludes() {
        return offer_nincludes;
    }

    public void setOffer_nincludes(String offer_nincludes) {
        this.offer_nincludes = offer_nincludes;
    }

    public String getNeed_know() {
        return need_know;
    }

    public void setNeed_know(String need_know) {
        this.need_know = need_know;
    }

    public String getWarm_prompt() {
        return warm_prompt;
    }

    public void setWarm_prompt(String warm_prompt) {
        this.warm_prompt = warm_prompt;
    }

    public String getOffer_remark() {
        return offer_remark;
    }

    public void setOffer_remark(String offer_remark) {
        this.offer_remark = offer_remark;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Integer getOffer_type() {
        return offer_type;
    }

    public void setOffer_type(Integer offer_type) {
        this.offer_type = offer_type;
    }

    public String getOffer_sp() {
        return offer_sp;
    }

    public void setOffer_sp(String offer_sp) {
        this.offer_sp = offer_sp;
    }

    public Date getEntering_time() {
        return entering_time;
    }

    public void setEntering_time(Date entering_time) {
        this.entering_time = entering_time;
    }

    public String getEntering_person() {
        return entering_person;
    }

    public void setEntering_person(String entering_person) {
        this.entering_person = entering_person;
    }

    public String getOffer_person() {
        return offer_person;
    }

    public void setOffer_person(String offer_person) {
        this.offer_person = offer_person;
    }

    public Date getOffer_time() {
        return offer_time;
    }

    public void setOffer_time(Date offer_time) {
        this.offer_time = offer_time;
    }

    public String getOffer_one() {
        return offer_one;
    }

    public void setOffer_one(String offer_one) {
        this.offer_one = offer_one;
    }

    public String getOffer_two() {
        return offer_two;
    }

    public void setOffer_two(String offer_two) {
        this.offer_two = offer_two;
    }

    public String getOffer_three() {
        return offer_three;
    }

    public void setOffer_three(String offer_three) {
        this.offer_three = offer_three;
    }
}
