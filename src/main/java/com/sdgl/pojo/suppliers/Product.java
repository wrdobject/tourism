package com.sdgl.pojo.suppliers;

import java.util.Date;

public class Product {

    private Integer product_id;
    private String product_name;
    private String product_price;
    private String product_type;
    private String product_email;
    private String product_fax;
    private String product_phone;
    private String product_province;
    private String product_city;
    private String product_county;
    private String product_address;
    private Date product_time;
    private String product_introduce;
    private Integer product_owner;

    public Product() {
    }

    public Product(Integer product_id, String product_name, String product_price, String product_type, String product_email, String product_fax, String product_phone, String product_province, String product_city, String product_county, String product_address, Date product_time, String product_introduce, Integer product_owner) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_type = product_type;
        this.product_email = product_email;
        this.product_fax = product_fax;
        this.product_phone = product_phone;
        this.product_province = product_province;
        this.product_city = product_city;
        this.product_county = product_county;
        this.product_address = product_address;
        this.product_time = product_time;
        this.product_introduce = product_introduce;
        this.product_owner = product_owner;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getProduct_email() {
        return product_email;
    }

    public void setProduct_email(String product_email) {
        this.product_email = product_email;
    }

    public String getProduct_fax() {
        return product_fax;
    }

    public void setProduct_fax(String product_fax) {
        this.product_fax = product_fax;
    }

    public String getProduct_phone() {
        return product_phone;
    }

    public void setProduct_phone(String product_phone) {
        this.product_phone = product_phone;
    }

    public String getProduct_province() {
        return product_province;
    }

    public void setProduct_province(String product_province) {
        this.product_province = product_province;
    }

    public String getProduct_city() {
        return product_city;
    }

    public void setProduct_city(String product_city) {
        this.product_city = product_city;
    }

    public String getProduct_county() {
        return product_county;
    }

    public void setProduct_county(String product_county) {
        this.product_county = product_county;
    }

    public String getProduct_address() {
        return product_address;
    }

    public void setProduct_address(String product_address) {
        this.product_address = product_address;
    }

    public Date getProduct_time() {
        return product_time;
    }

    public void setProduct_time(Date product_time) {
        this.product_time = product_time;
    }

    public String getProduct_introduce() {
        return product_introduce;
    }

    public void setProduct_introduce(String product_introduce) {
        this.product_introduce = product_introduce;
    }

    public Integer getProduct_owner() {
        return product_owner;
    }

    public void setProduct_owner(Integer product_owner) {
        this.product_owner = product_owner;
    }
}
