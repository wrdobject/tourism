package com.sdgl.pojo.op;

import lombok.Data;

import java.util.Date;

/**
 * 日历表
 */
@Data
public class P_Calendar {
    private Integer p_id;//id主键
    private Integer p_dao_id;//导游id
    private String p_day;//带团天数
    private Date p_c_time;//时间
    private Integer p_state;//状态

    @Override
    public String toString() {
        return "P_Calendar{" +
                "p_id=" + p_id +
                ", p_dao_id=" + p_dao_id +
                ", p_day='" + p_day + '\'' +
                ", p_c_time=" + p_c_time +
                ", p_state=" + p_state +
                '}';
    }
}
