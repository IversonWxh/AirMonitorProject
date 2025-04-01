package com.msb.service;


import com.github.pagehelper.PageInfo;
import com.msb.DTO.AirAddDTO;
import com.msb.DTO.AirUpdateDTO;
import com.msb.entity.District;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirServiceTest {
    
    @Autowired
    private AirService airService;
    
    @Test
    public void findDistrictList() {
        List<District> districtList = airService.findDistrictList();
        System.out.println(districtList);
    }
    
    @Test
    public void findAirByDistrictIdAndPage() {
        PageInfo pageInfo = airService.findAirByDistrictIdAndPage(1, 4, null);
        List list = pageInfo.getList();
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("pageInfo.getTotal() = " + pageInfo.getTotal());
        System.out.println("pageInfo.getPages() = " + pageInfo.getPages());
    }
    
    @Test
    @Transactional
    public void add() {
        AirAddDTO airAddDTO = new AirAddDTO();
        airAddDTO.setDistrictId(1);
        airAddDTO.setMonitorTime(new Date());
        airAddDTO.setPm10(10);
        airAddDTO.setPm25(25);
        airAddDTO.setMonitoringStation("上海检测站!!!！");
        airService.add(airAddDTO);
    }
    
    @Test
    @Transactional
    public void updateById() throws ParseException {
        AirUpdateDTO airUpdateDTO = new AirUpdateDTO();
        airUpdateDTO.setId(22);
        airUpdateDTO.setDistrictId(1);
        airUpdateDTO.setPm25(555);
        airUpdateDTO.setPm10(555);
        
        String dateStr = "2025-03-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date monitorTime = sdf.parse(dateStr);
        airUpdateDTO.setMonitorTime(monitorTime);
        
        airUpdateDTO.setMonitoringStation("江西监测站！");
        airService.updateById(airUpdateDTO);
    }
    
    @Test
    @Transactional
    public void deleteById() {
        airService.deleteById(12);
    }
}
