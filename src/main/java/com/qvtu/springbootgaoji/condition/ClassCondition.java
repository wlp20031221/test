package com.qvtu.springbootgaoji.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 作者
 * @create 2025-03-10-10:40
 */
public class ClassCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1.需求导入jedis坐标后，加载该Bean，不导入就不加载
        //思路：判断redis.clients.jedis.Jedis文件是否存在，利用forname看是否报错
        boolean flag = true;
        try {
            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }
}
