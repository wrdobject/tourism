package com.sdgl.service.suppliers;

import com.sdgl.pojo.suppliers.suppliers.Commission;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:31
 */
public interface CommissionService {

        /**
         * 查询所有公司信息
         * @return
         */
        List<Commission> selCommission();

        /**
         * 添加公司信息
         * @param commission
         * @return
         */
        int addCommission(Commission commission);

        /**
         * 根据id查询公司信息
         * @param id
         * @return
         */
        Commission selCommission(int id);

        /**
         * 动态查询公司信息
         * @param commission
         * @return
         */
        List<Commission> AllCommission(Commission commission);
        /*int delBusFleet();*/

        /**
         * 修改信息
         * @param commission
         * @return
         */
        int upCommission(Commission commission);

    }
