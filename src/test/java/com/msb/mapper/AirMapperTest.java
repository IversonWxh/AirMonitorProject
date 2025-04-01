package com.msb.mapper;

import com.msb.entity.AirMonitorInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    @Test
    @Transactional  //如果上面有@test，会自动回滚的
    public void insert() {
        AirMonitorInfo airMonitorInfo = new AirMonitorInfo();
        airMonitorInfo.setDistrictId(1);
        airMonitorInfo.setMonitorTime(new Date());
        airMonitorInfo.setPm10(10);
        airMonitorInfo.setPm25(25);
        airMonitorInfo.setMonitoringStation("上海检测站！");
        Integer count = airMapper.insert(airMonitorInfo);
        Assert.assertEquals(1, (int) count);
    }
    
    @Test
    @Transactional
    public void updateById() throws ParseException {
        AirMonitorInfo airMonitorInfo = new AirMonitorInfo();
        airMonitorInfo.setId(22);
        airMonitorInfo.setDistrictId(1);
        airMonitorInfo.setPm25(555);
        airMonitorInfo.setPm10(555);
        
        String dateStr = "2025-03-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date monitorTime = sdf.parse(dateStr);
        airMonitorInfo.setMonitorTime(monitorTime);
        
        airMonitorInfo.setMonitoringStation("芜湖监测站！");
        int count = airMapper.updateById(airMonitorInfo);
        Assert.assertEquals(1, count);
    }
    
    @Test
    @Transactional
    public void deleteById() {
        int count = airMapper.deleteById(22);
        Assert.assertEquals(1, count);
    }
}