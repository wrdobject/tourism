package com.sdgl.pojo.offersline;

import java.io.Serializable;
import java.util.Date;


/**
 * Routing
 *
 * 行程安排表
 */
public class Routing implements Serializable {

    private Integer routing_id;             //id主键
    private Integer r_basic_id;             //线路基本信息id
    private Integer routing_days;           //天数(第几天)
    private String routing_title;           //行程标题
    private String routing_via_id;          //途经景点id(多个景点)
    private Integer routing_hotel_id;       //酒店id
    private String routing_content;         //行程内容
    private String routing_breakfast_type;  //早餐类型
    private Double routing_breakfast_price; //早餐餐标
    private String routing_lunch_type;      //午餐类型
    private Double routing_lunch_price;     //午餐餐标
    private String routing_dinner_type;     //晚餐类型
    private Double routing_dinner_price;    //晚餐餐标
    private String routing_departure;       //离开(离)
    private String routing_arrival;         //抵达(抵)
    private Date routing_creation_time;     //创建时间
    private String routing_creation_people; //创建人
    private Date routing_modify_time;       //修改时间
    private String routing_modify_people;   //修改人
    private String routing_one;             //冗余字段
    private String routing_two;             //冗余字段
    private String routing_three;           //冗余字段

    public Integer getRouting_id() {
        return routing_id;
    }

    public void setRouting_id(Integer routing_id) {
        this.routing_id = routing_id;
    }

    public Integer getR_basic_id() {
        return r_basic_id;
    }

    public void setR_basic_id(Integer r_basic_id) {
        this.r_basic_id = r_basic_id;
    }

    public Integer getRouting_days() {
        return routing_days;
    }

    public void setRouting_days(Integer routing_days) {
        this.routing_days = routing_days;
    }

    public String getRouting_title() {
        return routing_title;
    }

    public void setRouting_title(String routing_title) {
        this.routing_title = routing_title;
    }

    public String getRouting_via_id() {
        return routing_via_id;
    }

    public void setRouting_via_id(String routing_via_id) {
        this.routing_via_id = routing_via_id;
    }

    public Integer getRouting_hotel_id() {
        return routing_hotel_id;
    }

    public void setRouting_hotel_id(Integer routing_hotel_id) {
        this.routing_hotel_id = routing_hotel_id;
    }

    public String getRouting_content() {
        return routing_content;
    }

    public void setRouting_content(String routing_content) {
        this.routing_content = routing_content;
    }

    public String getRouting_breakfast_type() {
        return routing_breakfast_type;
    }

    public void setRouting_breakfast_type(String routing_breakfast_type) {
        this.routing_breakfast_type = routing_breakfast_type;
    }

    public Double getRouting_breakfast_price() {
        return routing_breakfast_price;
    }

    public void setRouting_breakfast_price(Double routing_breakfast_price) {
        this.routing_breakfast_price = routing_breakfast_price;
    }

    public String getRouting_lunch_type() {
        return routing_lunch_type;
    }

    public void setRouting_lunch_type(String routing_lunch_type) {
        this.routing_lunch_type = routing_lunch_type;
    }

    public Double getRouting_lunch_price() {
        return routing_lunch_price;
    }

    public void setRouting_lunch_price(Double routing_lunch_price) {
        this.routing_lunch_price = routing_lunch_price;
    }

    public String getRouting_dinner_type() {
        return routing_dinner_type;
    }

    public void setRouting_dinner_type(String routing_dinner_type) {
        this.routing_dinner_type = routing_dinner_type;
    }

    public Double getRouting_dinner_price() {
        return routing_dinner_price;
    }

    public void setRouting_dinner_price(Double routing_dinner_price) {
        this.routing_dinner_price = routing_dinner_price;
    }

    public String getRouting_departure() {
        return routing_departure;
    }

    public void setRouting_departure(String routing_departure) {
        this.routing_departure = routing_departure;
    }

    public String getRouting_arrival() {
        return routing_arrival;
    }

    public void setRouting_arrival(String routing_arrival) {
        this.routing_arrival = routing_arrival;
    }

    public Date getRouting_creation_time() {
        return routing_creation_time;
    }

    public void setRouting_creation_time(Date routing_creation_time) {
        this.routing_creation_time = routing_creation_time;
    }

    public String getRouting_creation_people() {
        return routing_creation_people;
    }

    public void setRouting_creation_people(String routing_creation_people) {
        this.routing_creation_people = routing_creation_people;
    }

    public Date getRouting_modify_time() {
        return routing_modify_time;
    }

    public void setRouting_modify_time(Date routing_modify_time) {
        this.routing_modify_time = routing_modify_time;
    }

    public String getRouting_modify_people() {
        return routing_modify_people;
    }

    public void setRouting_modify_people(String routing_modify_people) {
        this.routing_modify_people = routing_modify_people;
    }

    public String getRouting_one() {
        return routing_one;
    }

    public void setRouting_one(String routing_one) {
        this.routing_one = routing_one;
    }

    public String getRouting_two() {
        return routing_two;
    }

    public void setRouting_two(String routing_two) {
        this.routing_two = routing_two;
    }

    public String getRouting_three() {
        return routing_three;
    }

    public void setRouting_three(String routing_three) {
        this.routing_three = routing_three;
    }
}
