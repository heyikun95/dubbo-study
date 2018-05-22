package com.example.demo.controller;

import com.example.demo.service.IDemoService;
import com.example.demo.service.IRedisDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * PACKAGE      :   com.example.demo.controller
 * Author       :   yikun.he
 * Create Time  :   2018/5/15 18:53
 * 文件描述     :
 **/
@RestController
public class TestController {

    @Autowired
    private IDemoService demoService;

    @Autowired
    private IRedisDemoService redisDemoService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return this.demoService.demo();
    }


    @RequestMapping(value = "/testRedis",method = RequestMethod.GET)
    public void testRedis(){
        this.redisDemoService.test();
    }
}
