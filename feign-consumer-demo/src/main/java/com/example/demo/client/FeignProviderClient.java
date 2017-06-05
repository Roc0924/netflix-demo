package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/6/5
 * Time                 : 16:26
 * Description          :
 */
@FeignClient("feign-provider-demo")
public interface FeignProviderClient {

    @RequestMapping(value = "/providerMessage", method = RequestMethod.GET)
    String getMessage(@RequestParam(name = "userName") String userName);
}
