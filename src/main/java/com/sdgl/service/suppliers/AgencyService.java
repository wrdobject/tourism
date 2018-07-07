package com.sdgl.service.suppliers;


import com.sdgl.pojo.suppliers.Agency;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:23
 */
public interface AgencyService{
    /**
     * 查询所有公司信息
     * @return
     */
    List<Agency> selAgency();

    /**
     * 添加公司信息
     * @param agency
     * @return
     */
    int addAgency(Agency agency);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Agency selAgency(int id);

    /**
     * 动态查询公司信息
     * @param agency
     * @return
     */
    List<Agency> AllTicketing(Agency agency);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param agency
     * @return
     */
    int upTicketing(Agency agency);


}
