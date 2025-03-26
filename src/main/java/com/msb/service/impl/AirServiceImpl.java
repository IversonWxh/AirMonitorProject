package com.msb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.entity.AirMonitorInfo;
import com.msb.entity.District;
import com.msb.mapper.AirMapper;
import com.msb.mapper.DistrictMapper;
import com.msb.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 18:31
 */
@Service
public class AirServiceImpl implements AirService {
    @Autowired
    private DistrictMapper districtMapper;
    
    @Autowired
    private AirMapper airMapper;
    
    @Override
    public List<District> findDistrictList() {
        List<District> districtList = districtMapper.findAll();
        return districtList;
    }
    
    @Override
    public PageInfo findAirByDistrictIdAndPage(Integer page, Integer size, Integer districtId) {
        //1.分页
        PageHelper.startPage(page, size);
        //2.查询
        List<AirMonitorInfo> airList = airMapper.findByDistrictId(districtId);
        //3.封装pageInfo
        PageInfo pageInfo = new PageInfo(airList);
        //4.返回
        return pageInfo;
    }
}
