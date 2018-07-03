package com.sdgl.pojo.suppliers.suppliers;

import java.util.Date;

public class Image {

    private Integer img_id;
    private String img_path;
    private Integer supplier_type;
    private Integer other_id;
    private Integer img_type;
    private Date img_time;

    public Image() {
    }

    public Image(Integer img_id, String img_path, Integer supplier_type, Integer other_id, Integer img_type, Date img_time) {
        this.img_id = img_id;
        this.img_path = img_path;
        this.supplier_type = supplier_type;
        this.other_id = other_id;
        this.img_type = img_type;
        this.img_time = img_time;
    }

    public Integer getImg_id() {
        return img_id;
    }

    public void setImg_id(Integer img_id) {
        this.img_id = img_id;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public Integer getSupplier_type() {
        return supplier_type;
    }

    public void setSupplier_type(Integer supplier_type) {
        this.supplier_type = supplier_type;
    }

    public Integer getOther_id() {
        return other_id;
    }

    public void setOther_id(Integer other_id) {
        this.other_id = other_id;
    }

    public Integer getImg_type() {
        return img_type;
    }

    public void setImg_type(Integer img_type) {
        this.img_type = img_type;
    }

    public Date getImg_time() {
        return img_time;
    }

    public void setImg_time(Date img_time) {
        this.img_time = img_time;
    }
}
