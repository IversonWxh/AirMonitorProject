package com.msb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wxh
 * @version 1.0
 * @date 2025/3/25 17:46
 */
@SpringBootApplication
@MapperScan(basePackages = "com.msb.mapper")
public class AirMonitorStarterApp {
    
    public static void main(String[] args) {
        SpringApplication.run(AirMonitorStarterApp.class, args);
    }
}
