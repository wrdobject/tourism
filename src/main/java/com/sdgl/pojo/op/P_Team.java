package com.sdgl.pojo.op;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 团队信息表
 */
@Data
public class P_Team {
    private Integer p_team_id;//id主键
    private Integer num_people;//人数
    private Date hair_date;//发团日期
    private Integer op_id;//计调id
    private Integer tourist_id;//导游id
    private String q_travel;//行程内容
    private String q_tuanid;//对方团号
    private Integer q_State;//状态
    private String q_total;//总价
    private Integer jietuanxinxi;//接团航班信息
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date send_date;//送团时间
    private Double pickup_price;//接机机票价格
    private Double drop_price;//送机机票价格
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date jietuan_date;//接团时间
    private String jietuandidian;//接团地点
    private String songtuandidian;//送团地点
    private Integer sotuanxinxi;//送团航班信息
    private String Jietuancheci;//接团车次号
    private String songtuancheci;//送团车次号
    private Integer Che_id;//车队id
    private Integer Canting_id;//餐厅id
    private Integer xianluid;//线路id
    private String q_wtuanid;//空1
    private String jietuanbeizhu;//接团备注
    private String songtuanbeizhu;//送团备注


}