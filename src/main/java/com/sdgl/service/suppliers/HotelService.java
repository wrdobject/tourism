package com.sdgl.service.suppliers;

import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.HotelPrice;
import com.sdgl.pojo.suppliers.Image;
import com.sdgl.pojo.suppliers.Relation;
import com.sdgl.pojo.suppliersfei.Images;

import java.io.File;
import java.util.List;

public interface HotelService {
    List<Hotel> selectAllHotel(Hotel hotel);

    Hotel selectHotelById(Integer hotel_id);

    Integer addHotel(Hotel hotel);

    Integer updateHotel(Hotel hotel);

    Integer addHotelRelation(Relation relation);

    Integer deleteHotelRelation(Relation relation);

    Integer updateHotelRelation(Relation relation);

    List<Relation> selectHotelRelation(Relation relation);

    Integer addHotelPrice(HotelPrice hotelPrice);

    Integer deleteHotelPrice(HotelPrice hotelPrice);

    Integer updateHotelPrice(HotelPrice hotelPrice);

    List<HotelPrice> selectHotelPrice(HotelPrice hotelPrice);

    Integer selectMaxHotelId();

    int addHotelImg(Images images);
}
