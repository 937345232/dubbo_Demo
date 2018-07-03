package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.DemoService;


/**
 * @author jzx
 * @Description
 * @Date: 2018-06-26 14:05
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "dubbo "+ name+" test";
    }
}
