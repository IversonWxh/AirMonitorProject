package com.msb;

import com.msb.util.R;
import com.msb.vo.ResultVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/30 15:57
 */
@RestControllerAdvice
public class AirExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResultVo ex(Exception ex) {
        return R.error(-1, ex.getMessage());
    }
}
