package com.gulimail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1、想要远程调用的步骤
 * 1）、引入open-feign
 * 2）、编写一个接口，需要调用远程服务
 * 3）、声明接口的每一个方法都是调用远程服务的那个请求
 * 4）、开启远程调用的功能
 */
@EnableFeignClients(basePackages = "com.gulimail.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }

}
