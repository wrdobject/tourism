package com.sdgl.service.suppliers;

import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.Image;

import java.io.File;
import java.util.List;

public interface HotelService {
    List<Hotel> selectAllHotel(Hotel hotel);

    Hotel selectHotelById(Integer hotel_id);

    Integer addHotel(Hotel hotel);

    Integer addHotelImg(Image img, List<File> files);
}
