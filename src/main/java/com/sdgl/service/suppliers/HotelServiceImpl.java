package com.sdgl.service.suppliers;

import com.sdgl.mapper.suppliers.HotelMapper;
import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.Image;
import com.sdgl.service.suppliers.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelMapper hotelMapper;
    @Override
    public List<Hotel> selectAllHotel(Hotel hotel) {
        return hotelMapper.selectAllHotel(hotel);
    }

    @Override
    public Hotel selectHotelById(Integer hotel_id) {
        return hotelMapper.selectHotelById(hotel_id);
    }

    @Override
    public Integer addHotel(Hotel hotel) {
        return hotelMapper.addHotel(hotel);
    }

    @Override
    public Integer addHotelImg(Image img, List<File> files) {
        return hotelMapper.addHotelImg(img,files);
    }
}
