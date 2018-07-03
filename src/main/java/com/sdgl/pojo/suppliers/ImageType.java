package com.sdgl.pojo.suppliers;

public class ImageType {

    private Integer img_type_id;
    private String img_type_name;

    public ImageType() {
    }

    public ImageType(Integer img_type_id, String img_type_name) {
        this.img_type_id = img_type_id;
        this.img_type_name = img_type_name;
    }

    public Integer getImg_type_id() {
        return img_type_id;
    }

    public void setImg_type_id(Integer img_type_id) {
        this.img_type_id = img_type_id;
    }

    public String getImg_type_name() {
        return img_type_name;
    }

    public void setImg_type_name(String img_type_name) {
        this.img_type_name = img_type_name;
    }
}
