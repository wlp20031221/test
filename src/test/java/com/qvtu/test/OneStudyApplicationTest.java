package com.qvtu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author 作者
 * @create 2025-03-09-11:02
 * Springboot整合redis
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OneStudyApplicationTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSet(){
        //存入数据
        redisTemplate.boundValueOps("name").set("张三");
    }

    @Test
    public void testGet(){
        //获取数据
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }

}
