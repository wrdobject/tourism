package com.sdgl.service.suppliers;

import com.sdgl.mapper.suppliers.BusFleetMapper;
import com.sdgl.pojo.suppliers.BusFleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 乔紫阳
 * @Description:
 * @Date: 2018/7/3 14:28
 */

@Service
public class BusFleetServiceImpl implements BusFleetService {

    @Resource
    private BusFleetMapper busFleetMapper;


    @Override
    public List<BusFleet> selBusFleet() {
        return null;
    }

    @Override
    public int addBusFleet(BusFleet busFleet) {
        return 0;
    }

    @Override
    public BusFleet selBusFleet(int id) {
        return null;
    }

    @Override
    public List<BusFleet> AllBusFleet(BusFleet busFleet) {
        return null;
    }

    @Override
    public int upBusFleet(BusFleet busFleet) {
        return 0;
    }
}
