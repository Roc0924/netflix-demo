package com.example.demo.controller;

import com.example.demo.client.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/6/5
 * Time                 : 16:22
 * Description          :
 */
@RestController
public class ConsumerMessageController {

    @Autowired
    FeignProviderClient feignProviderClient;

    @RequestMapping(value = "/consumerMessage", method = RequestMethod.GET)
    public String getMessage(@RequestParam(name = "userName") String userName) {
        return feignProviderClient.getMessage(userName);
    }
}
