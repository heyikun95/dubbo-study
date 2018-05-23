package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PACKAGE      :   com.example.demo.service
 * Author       :   yikun.he
 * Create Time  :   2018/5/23 14:17
 * 文件描述     :
 **/
@Service
public class TestService {

    @Autowired
    private IDemoService demoService;

    public String test(){
        return this.demoService.demo();
    }
}
