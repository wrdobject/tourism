package com.sdgl.mapper.suppliers;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:31
 */
public interface CommissionMapper {

        /**
         * 查询所有公司信息
         * @return
         */
        List<CommissionMapper> selCommission();

        /**
         * 添加公司信息
         * @param commission
         * @return
         */
        int addCommission(CommissionMapper commission);

        /**
         * 根据id查询公司信息
         * @param id
         * @return
         */
        CommissionMapper selCommission(int id);

        /**
         * 动态查询公司信息
         * @param commission
         * @return
         */
        List<CommissionMapper> AllCommission(CommissionMapper commission);
        /*int delBusFleet();*/

        /**
         * 修改信息
         * @param commission
         * @return
         */
        int upCommission(CommissionMapper commission);

    }
