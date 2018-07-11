package com.sdgl.pojo.op;

import java.util.Date;

/**
 * 团队信息表
 */
public class P_Team {
    private Integer p_team_id;//id主键
    private Integer p_num_people;//人数
    private Date p_hair_date;//发团日期
    private Integer p_op_id;//计调id
    private Integer p_tourist_id;//导游id
    private String p_travel;//行程内容
    private String p_control;//总控id
    private String p_State;//状态
    private Double p_total;//总价
    private Integer p_Number;//人数
    private Date p_send_date;//送团时间（送机航班信息
    private Double p_pickup_price;//接机机票价格
    private Double p_drop_price;//送机机票价格
    private Date p_meet_date;//接团时间（接机航班信息）
    private Integer p_guide_phone;//全陪电话
    private String p_guide;//全陪(姓名)
    private String p_null1;//空1
    private String p_null2;//空2
    private String p_null3;//空3


    public Integer getP_team_id() {
        return p_team_id;
    }

    public void setP_team_id(Integer p_team_id) {
        this.p_team_id = p_team_id;
    }

    public Integer getP_num_people() {
        return p_num_people;
    }

    public void setP_num_people(Integer p_num_people) {
        this.p_num_people = p_num_people;
    }

    public Date getP_hair_date() {
        return p_hair_date;
    }

    public void setP_hair_date(Date p_hair_date) {
        this.p_hair_date = p_hair_date;
    }

    public Integer getP_op_id() {
        return p_op_id;
    }

    public void setP_op_id(Integer p_op_id) {
        this.p_op_id = p_op_id;
    }

    public Integer getP_tourist_id() {
        return p_tourist_id;
    }

    public void setP_tourist_id(Integer p_tourist_id) {
        this.p_tourist_id = p_tourist_id;
    }

    public String getP_travel() {
        return p_travel;
    }

    public void setP_travel(String p_travel) {
        this.p_travel = p_travel;
    }

    public String getP_control() {
        return p_control;
    }

    public void setP_control(String p_control) {
        this.p_control = p_control;
    }

    public String getP_State() {
        return p_State;
    }

    public void setP_State(String p_State) {
        this.p_State = p_State;
    }

    public Double getP_total() {
        return p_total;
    }

    public void setP_total(Double p_total) {
        this.p_total = p_total;
    }

    public Integer getP_Number() {
        return p_Number;
    }

    public void setP_Number(Integer p_Number) {
        this.p_Number = p_Number;
    }

    public Date getP_send_date() {
        return p_send_date;
    }

    public void setP_send_date(Date p_send_date) {
        this.p_send_date = p_send_date;
    }

    public Double getP_pickup_price() {
        return p_pickup_price;
    }

    public void setP_pickup_price(Double p_pickup_price) {
        this.p_pickup_price = p_pickup_price;
    }

    public Double getP_drop_price() {
        return p_drop_price;
    }

    public void setP_drop_price(Double p_drop_price) {
        this.p_drop_price = p_drop_price;
    }

    public Date getP_meet_date() {
        return p_meet_date;
    }

    public void setP_meet_date(Date p_meet_date) {
        this.p_meet_date = p_meet_date;
    }

    public Integer getP_guide_phone() {
        return p_guide_phone;
    }

    public void setP_guide_phone(Integer p_guide_phone) {
        this.p_guide_phone = p_guide_phone;
    }

    public String getP_guide() {
        return p_guide;
    }

    public void setP_guide(String p_guide) {
        this.p_guide = p_guide;
    }

    public String getP_null1() {
        return p_null1;
    }

    public void setP_null1(String p_null1) {
        this.p_null1 = p_null1;
    }

    public String getP_null2() {
        return p_null2;
    }

    public void setP_null2(String p_null2) {
        this.p_null2 = p_null2;
    }

    public String getP_null3() {
        return p_null3;
    }

    public void setP_null3(String p_null3) {
        this.p_null3 = p_null3;
    }

    @Override
    public String toString() {
        return "P_Team{" +
                "p_team_id=" + p_team_id +
                ", p_num_people=" + p_num_people +
                ", p_hair_date=" + p_hair_date +
                ", p_op_id=" + p_op_id +
                ", p_tourist_id=" + p_tourist_id +
                ", p_travel='" + p_travel + '\'' +
                ", p_control='" + p_control + '\'' +
                ", p_State='" + p_State + '\'' +
                ", p_total=" + p_total +
                ", p_Number=" + p_Number +
                ", p_send_date=" + p_send_date +
                ", p_pickup_price=" + p_pickup_price +
                ", p_drop_price=" + p_drop_price +
                ", p_meet_date=" + p_meet_date +
                ", p_guide_phone=" + p_guide_phone +
                ", p_guide='" + p_guide + '\'' +
                ", p_null1='" + p_null1 + '\'' +
                ", p_null2='" + p_null2 + '\'' +
                ", p_null3='" + p_null3 + '\'' +
                '}';
    }
}
