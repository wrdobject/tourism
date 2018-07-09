package com.sdgl.service.offersline;

import com.sdgl.pojo.offersline.Basic;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * 线路页面
 */
public interface OffersLineService {
    //查询全部
    List<Basic> selectBasic(String basic_name,  String basic_num, Integer basic_days);
}
