package com.sdgl.controller.suppliersfei;

import com.sdgl.mapper.suppliersfei.TicketsMapper;
import com.sdgl.pojo.suppliersfei.Images;
import com.sdgl.pojo.suppliersfei.TicketExample;
import com.sdgl.pojo.suppliersfei.Tickets;
import com.sdgl.service.suppliersfei.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;

@RestController
public class ImagesController {

    @Autowired
    private ImagesService imagesService;

    @Autowired
    private TicketsMapper ticketsMapper;

    @PostMapping("/relationuploadimg")
    public int relationuploadimg(@RequestParam(value ="image") MultipartFile multipartFile, HttpServletRequest request){
        Images images = new Images();
        if(!multipartFile.isEmpty()){

            String url = ClassUtils.getDefaultClassLoader().getResource("static/img").getPath();
            String name = multipartFile.getOriginalFilename();
            File file = new File(url,name);
            try {
                multipartFile.transferTo(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            images.setImgPath(name);
            images.setImgTime(new Date());
            images.setSupplierType(4);
            int id = ticketsMapper.selectMaxId();
            images.setOtherId(id+1);
            images.setImgType(1);
        }
        return imagesService.relationuploadimg(images);
    }

    @PostMapping("/selectImgByOtherId")
    public List<Images> selectImgByOtherId(Integer otherId){

        List<Images> list = imagesService.selectImgByOtherId(otherId);
        return list;
    }

}
