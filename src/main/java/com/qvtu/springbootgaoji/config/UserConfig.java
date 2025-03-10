package com.qvtu.springbootgaoji.config;

import com.qvtu.springbootgaoji.condition.ClassCondition;
import com.qvtu.springbootgaoji.don.User;
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
    @Conditional(ClassCondition.class)
    public User user(){
        return new User();
    }
}
