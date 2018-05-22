package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * PACKAGE      :   com.example.demo.service
 * Author       :   yikun.he
 * Create Time  :   2018/5/22 9:32
 * 文件描述     :
 **/
@Service
public class RedisDemoService implements IRedisDemoService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public void test() {
        this.redisTemplate.opsForValue().set("name","zhangsan");
    }
}
