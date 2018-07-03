package com.sdgl.pojo.suppliers.suppliers;

public class Meals {

    private Integer meal_id;
    private Integer restaurant_id;
    private String meal_type;
    private double meal_costed_pay;
    private double meal_listed_pay;
    private String meal_introduce;
    private Integer meal_owner;

    public Meals() {
    }

    public Meals(Integer meal_id, Integer restaurant_id, String meal_type, double meal_costed_pay, double meal_listed_pay, String meal_introduce, Integer meal_owner) {
        this.meal_id = meal_id;
        this.restaurant_id = restaurant_id;
        this.meal_type = meal_type;
        this.meal_costed_pay = meal_costed_pay;
        this.meal_listed_pay = meal_listed_pay;
        this.meal_introduce = meal_introduce;
        this.meal_owner = meal_owner;
    }

    public Integer getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(Integer meal_id) {
        this.meal_id = meal_id;
    }

    public Integer getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(Integer restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getMeal_type() {
        return meal_type;
    }

    public void setMeal_type(String meal_type) {
        this.meal_type = meal_type;
    }

    public double getMeal_costed_pay() {
        return meal_costed_pay;
    }

    public void setMeal_costed_pay(double meal_costed_pay) {
        this.meal_costed_pay = meal_costed_pay;
    }

    public double getMeal_listed_pay() {
        return meal_listed_pay;
    }

    public void setMeal_listed_pay(double meal_listed_pay) {
        this.meal_listed_pay = meal_listed_pay;
    }

    public String getMeal_introduce() {
        return meal_introduce;
    }

    public void setMeal_introduce(String meal_introduce) {
        this.meal_introduce = meal_introduce;
    }

    public Integer getMeal_owner() {
        return meal_owner;
    }

    public void setMeal_owner(Integer meal_owner) {
        this.meal_owner = meal_owner;
    }
}
