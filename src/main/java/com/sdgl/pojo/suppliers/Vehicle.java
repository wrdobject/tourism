package com.sdgl.pojo.suppliers.suppliers;


import java.util.Date;

public class Vehicle {
    private Integer vehicle_id;
    private Integer bus_fleet_id;
    private String vehicle_number;
    private String vehicle_type;
    private String vehicle_img;
    private Date vehicle_time;
    private Integer vehicle_owner;

    public Vehicle() {
    }

    public Vehicle(Integer vehicle_id, Integer bus_fleet_id, String vehicle_number, String vehicle_type, String vehicle_img, Date vehicle_time, Integer vehicle_owner) {
        this.vehicle_id = vehicle_id;
        this.bus_fleet_id = bus_fleet_id;
        this.vehicle_number = vehicle_number;
        this.vehicle_type = vehicle_type;
        this.vehicle_img = vehicle_img;
        this.vehicle_time = vehicle_time;
        this.vehicle_owner = vehicle_owner;
    }

    public Integer getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Integer vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Integer getBus_fleet_id() {
        return bus_fleet_id;
    }

    public void setBus_fleet_id(Integer bus_fleet_id) {
        this.bus_fleet_id = bus_fleet_id;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_img() {
        return vehicle_img;
    }

    public void setVehicle_img(String vehicle_img) {
        this.vehicle_img = vehicle_img;
    }

    public Date getVehicle_time() {
        return vehicle_time;
    }

    public void setVehicle_time(Date vehicle_time) {
        this.vehicle_time = vehicle_time;
    }

    public Integer getVehicle_owner() {
        return vehicle_owner;
    }

    public void setVehicle_owner(Integer vehicle_owner) {
        this.vehicle_owner = vehicle_owner;
    }
}
