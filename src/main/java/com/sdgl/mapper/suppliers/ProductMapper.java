package com.sdgl.mapper.suppliers;


import com.sdgl.pojo.suppliers.Product;
import com.sdgl.pojo.suppliers.suppliers.Product;

import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/2 15:56
 */
public interface ProductMapper {

    /**
     * 查询所有公司信息
     * @return
     */
    List<Product> selProduct();

    /**
     * 添加公司信息
     * @param product
     * @return
     */
    int addProduct(Product product);

    /**
     * 根据id查询公司信息
     * @param id
     * @return
     */
    Product selProduct(int id);

    /**
     * 动态查询公司信息
     * @param product
     * @return
     */
    List<Product> AllProduct(Product product);
    /*int delBusFleet();*/

    /**
     * 修改信息
     * @param product
     * @return
     */
    int upProduct(Product product);


}
