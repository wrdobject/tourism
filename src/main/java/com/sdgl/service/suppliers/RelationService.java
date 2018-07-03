package com.sdgl.service.suppliers;


import com.sdgl.pojo.suppliers.suppliers.Relation;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 16:01
 */
public interface RelationService {
    /**
     * 查询所有公司信息
     * @return
     */
    List<Relation> selRelation();

    /**
     * 添加公司信息
     * @param relation
     * @return
     */
    int addTicketing(Relation relation);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Relation selRelation(int id);

    /**
     * 动态查询公司信息
     * @param relation
     * @return
     */
    List<Relation> AllRelation(Relation relation);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param relation
     * @return
     */
    int upRelation(Relation relation);


}
