package com.ldbmcs.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloFallbackService implements HelloService {

    @Override
    public String hello(String name) {
        return "调用失败，服务被降级";
    }
}
