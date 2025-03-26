package com.msb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 21:16
 */

public class ResultVo {
    private Integer code;
    
    private String msg;
    
    private Object data;
    
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY) // 只序列化非空
    private Long totalData;
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY) // 只序列化非空
    private Long totalPages;
    
    public Long getTotalData() {
        return totalData;
    }
    
    public void setTotalData(Long totalData) {
        this.totalData = totalData;
    }
    
    public Long getTotalPages() {
        return totalPages;
    }
    
    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }
    
    public Integer getCode() {
        return code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
}
