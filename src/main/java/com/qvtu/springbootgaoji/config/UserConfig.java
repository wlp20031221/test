package com.qvtu.springbootgaoji.config;

import com.qvtu.springbootgaoji.condition.ClassCondition;
import com.qvtu.springbootgaoji.condition.ConditionOnClass;
import com.qvtu.springbootgaoji.don.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author 作者
 * @create 2025-03-10-10:33
 */

@Configuration
public class UserConfig {

    @Bean
//    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user(){
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "itcast",havingValue = "qvtu")
    public User user2(){
        return new User();
    }
}
