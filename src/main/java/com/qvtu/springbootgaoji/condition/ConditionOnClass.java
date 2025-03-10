package com.qvtu.springbootgaoji.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author 作者
 * @create 2025-03-10-10:54
 * SpringBoot提供的常用条件注解：
 *   @ConditionalOnClass：判断环境中是否有对应字节码文件才初始化Bean
 *   @ConditionalOnMissingBean: 判断环境中没有Bean才初始化Bean
 *   @ConditionalOnProperty: 判断配置文件中是否有对应属性和值才初始化Bean
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class)
public @interface ConditionOnClass {
    String[] value();
}
