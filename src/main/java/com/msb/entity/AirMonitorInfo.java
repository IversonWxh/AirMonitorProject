package com.msb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 18:06
 */
public class AirMonitorInfo {
    private Integer id;
    @JsonIgnore
    private Integer districtId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date monitorTime;
    private Integer pm10;
    private Integer pm25;
    private String monitoringStation;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyTime;
    
    private String districtName;
    
    public String getDistrictName() {
        return districtName;
    }
    
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    
    public Date getLastModifyTime() {
        return lastModifyTime;
    }
    
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
    
    @Override
    public String toString() {
        return "AirMonitorInfo{" +
                "id=" + id +
                ", districtId=" + districtId +
                ", monitorTime=" + monitorTime +
                ", pm10=" + pm10 +
                ", pm25=" + pm25 +
                ", monitoringStation='" + monitoringStation + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                ", districtName='" + districtName + '\'' +
                '}';
    }
}
