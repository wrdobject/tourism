package com.sdgl.mapper.suppliersfei;

import com.sdgl.pojo.suppliersfei.AllTickets;
import com.sdgl.pojo.suppliersfei.Tickets;
import com.sdgl.pojo.suppliersfei.TicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsMapper {
    int countByExample(TicketExample example);

    int deleteByExample(TicketExample example);

    int deleteByPrimaryKey(Integer ticketId);

    int insert(Tickets record);

    int insertSelective(Tickets record);

    List<Tickets> selectByExample(TicketExample example);

    Tickets selectByPrimaryKey(Integer ticketId);

    int updateByExampleSelective(@Param("record") Tickets record, @Param("example") TicketExample example);

    int updateByExample(@Param("record") Tickets record, @Param("example") TicketExample example);

    int updateByPrimaryKeySelective(Tickets record);

    int updateByPrimaryKey(Tickets record);

    List<AllTickets> selectAllTickets(Tickets tickets);

    int selectMaxId();
}