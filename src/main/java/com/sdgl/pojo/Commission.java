package com.sdgl.pojo;

public class Commission {

    private Integer commission_id;
    private String product_id;
    private Integer commission_total;
    private Integer commission_agency;
    private Integer commission_bus;
    private Integer commission_guide;
    private Integer commission_all;
    private String product_introduce;
    private Integer commission_owner;

    public Commission() {
    }

    public Commission(Integer commission_id, String product_id, Integer commission_total, Integer commission_agency, Integer commission_bus, Integer commission_guide, Integer commission_all, String product_introduce, Integer commission_owner) {
        this.commission_id = commission_id;
        this.product_id = product_id;
        this.commission_total = commission_total;
        this.commission_agency = commission_agency;
        this.commission_bus = commission_bus;
        this.commission_guide = commission_guide;
        this.commission_all = commission_all;
        this.product_introduce = product_introduce;
        this.commission_owner = commission_owner;
    }

    public Integer getCommission_id() {
        return commission_id;
    }

    public void setCommission_id(Integer commission_id) {
        this.commission_id = commission_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public Integer getCommission_total() {
        return commission_total;
    }

    public void setCommission_total(Integer commission_total) {
        this.commission_total = commission_total;
    }

    public Integer getCommission_agency() {
        return commission_agency;
    }

    public void setCommission_agency(Integer commission_agency) {
        this.commission_agency = commission_agency;
    }

    public Integer getCommission_bus() {
        return commission_bus;
    }

    public void setCommission_bus(Integer commission_bus) {
        this.commission_bus = commission_bus;
    }

    public Integer getCommission_guide() {
        return commission_guide;
    }

    public void setCommission_guide(Integer commission_guide) {
        this.commission_guide = commission_guide;
    }

    public Integer getCommission_all() {
        return commission_all;
    }

    public void setCommission_all(Integer commission_all) {
        this.commission_all = commission_all;
    }

    public String getProduct_introduce() {
        return product_introduce;
    }

    public void setProduct_introduce(String product_introduce) {
        this.product_introduce = product_introduce;
    }

    public Integer getCommission_owner() {
        return commission_owner;
    }

    public void setCommission_owner(Integer commission_owner) {
        this.commission_owner = commission_owner;
    }
}
