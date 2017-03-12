/**
 * Created by wangk on 2017/3/11.
 */
package com.lkl.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaokailin on 16/4/28.
 */
@SpringBootApplication
@RestController
public class ClientApplication {
    @Value("${name:World!}")
    String bar;
    @Value("${foo:World!}")
    String barFoo;

    @RequestMapping("/")
    String hello() {
        return "Hello " + bar + "!"+barFoo;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
