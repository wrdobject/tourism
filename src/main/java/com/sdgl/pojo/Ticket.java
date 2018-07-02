package com.sdgl.pojo;

import java.util.Date;

public class Ticket {
    private Integer ticket_id;
    private String ticket_name;
    private String ticket_abbreviation;
    private String ticket_type;
    private String ticket_class;
    private String ticket_fax;
    private String Ticket_email;
    private String ticket_phone;
    private String ticket_province;
    private String ticket_city;
    private String ticket_county;
    private String ticket_address;
    private String ticket_introduce;
    private Date ticket_time;
    private Integer ticket_owner;

    public Ticket() {
    }

    public Ticket(Integer ticket_id, String ticket_name, String ticket_abbreviation, String ticket_type, String ticket_class, String ticket_fax, String ticket_email, String ticket_phone, String ticket_province, String ticket_city, String ticket_county, String ticket_address, String ticket_introduce, Date ticket_time, Integer ticket_owner) {
        this.ticket_id = ticket_id;
        this.ticket_name = ticket_name;
        this.ticket_abbreviation = ticket_abbreviation;
        this.ticket_type = ticket_type;
        this.ticket_class = ticket_class;
        this.ticket_fax = ticket_fax;
        Ticket_email = ticket_email;
        this.ticket_phone = ticket_phone;
        this.ticket_province = ticket_province;
        this.ticket_city = ticket_city;
        this.ticket_county = ticket_county;
        this.ticket_address = ticket_address;
        this.ticket_introduce = ticket_introduce;
        this.ticket_time = ticket_time;
        this.ticket_owner = ticket_owner;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTicket_name() {
        return ticket_name;
    }

    public void setTicket_name(String ticket_name) {
        this.ticket_name = ticket_name;
    }

    public String getTicket_abbreviation() {
        return ticket_abbreviation;
    }

    public void setTicket_abbreviation(String ticket_abbreviation) {
        this.ticket_abbreviation = ticket_abbreviation;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public String getTicket_class() {
        return ticket_class;
    }

    public void setTicket_class(String ticket_class) {
        this.ticket_class = ticket_class;
    }

    public String getTicket_fax() {
        return ticket_fax;
    }

    public void setTicket_fax(String ticket_fax) {
        this.ticket_fax = ticket_fax;
    }

    public String getTicket_email() {
        return Ticket_email;
    }

    public void setTicket_email(String ticket_email) {
        Ticket_email = ticket_email;
    }

    public String getTicket_phone() {
        return ticket_phone;
    }

    public void setTicket_phone(String ticket_phone) {
        this.ticket_phone = ticket_phone;
    }

    public String getTicket_province() {
        return ticket_province;
    }

    public void setTicket_province(String ticket_province) {
        this.ticket_province = ticket_province;
    }

    public String getTicket_city() {
        return ticket_city;
    }

    public void setTicket_city(String ticket_city) {
        this.ticket_city = ticket_city;
    }

    public String getTicket_county() {
        return ticket_county;
    }

    public void setTicket_county(String ticket_county) {
        this.ticket_county = ticket_county;
    }

    public String getTicket_address() {
        return ticket_address;
    }

    public void setTicket_address(String ticket_address) {
        this.ticket_address = ticket_address;
    }

    public String getTicket_introduce() {
        return ticket_introduce;
    }

    public void setTicket_introduce(String ticket_introduce) {
        this.ticket_introduce = ticket_introduce;
    }

    public Date getTicket_time() {
        return ticket_time;
    }

    public void setTicket_time(Date ticket_time) {
        this.ticket_time = ticket_time;
    }

    public Integer getTicket_owner() {
        return ticket_owner;
    }

    public void setTicket_owner(Integer ticket_owner) {
        this.ticket_owner = ticket_owner;
    }
}
