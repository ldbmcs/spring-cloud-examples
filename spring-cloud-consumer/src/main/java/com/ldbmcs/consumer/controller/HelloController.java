package com.ldbmcs.consumer.controller;

import com.ldbmcs.consumer.feign.ProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ProducerFeign producerFeign;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return producerFeign.hello(name);
    }
    
}

