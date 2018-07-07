package com.sdgl.pojo.suppliersfei;

public class AllTickets extends Tickets {
    private Integer relationType;

    private Integer relationOwner;

    private String relationName;

    private String relationPhone;

    private String relationEmail;

    public Integer getRelationType() {
        return relationType;
    }

    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public Integer getRelationOwner() {
        return relationOwner;
    }

    public void setRelationOwner(Integer relationOwner) {
        this.relationOwner = relationOwner;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
    }

    public String getRelationPhone() {
        return relationPhone;
    }

    public void setRelationPhone(String relationPhone) {
        this.relationPhone = relationPhone == null ? null : relationPhone.trim();
    }

    public String getRelationEmail() {
        return relationEmail;
    }

    public void setRelationEmail(String relationEmail) {
        this.relationEmail = relationEmail == null ? null : relationEmail.trim();
    }

    private Integer relationId;

    private Integer relationTypeId;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getRelationTypeId() {
        return relationTypeId;
    }

    public void setRelationTypeId(Integer relationTypeId) {
        this.relationTypeId = relationTypeId;
    }


    private Integer ticketFareId;

    private Integer ticketId;

    private Integer ticketFareType;

    private Double ticketFareCostedPay;

    private Double ticketFareListedPay;

    private Integer ticketFareOwner;

    public Integer getTicketFareId() {
        return ticketFareId;
    }

    public void setTicketFareId(Integer ticketFareId) {
        this.ticketFareId = ticketFareId;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getTicketFareType() {
        return ticketFareType;
    }

    public void setTicketFareType(Integer ticketFareType) {
        this.ticketFareType = ticketFareType;
    }

    public Double getTicketFareCostedPay() {
        return ticketFareCostedPay;
    }

    public void setTicketFareCostedPay(Double ticketFareCostedPay) {
        this.ticketFareCostedPay = ticketFareCostedPay;
    }

    public Double getTicketFareListedPay() {
        return ticketFareListedPay;
    }

    public void setTicketFareListedPay(Double ticketFareListedPay) {
        this.ticketFareListedPay = ticketFareListedPay;
    }

    public Integer getTicketFareOwner() {
        return ticketFareOwner;
    }

    public void setTicketFareOwner(Integer ticketFareOwner) {
        this.ticketFareOwner = ticketFareOwner;
    }
}
