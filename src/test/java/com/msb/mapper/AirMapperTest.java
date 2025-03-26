package com.msb.mapper;

import com.msb.entity.AirMonitorInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AirMapperTest {
    @Autowired
    private AirMapper airMapper;
    
    @Test
    public void findByDistrictId() {
        List<AirMonitorInfo> list = airMapper.findByDistrictId(1);
        for (AirMonitorInfo airMonitorInfo : list) {
            System.out.println(airMonitorInfo.toString());
        }
        
    }
}