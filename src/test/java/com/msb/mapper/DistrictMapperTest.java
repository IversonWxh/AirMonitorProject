package com.msb.mapper;


import com.msb.entity.District;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistrictMapperTest {
    @Autowired
    private DistrictMapper districtMapper;
    
    @Test
    public void findAll() {
        List<District> districtList = districtMapper.findAll();
        System.out.println(districtList);
    }
}