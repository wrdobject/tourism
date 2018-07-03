package com.sdgl.mapper.suppliers;



import com.sdgl.pojo.suppliers.Meals;
import com.sdgl.pojo.suppliers.suppliers.Meals;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:56
 */
public interface MealsMapper {

    /**
     * 查询所有公司信息
     * @return
     */
    List<Meals> selMeals();

    /**
     * 添加公司信息
     * @param meals
     * @return
     */
    int addMeals(Meals meals);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Meals selMeals(int id);

    /**
     * 动态查询公司信息
     * @param Meals
     * @return
     */
    List<Meals> AllMeals(Meals meals);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param Meals
     * @return
     */
    int upMeals(Meals meals);


}
