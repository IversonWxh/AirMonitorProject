package com.msb.mapper;

import com.msb.entity.District;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 18:39
 */
public interface DistrictMapper {
    
    @Select("select * from district")
    List<District> findAll();
}
