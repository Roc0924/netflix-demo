package com.example.demo;

import org.springframework.cloud.config.server.config.ConfigServerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/5/25
 * Time                 : 10:43
 * Description          :
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ConfigServerConfiguration.class)
public @interface EnableConfigServer {

}