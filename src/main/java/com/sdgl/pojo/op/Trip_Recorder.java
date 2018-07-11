package com.sdgl.pojo.op;

import javax.xml.crypto.Data;

/**
 *  行程记录表
 */
@lombok.Data
public class Trip_Recorder {

    private Integer t_id; //Id主键
    private Integer q_dao_id; //导游id
    private Data num_day; //带团天数（记录第几天）
    private Data time; //时间
    private  String incident; //事件（在做什么事情：比如吃早饭或者是在逛景点或者是坐车）
    private  String t_site; //地点（比如饭店在哪里或者景点在哪里）
    private  String  t_type; //类型（比如吃的什么类型的饭 或者玩的什么景点）
    private  double expence; //花销（消费）
    private  String null1;
    private  String null2;
    private  String null3;
    private  String remark; //备注

    @Override
    public String toString() {
        return "Trip_Recorder{" +
                "t_id=" + t_id +
                ", q_dao_id=" + q_dao_id +
                ", num_day=" + num_day +
                ", time=" + time +
                ", incident='" + incident + '\'' +
                ", t_site='" + t_site + '\'' +
                ", t_type='" + t_type + '\'' +
                ", expence=" + expence +
                ", null1='" + null1 + '\'' +
                ", null2='" + null2 + '\'' +
                ", null3='" + null3 + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
