package com.example.demo.controller;

import com.example.demo.client.EurekaClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/5/31
 * Time                 : 10:53
 * Description          :
 */
@RestController
public class HelloWorldController {
    @Autowired
    EurekaClients eurekaClients;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(name = "name") String name) {
        name = eurekaClients.doGet(name);
        return name;
    }
}
