package com.msb.controller;

import com.github.pagehelper.PageInfo;
import com.msb.entity.District;
import com.msb.service.AirService;
import com.msb.util.R;
import com.msb.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * 查询区域信息
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
    
    
    /**
     * 分页&条件查询空气质量信息
     * # 请求参数
     * page = 1 (当前页，默认1)
     * size = 5 (每页显示条数，默认5)
     * districtId = null (区域条件 可传可不传)
     * Get http://localhost:8080/air/list
     */
    @GetMapping("/air/list")
    public ResultVo airList(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "5") Integer size,
                            Integer districtId) {
        PageInfo pageInfo = airService.findAirByDistrictIdAndPage(page, size, districtId);
        
        return R.ok(pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }
    
}
