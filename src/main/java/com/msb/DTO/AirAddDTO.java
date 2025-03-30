package com.msb.DTO;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/27 20:51
 */
public class AirAddDTO {
    
    @NotNull(message = "监测区域为必选项，不能为空！")
    private Integer districtId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "监测时间为必选项，不能为空！")
    private Date monitorTime;
    
    @NotNull(message = "pm10为必选项，不能为空！")
    private Integer pm10;
    @NotNull(message = "pm25为必选项，不能为空！")
    private Integer pm25;
    @NotBlank(message = "监测站为必选项，不能为空！")
    private String monitoringStation;
    
    public Integer getDistrictId() {
        return districtId;
    }
    
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
    
    public Date getMonitorTime() {
        return monitorTime;
    }
    
    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }
    
    public Integer getPm10() {
        return pm10;
    }
    
    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }
    
    public Integer getPm25() {
        return pm25;
    }
    
    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }
    
    public String getMonitoringStation() {
        return monitoringStation;
    }
    
    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }
}
