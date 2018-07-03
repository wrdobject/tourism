package com.sdgl.pojo.suppliers.suppliers;

import java.util.Date;

public class Restaurant {

    private Integer restaurant_id;
    private String restaurant_name;
    private String restaurant_abbreviation;
    private String restaurant_route;
    private String restaurant_type;
    private String restaurant_email;
    private String Restaurant_fax;
    private String restaurant_phone;
    private String restaurant_province;
    private String restaurant_city;
    private String restaurant_county;
    private String restaurant_address;
    private String restaurant_introduce;
    private Date restaurant_time;
    private Integer restaurant_owner;

    public Restaurant() {
    }

    public Restaurant(Integer restaurant_id, String restaurant_name, String restaurant_abbreviation, String restaurant_route, String restaurant_type, String restaurant_email, String restaurant_fax, String restaurant_phone, String restaurant_province, String restaurant_city, String restaurant_county, String restaurant_address, String restaurant_introduce, Date restaurant_time, Integer restaurant_owner) {
        this.restaurant_id = restaurant_id;
        this.restaurant_name = restaurant_name;
        this.restaurant_abbreviation = restaurant_abbreviation;
        this.restaurant_route = restaurant_route;
        this.restaurant_type = restaurant_type;
        this.restaurant_email = restaurant_email;
        Restaurant_fax = restaurant_fax;
        this.restaurant_phone = restaurant_phone;
        this.restaurant_province = restaurant_province;
        this.restaurant_city = restaurant_city;
        this.restaurant_county = restaurant_county;
        this.restaurant_address = restaurant_address;
        this.restaurant_introduce = restaurant_introduce;
        this.restaurant_time = restaurant_time;
        this.restaurant_owner = restaurant_owner;
    }

    public Integer getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(Integer restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getRestaurant_abbreviation() {
        return restaurant_abbreviation;
    }

    public void setRestaurant_abbreviation(String restaurant_abbreviation) {
        this.restaurant_abbreviation = restaurant_abbreviation;
    }

    public String getRestaurant_route() {
        return restaurant_route;
    }

    public void setRestaurant_route(String restaurant_route) {
        this.restaurant_route = restaurant_route;
    }

    public String getRestaurant_type() {
        return restaurant_type;
    }

    public void setRestaurant_type(String restaurant_type) {
        this.restaurant_type = restaurant_type;
    }

    public String getRestaurant_email() {
        return restaurant_email;
    }

    public void setRestaurant_email(String restaurant_email) {
        this.restaurant_email = restaurant_email;
    }

    public String getRestaurant_fax() {
        return Restaurant_fax;
    }

    public void setRestaurant_fax(String restaurant_fax) {
        Restaurant_fax = restaurant_fax;
    }

    public String getRestaurant_phone() {
        return restaurant_phone;
    }

    public void setRestaurant_phone(String restaurant_phone) {
        this.restaurant_phone = restaurant_phone;
    }

    public String getRestaurant_province() {
        return restaurant_province;
    }

    public void setRestaurant_province(String restaurant_province) {
        this.restaurant_province = restaurant_province;
    }

    public String getRestaurant_city() {
        return restaurant_city;
    }

    public void setRestaurant_city(String restaurant_city) {
        this.restaurant_city = restaurant_city;
    }

    public String getRestaurant_county() {
        return restaurant_county;
    }

    public void setRestaurant_county(String restaurant_county) {
        this.restaurant_county = restaurant_county;
    }

    public String getRestaurant_address() {
        return restaurant_address;
    }

    public void setRestaurant_address(String restaurant_address) {
        this.restaurant_address = restaurant_address;
    }

    public String getRestaurant_introduce() {
        return restaurant_introduce;
    }

    public void setRestaurant_introduce(String restaurant_introduce) {
        this.restaurant_introduce = restaurant_introduce;
    }

    public Date getRestaurant_time() {
        return restaurant_time;
    }

    public void setRestaurant_time(Date restaurant_time) {
        this.restaurant_time = restaurant_time;
    }

    public Integer getRestaurant_owner() {
        return restaurant_owner;
    }

    public void setRestaurant_owner(Integer restaurant_owner) {
        this.restaurant_owner = restaurant_owner;
    }
}
