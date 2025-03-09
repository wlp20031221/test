package com.qvtu.controller;

import com.qvtu.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者
 * @create 2025-03-08-10:03
 */

@RestController
public class HelloController {

    //获取单个属性的值用value最好
    @Value("${person2.name}")
    private String name;

    //当调用的属性的值较多时，用Environment
    @Autowired
    private Environment environment;

    //对象和配置属性的绑定
    @Autowired
    private Person person;


    @RequestMapping("/hello2")
    public String hello2(){

        System.out.println(name);
        System.out.println(environment.getProperty("address1[0]"));
        System.out.println(person);


        return "Hello Spring boot2";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring boot";
    }
}
