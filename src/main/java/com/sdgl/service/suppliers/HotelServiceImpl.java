package com.sdgl.service.suppliers;

import com.sdgl.mapper.suppliers.HotelMapper;
import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.HotelPrice;
import com.sdgl.pojo.suppliers.Image;
import com.sdgl.pojo.suppliers.Relation;
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

    @Override
    public Integer updateHotel(Hotel hotel) {
        return hotelMapper.updateHotel(hotel);
    }

    @Override
    public Integer addHotelRelation(Relation relation) {
        return hotelMapper.addHotelRelation(relation);
    }

    @Override
    public Integer deleteHotelRelation(Relation relation) {
        return hotelMapper.deleteHotelRelation(relation);
    }

    @Override
    public Integer updateHotelRelation(Relation relation) {
        return hotelMapper.updateHotelRelation(relation);
    }

    @Override
    public List<Relation> selectHotelRelation(Relation relation) {
        return hotelMapper.selectHotelRelation(relation);
    }

    @Override
    public Integer addHotelPrice(HotelPrice hotelPrice) {
        return hotelMapper.addHotelPrice(hotelPrice);
    }

    @Override
    public Integer deleteHotelPrice(HotelPrice hotelPrice) {
        return hotelMapper.deleteHotelPrice(hotelPrice);
    }

    @Override
    public Integer updateHotelPrice(HotelPrice hotelPrice) {
        return hotelMapper.updateHotelPrice(hotelPrice);
    }

    @Override
    public List<HotelPrice> selectHotelPrice(HotelPrice hotelPrice) {
        return hotelMapper.selectHotelPrice(hotelPrice);
    }
}
