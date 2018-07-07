package com.sdgl.mapper.suppliersfei;

import com.sdgl.pojo.suppliersfei.TicketFares;
import com.sdgl.pojo.suppliersfei.TicketFareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketFareMapper {
    int countByExample(TicketFareExample example);

    int deleteByExample(TicketFareExample example);

    int deleteByPrimaryKey(Integer ticketFareId);

    int insert(TicketFares record);

    int insertSelective(TicketFares record);

    List<TicketFares> selectByExample(TicketFareExample example);

    TicketFares selectByPrimaryKey(Integer ticketFareId);

    int updateByExampleSelective(@Param("record") TicketFares record, @Param("example") TicketFareExample example);

    int updateByExample(@Param("record") TicketFares record, @Param("example") TicketFareExample example);

    int updateByPrimaryKeySelective(TicketFares record);

    int updateByPrimaryKey(TicketFares record);
}