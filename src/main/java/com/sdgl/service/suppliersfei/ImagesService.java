package com.sdgl.service.suppliersfei;

import com.sdgl.pojo.suppliersfei.Images;

import java.util.List;

public interface ImagesService {

    int relationuploadimg(Images images);

    List<Images> selectImgByOtherId(Integer otherId);
}
