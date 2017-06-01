package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/6/1
 * Time                 : 15:08
 * Description          :
 */
@Service
public class TestHystrixService {
    private Random random = new Random();

    @HystrixCommand(fallbackMethod = "fallback")
    public String testHystrix() {
        int randomInt = random.nextInt(10);

        if(randomInt < 5) {
            throw new RuntimeException("call TestHystrixService fail.");
        } else {
            return "randomInt : " + randomInt;
        }
    }

    public String fallback() {
        return "return from fallback";
    }

}
