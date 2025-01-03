package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;
import com.example.demo.entity.City;

/**
 * @author arwen
 */
@Mapper
public interface CityMapper {

  @Select("SELECT * FROM CITY WHERE state = #{state}")
  City findByState(@Param("state") String state);

}