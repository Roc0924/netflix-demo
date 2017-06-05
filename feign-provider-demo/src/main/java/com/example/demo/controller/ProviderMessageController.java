package com.example.demo.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/6/5
 * Time                 : 15:50
 * Description          :
 */
@RestController
@EnableEurekaClient
public class ProviderMessageController {

    @RequestMapping(value = "/providerMessage", method = RequestMethod.GET)
    public String getMessage(@RequestParam(name = "userName") String userName) {
        return userName + " get message from fegin provider";
    }
}
