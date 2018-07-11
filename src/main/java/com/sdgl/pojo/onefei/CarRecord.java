package com.sdgl.pojo.onefei;

import java.util.Date;

public class CarRecord {
    private Integer qId;

    private Integer qRId;

    private String qCarName;

    private String qType;

    private Date qStartTime;

    private Date qEndTime;

    private String qPlateNum;

    private Double qPrice;

    private String qDriverName;

    private String qIphone;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public Integer getqRId() {
        return qRId;
    }

    public void setqRId(Integer qRId) {
        this.qRId = qRId;
    }

    public String getqCarName() {
        return qCarName;
    }

    public void setqCarName(String qCarName) {
        this.qCarName = qCarName == null ? null : qCarName.trim();
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType == null ? null : qType.trim();
    }

    public Date getqStartTime() {
        return qStartTime;
    }

    public void setqStartTime(Date qStartTime) {
        this.qStartTime = qStartTime;
    }

    public Date getqEndTime() {
        return qEndTime;
    }

    public void setqEndTime(Date qEndTime) {
        this.qEndTime = qEndTime;
    }

    public String getqPlateNum() {
        return qPlateNum;
    }

    public void setqPlateNum(String qPlateNum) {
        this.qPlateNum = qPlateNum == null ? null : qPlateNum.trim();
    }

    public Double getqPrice() {
        return qPrice;
    }

    public void setqPrice(Double qPrice) {
        this.qPrice = qPrice;
    }

    public String getqDriverName() {
        return qDriverName;
    }

    public void setqDriverName(String qDriverName) {
        this.qDriverName = qDriverName == null ? null : qDriverName.trim();
    }

    public String getqIphone() {
        return qIphone;
    }

    public void setqIphone(String qIphone) {
        this.qIphone = qIphone == null ? null : qIphone.trim();
    }
}