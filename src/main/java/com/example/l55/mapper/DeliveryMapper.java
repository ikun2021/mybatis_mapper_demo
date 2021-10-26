package com.example.l55.mapper;

import com.example.l55.model.Delivery;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DeliveryMapper {
    @Select("select * from delivery where id=#{id}")
    Delivery findDelivery(Integer id);

    @Insert("insert into delivery(order,time) values(#{order},#{time})")
    @Options(useGeneratedKeys = true,keyProperty = "id"
    )
    Integer insert(Delivery delivery);

    @Delete("delete from delivery where id=#{id}")
    int delete(Integer id);
}
