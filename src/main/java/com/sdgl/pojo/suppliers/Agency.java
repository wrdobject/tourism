package com.sdgl.pojo.suppliers.suppliers;

import java.util.Date;

public class Agency {
    private Integer agency_id;
    private String agency_name;
    private String agency_abbreviation;
    private String agency_type;
    private String agency_email;
    private String agency_fax;
    private String agency_phone;
    private String agency_province;
    private String agency_city;
    private String agency_county;
    private String agency_address;
    private String agency_synopsis;
    private Date agency_time;
    private Integer agency_owner;

    public Agency() {
    }

    public Agency(Integer agency_id, String agency_name, String agency_abbreviation, String agency_type, String agency_email, String agency_fax, String agency_phone, String agency_province, String agency_city, String agency_county, String agency_address, String agency_synopsis, Date agency_time, Integer agency_owner) {
        this.agency_id = agency_id;
        this.agency_name = agency_name;
        this.agency_abbreviation = agency_abbreviation;
        this.agency_type = agency_type;
        this.agency_email = agency_email;
        this.agency_fax = agency_fax;
        this.agency_phone = agency_phone;
        this.agency_province = agency_province;
        this.agency_city = agency_city;
        this.agency_county = agency_county;
        this.agency_address = agency_address;
        this.agency_synopsis = agency_synopsis;
        this.agency_time = agency_time;
        this.agency_owner = agency_owner;
    }

    public Integer getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(Integer agency_id) {
        this.agency_id = agency_id;
    }

    public String getAgency_name() {
        return agency_name;
    }

    public void setAgency_name(String agency_name) {
        this.agency_name = agency_name;
    }

    public String getAgency_abbreviation() {
        return agency_abbreviation;
    }

    public void setAgency_abbreviation(String agency_abbreviation) {
        this.agency_abbreviation = agency_abbreviation;
    }

    public String getAgency_type() {
        return agency_type;
    }

    public void setAgency_type(String agency_type) {
        this.agency_type = agency_type;
    }

    public String getAgency_email() {
        return agency_email;
    }

    public void setAgency_email(String agency_email) {
        this.agency_email = agency_email;
    }

    public String getAgency_fax() {
        return agency_fax;
    }

    public void setAgency_fax(String agency_fax) {
        this.agency_fax = agency_fax;
    }

    public String getAgency_phone() {
        return agency_phone;
    }

    public void setAgency_phone(String agency_phone) {
        this.agency_phone = agency_phone;
    }

    public String getAgency_province() {
        return agency_province;
    }

    public void setAgency_province(String agency_province) {
        this.agency_province = agency_province;
    }

    public String getAgency_city() {
        return agency_city;
    }

    public void setAgency_city(String agency_city) {
        this.agency_city = agency_city;
    }

    public String getAgency_county() {
        return agency_county;
    }

    public void setAgency_county(String agency_county) {
        this.agency_county = agency_county;
    }

    public String getAgency_address() {
        return agency_address;
    }

    public void setAgency_address(String agency_address) {
        this.agency_address = agency_address;
    }

    public String getAgency_synopsis() {
        return agency_synopsis;
    }

    public void setAgency_synopsis(String agency_synopsis) {
        this.agency_synopsis = agency_synopsis;
    }

    public Date getAgency_time() {
        return agency_time;
    }

    public void setAgency_time(Date agency_time) {
        this.agency_time = agency_time;
    }

    public Integer getAgency_owner() {
        return agency_owner;
    }

    public void setAgency_owner(Integer agency_owner) {
        this.agency_owner = agency_owner;
    }
}
