package com.cloud.ribbon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {
    @Bean
    @Autowired
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
