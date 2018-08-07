package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.ConsumeService;
import org.springframework.stereotype.Service;
import com.example.demo.service.DemoService;

/**
 * @author jiazhaoxin@zto.cn
 * @Description
 * @Date: 2018-07-03 09:31
 */
@Service
public class ConsumeServiceImpl implements ConsumeService {

    @Reference(version = "1.0.0")
     private  DemoService demoService;

    @Override
    public String talk(String task) {

        System.out.println("task = " + task);

        return demoService.sayHello(task);
    }
}
