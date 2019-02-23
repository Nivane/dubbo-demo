package com.thisisnobody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.thisisnobody.service.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference
    IHelloService iHelloService;

    @RequestMapping
    public String hello(@RequestParam String name) {
        return iHelloService.sayHello(name);
    }
}
