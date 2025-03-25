package com.msb.service;


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
}