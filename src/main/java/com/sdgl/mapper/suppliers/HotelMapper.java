package com.sdgl.mapper.suppliers;

import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.HotelPrice;
import com.sdgl.pojo.suppliers.Image;
import com.sdgl.pojo.suppliers.Relation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.List;
@Repository
public interface HotelMapper {
    List<Hotel> selectAllHotel(Hotel hotel);

    Hotel selectHotelById(@Param("hotel_id") Integer hotel_id);

    Integer addHotel(Hotel hotel);

    Integer addHotelImg(@Param("img") Image img, @Param("files") List<File> files);

    Integer updateHotel(Hotel hotel);

    //联系人增删改查
    Integer addHotelRelation(Relation relation);

    Integer deleteHotelRelation(Relation relation);

    Integer updateHotelRelation(Relation relation);

    List<Relation> selectHotelRelation(Relation relation);

    //联系人增删改查
    Integer addHotelPrice(HotelPrice hotelPrice);

    Integer deleteHotelPrice(HotelPrice hotelPrice);

    Integer updateHotelPrice(HotelPrice hotelPrice);

    List<HotelPrice> selectHotelPrice(HotelPrice hotelPrice);
}
