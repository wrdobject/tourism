package com.sdgl.pojo.suppliers.suppliers;

public class HotelPrice {


    private Integer hotel_price_id;
    private Integer hotel_id;
    private double hotel_price_choice;
    private double hotel_costed_pay;
    private Integer hotel_listed_pay;
    private Integer hotel_price_owner;

    public HotelPrice() {
    }

    public HotelPrice(Integer hotel_price_id, Integer hotel_id, double hotel_price_choice, double hotel_costed_pay, Integer hotel_listed_pay, Integer hotel_price_owner) {
        this.hotel_price_id = hotel_price_id;
        this.hotel_id = hotel_id;
        this.hotel_price_choice = hotel_price_choice;
        this.hotel_costed_pay = hotel_costed_pay;
        this.hotel_listed_pay = hotel_listed_pay;
        this.hotel_price_owner = hotel_price_owner;
    }

    public Integer getHotel_price_id() {
        return hotel_price_id;
    }

    public void setHotel_price_id(Integer hotel_price_id) {
        this.hotel_price_id = hotel_price_id;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public double getHotel_price_choice() {
        return hotel_price_choice;
    }

    public void setHotel_price_choice(double hotel_price_choice) {
        this.hotel_price_choice = hotel_price_choice;
    }

    public double getHotel_costed_pay() {
        return hotel_costed_pay;
    }

    public void setHotel_costed_pay(double hotel_costed_pay) {
        this.hotel_costed_pay = hotel_costed_pay;
    }

    public Integer getHotel_listed_pay() {
        return hotel_listed_pay;
    }

    public void setHotel_listed_pay(Integer hotel_listed_pay) {
        this.hotel_listed_pay = hotel_listed_pay;
    }

    public Integer getHotel_price_owner() {
        return hotel_price_owner;
    }

    public void setHotel_price_owner(Integer hotel_price_owner) {
        this.hotel_price_owner = hotel_price_owner;
    }
}
