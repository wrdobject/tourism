package com.sdgl.mapper.suppliers;

import com.sdgl.pojo.suppliers.Restaurant;
import com.sdgl.pojo.suppliers.suppliers.Restaurant;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:57
 */
public interface RestaurantMapper {

    /**
     * 查询所有公司信息
     * @return
     */
    List<Restaurant> selRestaurant();

    /**
     * 添加公司信息
     * @param restaurant
     * @return
     */
    int addRestaurant(Restaurant restaurant);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Restaurant selRestaurant(int id);

    /**
     * 动态查询公司信息
     * @param restaurant
     * @return
     */
    List<Restaurant> AllRestaurant(Restaurant restaurant);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param restaurant
     * @return
     */
    int upRestaurant(Restaurant restaurant);


}
