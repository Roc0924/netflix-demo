package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/5/31
 * Time                 : 11:24
 * Description          :
 */
@FeignClient("eureka-client")
public interface EurekaClients {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String doGet(@RequestParam(name = "name") String name);
}
