package com.sdgl.service.offersline;

import com.sdgl.mapper.offersline.OffersLineMapper;
import com.sdgl.pojo.offersline.Basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffersLineServiceImpl implements OffersLineService {

    @Autowired
    private OffersLineMapper offersLineMapper;

    /**
     *              查询全部
     *
     * @param basic_name     线路名称
     * @param basic_num     线路编号
     * @param basic_days    行程天数
     * @return
     */
    @Override
    public List<Basic> selectBasic(String basic_name, String basic_num, Integer basic_days) {
            List<Basic> lb=offersLineMapper.selectBasic(basic_name,basic_num,basic_days);
        return lb;
    }
}
