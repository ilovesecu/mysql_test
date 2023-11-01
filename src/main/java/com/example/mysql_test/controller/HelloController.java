package com.example.mysql_test.controller;

import com.example.mysql_test.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello#1";
    }

    @GetMapping(value = "/test")
    public String test(){
        return helloService.getTest();
    }

    @GetMapping(value = "/testcnt")
    public int testCnt(){
        return helloService.getTestCnt();
    }

}
