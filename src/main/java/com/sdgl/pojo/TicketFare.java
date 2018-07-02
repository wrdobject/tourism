package com.sdgl.pojo;

public class TicketFare {
    private Integer ticket_fare_id;
    private Integer ticket_id;
    private double ticket_fare_type;
    private double ticket_fare_costed_pay;
    private double ticket_fare_listed_pay;
    private Integer ticket_fare_owner;

    public TicketFare() {
    }

    public TicketFare(Integer ticket_fare_id, Integer ticket_id, double ticket_fare_type, double ticket_fare_costed_pay, double ticket_fare_listed_pay, Integer ticket_fare_owner) {
        this.ticket_fare_id = ticket_fare_id;
        this.ticket_id = ticket_id;
        this.ticket_fare_type = ticket_fare_type;
        this.ticket_fare_costed_pay = ticket_fare_costed_pay;
        this.ticket_fare_listed_pay = ticket_fare_listed_pay;
        this.ticket_fare_owner = ticket_fare_owner;
    }

    public Integer getTicket_fare_id() {
        return ticket_fare_id;
    }

    public void setTicket_fare_id(Integer ticket_fare_id) {
        this.ticket_fare_id = ticket_fare_id;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public double getTicket_fare_type() {
        return ticket_fare_type;
    }

    public void setTicket_fare_type(double ticket_fare_type) {
        this.ticket_fare_type = ticket_fare_type;
    }

    public double getTicket_fare_costed_pay() {
        return ticket_fare_costed_pay;
    }

    public void setTicket_fare_costed_pay(double ticket_fare_costed_pay) {
        this.ticket_fare_costed_pay = ticket_fare_costed_pay;
    }

    public double getTicket_fare_listed_pay() {
        return ticket_fare_listed_pay;
    }

    public void setTicket_fare_listed_pay(double ticket_fare_listed_pay) {
        this.ticket_fare_listed_pay = ticket_fare_listed_pay;
    }

    public Integer getTicket_fare_owner() {
        return ticket_fare_owner;
    }

    public void setTicket_fare_owner(Integer ticket_fare_owner) {
        this.ticket_fare_owner = ticket_fare_owner;
    }
}
