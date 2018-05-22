package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * PACKAGE      :   com.example.demo
 * Author       :   yikun.he
 * Create Time  :   2018/5/15 16:43
 * 文件描述     :
 **/
@ImportResource({
        "classpath*:dubbo/dubbo-consumer.xml"
})
@SpringBootApplication
public class ServiceCommonConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCommonConsumerApplication.class,args);
    }
}
