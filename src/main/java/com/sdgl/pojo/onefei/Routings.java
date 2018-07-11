package com.sdgl.pojo.onefei;

import com.sdgl.pojo.suppliersfei.Tickets;

import java.util.Date;

public class Routings extends Tickets {
    private Integer routingId;

    private Integer rBasicId;

    private Integer routingDays;

    private String routingTitle;

    private String routingViaId;

    private Integer routingHotelId;

    private String routingContent;

    private String routingBreakfastType;

    private Double routingBreakfastPrice;

    private String routingLunchType;

    private Double routingLunchPrice;

    private String routingDinnerType;

    private Double routingDinnerPrice;

    private String routingDeparture;

    private String routingArrival;

    private Date routingCreationTime;

    private String routingCreationPeople;

    private Date routingModifyTime;

    private String routingModifyPeople;

    private String routingOne;

    private String routingTwo;

    private String routingThree;

    public Integer getRoutingId() {
        return routingId;
    }

    public void setRoutingId(Integer routingId) {
        this.routingId = routingId;
    }

    public Integer getrBasicId() {
        return rBasicId;
    }

    public void setrBasicId(Integer rBasicId) {
        this.rBasicId = rBasicId;
    }

    public Integer getRoutingDays() {
        return routingDays;
    }

    public void setRoutingDays(Integer routingDays) {
        this.routingDays = routingDays;
    }

    public String getRoutingTitle() {
        return routingTitle;
    }

    public void setRoutingTitle(String routingTitle) {
        this.routingTitle = routingTitle == null ? null : routingTitle.trim();
    }

    public String getRoutingViaId() {
        return routingViaId;
    }

    public void setRoutingViaId(String routingViaId) {
        this.routingViaId = routingViaId == null ? null : routingViaId.trim();
    }

    public Integer getRoutingHotelId() {
        return routingHotelId;
    }

    public void setRoutingHotelId(Integer routingHotelId) {
        this.routingHotelId = routingHotelId;
    }

    public String getRoutingContent() {
        return routingContent;
    }

    public void setRoutingContent(String routingContent) {
        this.routingContent = routingContent == null ? null : routingContent.trim();
    }

    public String getRoutingBreakfastType() {
        return routingBreakfastType;
    }

    public void setRoutingBreakfastType(String routingBreakfastType) {
        this.routingBreakfastType = routingBreakfastType == null ? null : routingBreakfastType.trim();
    }

    public Double getRoutingBreakfastPrice() {
        return routingBreakfastPrice;
    }

    public void setRoutingBreakfastPrice(Double routingBreakfastPrice) {
        this.routingBreakfastPrice = routingBreakfastPrice;
    }

    public String getRoutingLunchType() {
        return routingLunchType;
    }

    public void setRoutingLunchType(String routingLunchType) {
        this.routingLunchType = routingLunchType == null ? null : routingLunchType.trim();
    }

    public Double getRoutingLunchPrice() {
        return routingLunchPrice;
    }

    public void setRoutingLunchPrice(Double routingLunchPrice) {
        this.routingLunchPrice = routingLunchPrice;
    }

    public String getRoutingDinnerType() {
        return routingDinnerType;
    }

    public void setRoutingDinnerType(String routingDinnerType) {
        this.routingDinnerType = routingDinnerType == null ? null : routingDinnerType.trim();
    }

    public Double getRoutingDinnerPrice() {
        return routingDinnerPrice;
    }

    public void setRoutingDinnerPrice(Double routingDinnerPrice) {
        this.routingDinnerPrice = routingDinnerPrice;
    }

    public String getRoutingDeparture() {
        return routingDeparture;
    }

    public void setRoutingDeparture(String routingDeparture) {
        this.routingDeparture = routingDeparture == null ? null : routingDeparture.trim();
    }

    public String getRoutingArrival() {
        return routingArrival;
    }

    public void setRoutingArrival(String routingArrival) {
        this.routingArrival = routingArrival == null ? null : routingArrival.trim();
    }

    public Date getRoutingCreationTime() {
        return routingCreationTime;
    }

    public void setRoutingCreationTime(Date routingCreationTime) {
        this.routingCreationTime = routingCreationTime;
    }

    public String getRoutingCreationPeople() {
        return routingCreationPeople;
    }

    public void setRoutingCreationPeople(String routingCreationPeople) {
        this.routingCreationPeople = routingCreationPeople == null ? null : routingCreationPeople.trim();
    }

    public Date getRoutingModifyTime() {
        return routingModifyTime;
    }

    public void setRoutingModifyTime(Date routingModifyTime) {
        this.routingModifyTime = routingModifyTime;
    }

    public String getRoutingModifyPeople() {
        return routingModifyPeople;
    }

    public void setRoutingModifyPeople(String routingModifyPeople) {
        this.routingModifyPeople = routingModifyPeople == null ? null : routingModifyPeople.trim();
    }

    public String getRoutingOne() {
        return routingOne;
    }

    public void setRoutingOne(String routingOne) {
        this.routingOne = routingOne == null ? null : routingOne.trim();
    }

    public String getRoutingTwo() {
        return routingTwo;
    }

    public void setRoutingTwo(String routingTwo) {
        this.routingTwo = routingTwo == null ? null : routingTwo.trim();
    }

    public String getRoutingThree() {
        return routingThree;
    }

    public void setRoutingThree(String routingThree) {
        this.routingThree = routingThree == null ? null : routingThree.trim();
    }

    private Integer hotelId;

    private String hotelName;

    private String hotelAbbreviation;

    private String hotelType;

    private String hotelClass;

    private String hotelFax;

    private String hotelEmail;

    private String hotelPhone;

    private String hotelProvince;

    private String hotelCity;

    private String hotelCounty;

    private String hotelAddress;

    private String hotelIntroduce;

    private String hotelFacilities;

    private String hotelNotice;

    private Date hotelTime;

    private Integer hotelOwner;

    private String zhifufangshi;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getHotelAbbreviation() {
        return hotelAbbreviation;
    }

    public void setHotelAbbreviation(String hotelAbbreviation) {
        this.hotelAbbreviation = hotelAbbreviation == null ? null : hotelAbbreviation.trim();
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType == null ? null : hotelType.trim();
    }

    public String getHotelClass() {
        return hotelClass;
    }

    public void setHotelClass(String hotelClass) {
        this.hotelClass = hotelClass == null ? null : hotelClass.trim();
    }

    public String getHotelFax() {
        return hotelFax;
    }

    public void setHotelFax(String hotelFax) {
        this.hotelFax = hotelFax == null ? null : hotelFax.trim();
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail == null ? null : hotelEmail.trim();
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone == null ? null : hotelPhone.trim();
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince == null ? null : hotelProvince.trim();
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity == null ? null : hotelCity.trim();
    }

    public String getHotelCounty() {
        return hotelCounty;
    }

    public void setHotelCounty(String hotelCounty) {
        this.hotelCounty = hotelCounty == null ? null : hotelCounty.trim();
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress == null ? null : hotelAddress.trim();
    }

    public String getHotelIntroduce() {
        return hotelIntroduce;
    }

    public void setHotelIntroduce(String hotelIntroduce) {
        this.hotelIntroduce = hotelIntroduce == null ? null : hotelIntroduce.trim();
    }

    public String getHotelFacilities() {
        return hotelFacilities;
    }

    public void setHotelFacilities(String hotelFacilities) {
        this.hotelFacilities = hotelFacilities == null ? null : hotelFacilities.trim();
    }

    public String getHotelNotice() {
        return hotelNotice;
    }

    public void setHotelNotice(String hotelNotice) {
        this.hotelNotice = hotelNotice == null ? null : hotelNotice.trim();
    }

    public Date getHotelTime() {
        return hotelTime;
    }

    public void setHotelTime(Date hotelTime) {
        this.hotelTime = hotelTime;
    }

    public Integer getHotelOwner() {
        return hotelOwner;
    }

    public void setHotelOwner(Integer hotelOwner) {
        this.hotelOwner = hotelOwner;
    }

    public String getZhifufangshi() {
        return zhifufangshi;
    }

    public void setZhifufangshi(String zhifufangshi) {
        this.zhifufangshi = zhifufangshi == null ? null : zhifufangshi.trim();
    }
}