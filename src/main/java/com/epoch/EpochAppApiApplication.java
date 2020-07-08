package com.epoch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.epoch.mapper")
public class EpochAppApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpochAppApiApplication.class, args);
    }

}
