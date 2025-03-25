package com.msb.vo;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 21:16
 */
public class ResultVo {
    private Integer code;
    
    private String msg;
    
    private Object data;
    
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
