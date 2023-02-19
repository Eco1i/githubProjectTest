package com.ecoli.controller;

import com.ecoli.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Ecoli
 * @date 23/2/19 10:18
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/getInfoById")
    public String getInfoById(){
       return testService.getInfoById(1);
    }


}