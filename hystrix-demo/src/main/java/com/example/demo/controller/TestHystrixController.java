package com.example.demo.controller;

import com.example.demo.entity.Fallback;
import com.example.demo.service.TestHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/6/1
 * Time                 : 14:26
 * Description          :
 */
@RestController
public class TestHystrixController {

    @Autowired
    TestHystrixService testHystrixService;

    @RequestMapping(value = "/testHystrix", method = RequestMethod.GET)
    public String testHystrix(@RequestParam(name = "name") String name) {
        return testHystrixService.testHystrix(name);
    }
}
