package com.msb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.DTO.AirAddDTO;
import com.msb.DTO.AirUpdateDTO;
import com.msb.entity.AirMonitorInfo;
import com.msb.entity.District;
import com.msb.mapper.AirMapper;
import com.msb.mapper.DistrictMapper;
import com.msb.service.AirService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    
    
    @Override
    @Transactional
    public void add(AirAddDTO airAddDTO) {
        //1.封装数据
        AirMonitorInfo airMonitorInfo = new AirMonitorInfo();
        BeanUtils.copyProperties(airAddDTO, airMonitorInfo);
        
        //2.添加数据
        Integer count = airMapper.insert(airMonitorInfo);
        
        //3.判断count
        if (count != 1) {
            System.out.println("【添加空气质量】 添加失败！");
            throw new RuntimeException("【添加空气质量】 添加失败！");
        }
        
    }
    
    @Override
    @Transactional
    public void updateById(AirUpdateDTO airUpdateDTO) {
        //封装数据
        AirMonitorInfo airMonitorInfo = new AirMonitorInfo();
        BeanUtils.copyProperties(airUpdateDTO, airMonitorInfo);
        
        //1.修改数据
        int count = airMapper.updateById(airMonitorInfo);
        
        //2.不成功，处理异常
        if (count != 1) {
            System.out.println("【修改空气质量】 修改失败！");
            throw new RuntimeException("【修改空气质量】 修改失败！");
        }
    }
    
    @Override
    @Transactional
    public void deleteById(Integer id) {
        int count = airMapper.deleteById(id);
        if (count != 1) {
            System.out.println("【删除空气质量】 删除失败！");
            throw new RuntimeException("【删除空气质量】 删除失败！");
        }
    }
}
