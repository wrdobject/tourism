package com.sdgl.service.suppliersfei;

import com.sdgl.mapper.suppliersfei.ImageMapper;
import com.sdgl.pojo.suppliersfei.ImageExample;
import com.sdgl.pojo.suppliersfei.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagesServiceImpl implements ImagesService {

    @Autowired
    private ImageMapper imageMapper;
    @Override
    public int relationuploadimg(Images images) {
        return imageMapper.insert(images);
    }

    @Override
    public List<Images> selectImgByOtherId(Integer otherId) {
        ImageExample imageExample = new ImageExample();
        ImageExample.Criteria criteria = imageExample.createCriteria();
        criteria.andOtherIdEqualTo(otherId);
        criteria.andSupplierTypeEqualTo(4);
        return imageMapper.selectByExample(imageExample);
    }
}
