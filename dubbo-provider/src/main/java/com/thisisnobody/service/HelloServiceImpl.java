package com.thisisnobody.service;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;

@Service(interfaceClass = IHelloService.class)
@org.springframework.stereotype.Service
@Slf4j
public class HelloServiceImpl implements IHelloService {

    public String sayHello(String name) {
        log.info("hello" + name);
        return "hello" + name;
    }

}
