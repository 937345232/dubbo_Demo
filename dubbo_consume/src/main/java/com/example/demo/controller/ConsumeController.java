package com.example.demo.controller;

import com.example.demo.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiazhaoxin@zto.cn
 * @Description
 * @Date: 2018-07-03 09:33
 */
@RestController
public class ConsumeController {


    @Autowired
    private ConsumeService consumeService;

    @GetMapping("talk/{task}")
    public String talk(@PathVariable String task){
      String data  =consumeService.talk(task);
      return data;

    }
}
