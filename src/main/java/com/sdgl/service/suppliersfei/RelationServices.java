package com.sdgl.service.suppliersfei;

import com.sdgl.pojo.suppliersfei.Relations;

public interface RelationServices {

    int updaterelationbyid(Relations relations);

    int deletebyrelaid(Relations relations);

    int insertrelation(Relations relations);
}
