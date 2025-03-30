package com.msb.controller;

import com.github.pagehelper.PageInfo;
import com.msb.DTO.AirAddDTO;
import com.msb.entity.District;
import com.msb.service.AirService;
import com.msb.util.R;
import com.msb.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
     * Get http://localhost:8080/district/list=
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
    
    
    /**
     * # 添加空气质量信息
     * # 请求方式&路径
     * POST    http://localhost:8080/air/add
     * <p>
     * # 请求参数           正常为了解耦，可以单独声明一个AirAddDTO专门去接收请求参数
     * districtId = Integer   （必传项）
     * monitorTime = yyyy-MM-dd  （必传项）
     * pm10 = Integer  （必传项）
     * pm25 = Integer  （必传项）
     * monitoringStation = String  （必传项）
     * <p>
     * # 业务流程
     * 1、接收参数
     * 2、做参数的非空校验
     * 3、数据扔到数据库
     */
    @PostMapping("/air/add")
    public ResultVo airAdd(@Valid AirAddDTO airAddDTO, BindingResult result) {
        //1. 查看参数是否合法
        if (result.hasErrors()) {
            //有参数不满足要求，返回参数不合法信息
            String message = result.getFieldError().getDefaultMessage();
            return R.error(400, message);
        }
        //2.调用service层添加数据
        airService.add(airAddDTO);
        //3.添加成功
        return R.ok();
    }
    
    
}
