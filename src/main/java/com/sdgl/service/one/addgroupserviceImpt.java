package com.sdgl.service.one;

import com.sdgl.mapper.one.addsgroupMapper;
import com.sdgl.pojo.op.P_Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class addgroupserviceImpt implements addgroupservice{

    @Autowired
    private addsgroupMapper am;

    @Override
    public int insert(P_Team pt) {
        return am.insert(pt);
    }
}
