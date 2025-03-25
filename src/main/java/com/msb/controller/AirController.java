package com.msb.controller;

import com.msb.entity.District;
import com.msb.service.AirService;
import com.msb.util.R;
import com.msb.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 18:28
 */
@RestController
public class AirController {
    
    @Autowired
    private AirService airService;
    
    /**
     * Get http://localhost:8080/district/list
     */
    @GetMapping("/district/list")
    public ResultVo districtList() {
        List<District> districtList = airService.findDistrictList();
        
        //封装返回结果
//        Map result = new HashMap();
//        result.put("code", 0);
//        result.put("msg", "");
//        result.put("data", districtList);
        return R.ok(districtList);
    }
    
    
}
