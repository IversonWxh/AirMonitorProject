package com.msb.mapper;

import com.msb.entity.AirMonitorInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/26 12:31
 */
public interface AirMapper {
    //查询空气质量的SQL扔mapper里
    List<AirMonitorInfo> findByDistrictId(@Param("districtId") Integer districtId);
}
