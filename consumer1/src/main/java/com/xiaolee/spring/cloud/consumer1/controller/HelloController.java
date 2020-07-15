package com.xiaolee.spring.cloud.consumer1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
