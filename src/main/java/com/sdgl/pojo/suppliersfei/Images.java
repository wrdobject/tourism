package com.sdgl.pojo.suppliersfei;

import java.util.Date;

public class Images {
    private Integer imgId;

    private String imgPath;

    private Integer supplierType;

    private Integer otherId;

    private Integer imgType;

    private Date imgTime;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Integer getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(Integer supplierType) {
        this.supplierType = supplierType;
    }

    public Integer getOtherId() {
        return otherId;
    }

    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public Date getImgTime() {
        return imgTime;
    }

    public void setImgTime(Date imgTime) {
        this.imgTime = imgTime;
    }

    @Override
    public String toString() {
        return "Images{" +
                "imgId=" + imgId +
                ", imgPath='" + imgPath + '\'' +
                ", supplierType=" + supplierType +
                ", otherId=" + otherId +
                ", imgType=" + imgType +
                ", imgTime=" + imgTime +
                '}';
    }
}