package com.sdgl.mapper.suppliers;

import com.sdgl.pojo.suppliers.Hotel;
import com.sdgl.pojo.suppliers.Image;
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
}
