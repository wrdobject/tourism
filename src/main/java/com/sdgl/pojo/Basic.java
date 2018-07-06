package com.sdgl.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Basic
 *
 * 基本信息表
 */
public class Basic implements Serializable {
    private Integer basic_id;           //线路id
    private String basic_num;          //线路编号
    private String basic_name;          //线路名称
    private String basic_fountain;      //客源地
    private Integer basic_days;         //行程天数
    private Date basic_creation_time;   //创建时间
    private String basic_creation_people;//创建人
    private Date basic_modify_time;     //修改时间
    private String basic_modify_people; //修改人
    private String basic_one;           //冗余字段
    private String basic_two;           //冗余字段
    private String basic_three;           //冗余字段

    public Integer getBasic_id() {
        return basic_id;
    }

    public void setBasic_id(Integer basic_id) {
        this.basic_id = basic_id;
    }

    public String getBasic_num() {
        return basic_num;
    }

    public void setBasic_num(String basic_num) {
        this.basic_num = basic_num;
    }

    public String getBasic_name() {
        return basic_name;
    }

    public void setBasic_name(String basic_name) {
        this.basic_name = basic_name;
    }

    public String getBasic_fountain() {
        return basic_fountain;
    }

    public void setBasic_fountain(String basic_fountain) {
        this.basic_fountain = basic_fountain;
    }

    public Integer getBasic_days() {
        return basic_days;
    }

    public void setBasic_days(Integer basic_days) {
        this.basic_days = basic_days;
    }

    public Date getBasic_creation_time() {
        return basic_creation_time;
    }

    public void setBasic_creation_time(Date basic_creation_time) {
        this.basic_creation_time = basic_creation_time;
    }

    public String getBasic_creation_people() {
        return basic_creation_people;
    }

    public void setBasic_creation_people(String basic_creation_people) {
        this.basic_creation_people = basic_creation_people;
    }

    public Date getBasic_modify_time() {
        return basic_modify_time;
    }

    public void setBasic_modify_time(Date basic_modify_time) {
        this.basic_modify_time = basic_modify_time;
    }

    public String getBasic_modify_people() {
        return basic_modify_people;
    }

    public void setBasic_modify_people(String basic_modify_people) {
        this.basic_modify_people = basic_modify_people;
    }

    public String getBasic_one() {
        return basic_one;
    }

    public void setBasic_one(String basic_one) {
        this.basic_one = basic_one;
    }

    public String getBasic_two() {
        return basic_two;
    }

    public void setBasic_two(String basic_two) {
        this.basic_two = basic_two;
    }

    public String getBasic_three() {
        return basic_three;
    }

    public void setBasic_three(String basic_three) {
        this.basic_three = basic_three;
    }
}
