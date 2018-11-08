package com.cloud.eureka.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String home(String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
