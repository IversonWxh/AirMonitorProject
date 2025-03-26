package com.msb.service;

import com.github.pagehelper.PageInfo;
import com.msb.entity.District;

import java.util.List;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 18:31
 */
public interface AirService {
    /**
     * 查询区域表的全部信息
     *
     * @return
     */
    List<District> findDistrictList();
    
    /**
     * 分页&条件查询空气质量信息
     *
     * @param page
     * @param size
     * @param districtId
     * @return
     */
    PageInfo findAirByDistrictIdAndPage(Integer page, Integer size, Integer districtId);
}
