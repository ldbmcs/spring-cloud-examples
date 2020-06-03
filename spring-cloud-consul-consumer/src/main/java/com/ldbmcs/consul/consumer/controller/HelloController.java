package com.ldbmcs.consul.consumer.controller;

import com.ldbmcs.consul.consumer.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return helloService.hello(name);
    }

}

