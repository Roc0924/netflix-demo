package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.example.demo")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerDemoApplication.class, args);
	}
}
