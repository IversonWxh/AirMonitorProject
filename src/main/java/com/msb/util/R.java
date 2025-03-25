package com.msb.util;

import com.msb.vo.ResultVo;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 21:23
 */
public class R {
    public static ResultVo ok() {
        ResultVo vo = new ResultVo();
        vo.setCode(0);
        vo.setMsg("成功");
        return vo;
    }
    
    public static ResultVo ok(Object data) {
        ResultVo vo = ok();
        vo.setData(data);
        return vo;
    }
}
