package com.qvtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 作者
 * @create 2025-03-08-09:59
 * 引导类，springboot的项目入口
 */
@SpringBootApplication
public class OneStudyApplication {

    public static void main(String[] args){
        SpringApplication.run(OneStudyApplication.class,args);
    }
}
