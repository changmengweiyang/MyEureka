package com.sq.jsclouddemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//本地新开发的功能
//远程修改
//修改
//sunSunSUN
@SpringBootApplication
@EnableEurekaServer
public class JsCloudDemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsCloudDemoServerApplication.class, args);
    }

}
