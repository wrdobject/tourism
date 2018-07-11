package com.sdgl.pojo.op;

import lombok.Data;

import java.util.Date;

/**
 * 餐厅记录表
 */
@Data
public class Res_Table {

    private Integer id;
    private String res_name; //餐厅名称
    private String res_type; //餐厅类型
    private String res_category; //类别
    private Date res_date; //用餐日期
    private  double unitprice; //单价
    private Integer number; //人数
    private  double money; //金额/总价
    private  String frequency; //用餐次数

    @Override
    public String toString() {
        return "Res_Table{" +
                "id=" + id +
                ", res_name='" + res_name + '\'' +
                ", res_type='" + res_type + '\'' +
                ", res_category='" + res_category + '\'' +
                ", res_date=" + res_date +
                ", unitprice=" + unitprice +
                ", number=" + number +
                ", money=" + money +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
