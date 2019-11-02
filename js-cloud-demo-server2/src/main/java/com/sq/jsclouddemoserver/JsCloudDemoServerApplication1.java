package com.sq.jsclouddemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//本地新开发的功能
//远程修改
//修改
//2019/10/30 22 sunTest
@SpringBootApplication
@EnableEurekaServer
public class JsCloudDemoServerApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(JsCloudDemoServerApplication1.class, args);
    }

}
