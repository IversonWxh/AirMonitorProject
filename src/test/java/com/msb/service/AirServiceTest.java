package com.msb.service;


import com.github.pagehelper.PageInfo;
import com.msb.entity.District;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}