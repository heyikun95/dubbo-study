package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * PACKAGE      :   com.example.demo.service
 * Author       :   yikun.he
 * Create Time  :   2018/5/15 16:11
 * 文件描述     :
 **/
@Service
public class DemoService implements IDemoService {
    @Override
    public String demo(){
        return "Hello Dubbo Demo Service!";
    }

    @Override
    public Integer test(){
        int i = 5;
        int count = 1;
        while (i >= 1){
            count = count * i;
            i--;
        }
        System.out.println("111");
        System.out.println("This is a test to test Git !");
        return count;
    }
}
