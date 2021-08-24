package com.gulimail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus
 *  1)、导入依赖
 *  2)、配置
 *      1、配置数据源：
 *          1）、导入数据库驱动
 *          2）、在yml中配置相关信息
 *      2、配置MyBatis-Plus
 *          1）、注解@MapperScan
 *          2）、配置映射文件的路径
 */
@MapperScan("com.gulimail.product.dao")
@SpringBootApplication
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
