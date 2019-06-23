package com.liuxm.youngmemory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.liuxm.youngmemory.mapper")
public class YoungmemoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungmemoryApplication.class, args);
    }

}
