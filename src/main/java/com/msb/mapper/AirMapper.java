package com.msb.mapper;

import com.msb.entity.AirMonitorInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
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
    
    //添加数据
    @Insert("insert into air_monitor_info (district_id,monitor_time,pm10,pm25,monitoring_station) values (#{districtId},#{monitorTime},#{pm10},#{pm25},#{monitoringStation})")
    Integer insert(AirMonitorInfo airMonitorInfo);
    
    //修改数据
//    @Update("update air_monitor_info set district_id = #{districtId}, monitor_time = #{monitorTime}, pm10 = #{pm10},pm25 = #{pm25}, monitoring_station = #{monitoringStation} where id = #{id}")
//    int updateById(AirMonitorInfo air);
    
    //修改数据动态Sql写在mapper里
    int updateById(AirMonitorInfo airMonitorInfo);
    
    @Delete("delete from air_monitor_info where id = #{id}")
    int deleteById(@Param("id") Integer id);
}
