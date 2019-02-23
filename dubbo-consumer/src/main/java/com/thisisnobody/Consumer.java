package com.thisisnobody;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
@Slf4j
public class Consumer {
    public static void main(String[] args) {
        log.info("hello? this is nobody!");
        SpringApplication.run(Consumer.class, args);

    }
}
