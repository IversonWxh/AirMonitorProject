package com.msb.service.impl;

import com.msb.entity.District;
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
    
    @Override
    public List<District> findDistrictList() {
        List<District> districtList = districtMapper.findAll();
        return districtList;
    }
}
