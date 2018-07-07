package com.sdgl.service.suppliersfei;

import com.sdgl.mapper.suppliersfei.RelationMapper;
import com.sdgl.pojo.suppliersfei.Relations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationServicesImpl implements RelationServices {

    @Autowired
    private RelationMapper relationMapper;
    @Override
    public int updaterelationbyid(Relations relations) {
        return relationMapper.updateByPrimaryKeySelective(relations);
    }

    @Override
    public int deletebyrelaid(Relations relations) {
        return relationMapper.deleteByPrimaryKey(relations);
    }

    @Override
    public int insertrelation(Relations relations) {
        return relationMapper.insert(relations);
    }
}
