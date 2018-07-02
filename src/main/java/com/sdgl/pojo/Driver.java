package com.sdgl.pojo;

import java.util.Date;

public class Driver {
    private Integer driver_id;
    private Integer bus_fleet_id;
    private String driver_name;
    private String driver_card;
    private String driver_phone;
    private Integer driver_driving_age;
    private String driver_sex;
    private String driver_img;
    private Date driver_time;
    private Integer driver_owner;

    public Driver() {
    }

    public Driver(Integer driver_id, Integer bus_fleet_id, String driver_name, String driver_card, String driver_phone, Integer driver_driving_age, String driver_sex, String driver_img, Date driver_time, Integer driver_owner) {
        this.driver_id = driver_id;
        this.bus_fleet_id = bus_fleet_id;
        this.driver_name = driver_name;
        this.driver_card = driver_card;
        this.driver_phone = driver_phone;
        this.driver_driving_age = driver_driving_age;
        this.driver_sex = driver_sex;
        this.driver_img = driver_img;
        this.driver_time = driver_time;
        this.driver_owner = driver_owner;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public Integer getBus_fleet_id() {
        return bus_fleet_id;
    }

    public void setBus_fleet_id(Integer bus_fleet_id) {
        this.bus_fleet_id = bus_fleet_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_card() {
        return driver_card;
    }

    public void setDriver_card(String driver_card) {
        this.driver_card = driver_card;
    }

    public String getDriver_phone() {
        return driver_phone;
    }

    public void setDriver_phone(String driver_phone) {
        this.driver_phone = driver_phone;
    }

    public Integer getDriver_driving_age() {
        return driver_driving_age;
    }

    public void setDriver_driving_age(Integer driver_driving_age) {
        this.driver_driving_age = driver_driving_age;
    }

    public String getDriver_sex() {
        return driver_sex;
    }

    public void setDriver_sex(String driver_sex) {
        this.driver_sex = driver_sex;
    }

    public String getDriver_img() {
        return driver_img;
    }

    public void setDriver_img(String driver_img) {
        this.driver_img = driver_img;
    }

    public Date getDriver_time() {
        return driver_time;
    }

    public void setDriver_time(Date driver_time) {
        this.driver_time = driver_time;
    }

    public Integer getDriver_owner() {
        return driver_owner;
    }

    public void setDriver_owner(Integer driver_owner) {
        this.driver_owner = driver_owner;
    }
}
