package com.guozhengood.api.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: swf
 * @Description:
 * @Date:Create：in 2020/2/20:08:45
 * @Modified By：
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ApiZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiZuulApplication.class, args);
    }
}
