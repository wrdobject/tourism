package com.sdgl.pojo.suppliersfei;

import java.util.Date;

public class Tickets {
    private Integer ticketId;

    private String ticketName;

    private String ticketAbbreviation;

    private String ticketType;

    private String ticketClass;

    private String ticketFax;

    private String ticketEmail;

    private String ticketPhone;

    private String ticketProvince;

    private String ticketCity;

    private String ticketCounty;

    private String ticketAddress;

    private String ticketIntroduce;

    private Date ticketTime;

    private Integer ticketOwner;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName == null ? null : ticketName.trim();
    }

    public String getTicketAbbreviation() {
        return ticketAbbreviation;
    }

    public void setTicketAbbreviation(String ticketAbbreviation) {
        this.ticketAbbreviation = ticketAbbreviation == null ? null : ticketAbbreviation.trim();
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType == null ? null : ticketType.trim();
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass == null ? null : ticketClass.trim();
    }

    public String getTicketFax() {
        return ticketFax;
    }

    public void setTicketFax(String ticketFax) {
        this.ticketFax = ticketFax == null ? null : ticketFax.trim();
    }

    public String getTicketEmail() {
        return ticketEmail;
    }

    public void setTicketEmail(String ticketEmail) {
        this.ticketEmail = ticketEmail == null ? null : ticketEmail.trim();
    }

    public String getTicketPhone() {
        return ticketPhone;
    }

    public void setTicketPhone(String ticketPhone) {
        this.ticketPhone = ticketPhone == null ? null : ticketPhone.trim();
    }

    public String getTicketProvince() {
        return ticketProvince;
    }

    public void setTicketProvince(String ticketProvince) {
        this.ticketProvince = ticketProvince == null ? null : ticketProvince.trim();
    }

    public String getTicketCity() {
        return ticketCity;
    }

    public void setTicketCity(String ticketCity) {
        this.ticketCity = ticketCity == null ? null : ticketCity.trim();
    }

    public String getTicketCounty() {
        return ticketCounty;
    }

    public void setTicketCounty(String ticketCounty) {
        this.ticketCounty = ticketCounty == null ? null : ticketCounty.trim();
    }

    public String getTicketAddress() {
        return ticketAddress;
    }

    public void setTicketAddress(String ticketAddress) {
        this.ticketAddress = ticketAddress == null ? null : ticketAddress.trim();
    }

    public String getTicketIntroduce() {
        return ticketIntroduce;
    }

    public void setTicketIntroduce(String ticketIntroduce) {
        this.ticketIntroduce = ticketIntroduce == null ? null : ticketIntroduce.trim();
    }

    public Date getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(Date ticketTime) {
        this.ticketTime = ticketTime;
    }

    public Integer getTicketOwner() {
        return ticketOwner;
    }

    public void setTicketOwner(Integer ticketOwner) {
        this.ticketOwner = ticketOwner;
    }


    @Override
    public String toString() {
        return "Tickets{" +
                "ticketId=" + ticketId +
                ", ticketName='" + ticketName + '\'' +
                ", ticketAbbreviation='" + ticketAbbreviation + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", ticketClass='" + ticketClass + '\'' +
                ", ticketFax='" + ticketFax + '\'' +
                ", ticketEmail='" + ticketEmail + '\'' +
                ", ticketPhone='" + ticketPhone + '\'' +
                ", ticketProvince='" + ticketProvince + '\'' +
                ", ticketCity='" + ticketCity + '\'' +
                ", ticketCounty='" + ticketCounty + '\'' +
                ", ticketAddress='" + ticketAddress + '\'' +
                ", ticketIntroduce='" + ticketIntroduce + '\'' +
                ", ticketTime=" + ticketTime +
                ", ticketOwner=" + ticketOwner +
                '}';
    }
}