package com.sdgl.pojo.op;

import lombok.Data;

/**
 * 游客表
 */
@Data
public class P_Tourist {

    private Integer id; //id主键
    private String p_name;//姓名
    private Integer p_r_id;//团队号
    private String p_type;//游客类型
    private String p_phone;//电话号
    private String p_number;//证件号
    private Integer p_cer_type;//证件类型
    private String p_sex;//性别

    @Override
    public String toString() {
        return "P_Tourist{" +
                "id=" + id +
                ", p_name='" + p_name + '\'' +
                ", p_r_id=" + p_r_id +
                ", p_type='" + p_type + '\'' +
                ", p_phone='" + p_phone + '\'' +
                ", p_number='" + p_number + '\'' +
                ", p_cer_type=" + p_cer_type +
                ", p_sex='" + p_sex + '\'' +
                '}';
    }
}
