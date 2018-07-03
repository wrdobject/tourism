package com.sdgl.pojo.suppliers;

import java.util.Date;

public class Ticketing {
    private Integer ticketing_id;
    private String ticketing_name;
    private String ticketing_abbreviation;
    private String ticketing_email;
    private String ticketing_fax;
    private String ticketing_phone;
    private String ticketing_province;
    private String ticketing_city;
    private String ticketing_county;
    private String ticketing_address;
    private String ticketing_synopsis;
    private Date ticketing_time;
    private Integer ticketing_owner;

    public Ticketing() {
    }

    public Ticketing(Integer ticketing_id, String ticketing_name, String ticketing_abbreviation, String ticketing_email, String ticketing_fax, String ticketing_phone, String ticketing_province, String ticketing_city, String ticketing_county, String ticketing_address, String ticketing_synopsis, Date ticketing_time, Integer ticketing_owner) {
        this.ticketing_id = ticketing_id;
        this.ticketing_name = ticketing_name;
        this.ticketing_abbreviation = ticketing_abbreviation;
        this.ticketing_email = ticketing_email;
        this.ticketing_fax = ticketing_fax;
        this.ticketing_phone = ticketing_phone;
        this.ticketing_province = ticketing_province;
        this.ticketing_city = ticketing_city;
        this.ticketing_county = ticketing_county;
        this.ticketing_address = ticketing_address;
        this.ticketing_synopsis = ticketing_synopsis;
        this.ticketing_time = ticketing_time;
        this.ticketing_owner = ticketing_owner;
    }

    public Integer getTicketing_id() {
        return ticketing_id;
    }

    public void setTicketing_id(Integer ticketing_id) {
        this.ticketing_id = ticketing_id;
    }

    public String getTicketing_name() {
        return ticketing_name;
    }

    public void setTicketing_name(String ticketing_name) {
        this.ticketing_name = ticketing_name;
    }

    public String getTicketing_abbreviation() {
        return ticketing_abbreviation;
    }

    public void setTicketing_abbreviation(String ticketing_abbreviation) {
        this.ticketing_abbreviation = ticketing_abbreviation;
    }

    public String getTicketing_email() {
        return ticketing_email;
    }

    public void setTicketing_email(String ticketing_email) {
        this.ticketing_email = ticketing_email;
    }

    public String getTicketing_fax() {
        return ticketing_fax;
    }

    public void setTicketing_fax(String ticketing_fax) {
        this.ticketing_fax = ticketing_fax;
    }

    public String getTicketing_phone() {
        return ticketing_phone;
    }

    public void setTicketing_phone(String ticketing_phone) {
        this.ticketing_phone = ticketing_phone;
    }

    public String getTicketing_province() {
        return ticketing_province;
    }

    public void setTicketing_province(String ticketing_province) {
        this.ticketing_province = ticketing_province;
    }

    public String getTicketing_city() {
        return ticketing_city;
    }

    public void setTicketing_city(String ticketing_city) {
        this.ticketing_city = ticketing_city;
    }

    public String getTicketing_county() {
        return ticketing_county;
    }

    public void setTicketing_county(String ticketing_county) {
        this.ticketing_county = ticketing_county;
    }

    public String getTicketing_address() {
        return ticketing_address;
    }

    public void setTicketing_address(String ticketing_address) {
        this.ticketing_address = ticketing_address;
    }

    public String getTicketing_synopsis() {
        return ticketing_synopsis;
    }

    public void setTicketing_synopsis(String ticketing_synopsis) {
        this.ticketing_synopsis = ticketing_synopsis;
    }

    public Date getTicketing_time() {
        return ticketing_time;
    }

    public void setTicketing_time(Date ticketing_time) {
        this.ticketing_time = ticketing_time;
    }

    public Integer getTicketing_owner() {
        return ticketing_owner;
    }

    public void setTicketing_owner(Integer ticketing_owner) {
        this.ticketing_owner = ticketing_owner;
    }
}
