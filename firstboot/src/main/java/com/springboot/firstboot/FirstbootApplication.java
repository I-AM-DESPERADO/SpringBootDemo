package com.springboot.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
public class FirstbootApplication {


	@RequestMapping("/hello")
	public String index() {
		return "Hello Spring boot";
	}


	public static void main(String[] args) {
		SpringApplication.run(FirstbootApplication.class, args);
	}
}
