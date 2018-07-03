package com.sdgl.mapper.suppliers;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:23
 */
public interface AgencyMapper {
    /**
     * 查询所有公司信息
     * @return
     */
    List<AgencyMapper> selAgency();

    /**
     * 添加公司信息
     * @param agency
     * @return
     */
    int addAgency(AgencyMapper agency);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    AgencyMapper selAgency(int id);

    /**
     * 动态查询公司信息
     * @param agency
     * @return
     */
    List<AgencyMapper> AllTicketing(AgencyMapper agency);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param agency
     * @return
     */
    int upTicketing(AgencyMapper agency);


}
