package com.msb.DTO;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/31 18:18
 */
public class AirUpdateDTO {
    @NotNull(message = "Id为必传项，不能为空！")
    private Integer Id;
    
    private Integer districtId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date monitorTime;
    
    private Integer pm10;
    
    private Integer pm25;
    
    private String monitoringStation;
    
    public Integer getId() {
        return Id;
    }
    
    public void setId(Integer id) {
        Id = id;
    }
    
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
