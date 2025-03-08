package com.qvtu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者
 * @create 2025-03-08-10:03
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring boot";
    }
}
