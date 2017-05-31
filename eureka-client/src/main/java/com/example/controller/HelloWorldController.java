package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/5/25
 * Time                 : 14:37
 * Description          :
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String doGet(@RequestParam(name = "name") String name) {
        return "hello " + name;
    }
}
