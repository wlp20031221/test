package com.qvtu.springbootgaoji.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author 作者
 * @create 2025-03-10-10:40
 * 1.定义条件类自定义类实现Condition接口，重写matches方法，在matches方法中进行逻判断，返回boolean值。
 * 2.判断条件：在初始化Bean时，使用@Conditional(条件类.class)注解
 */
public class ClassCondition implements Condition {
    /*
    matches方法两个参数：
        @param context 上下文对象。用于获取环境，IOC容器，ClassLoader对象
        @param metadata 注解元对象。可以用于获取注解定义的属性值
    */

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

//        //1.需求导入jedis坐标后，加载该Bean，不导入就不加载
//        //思路：判断redis.clients.jedis.Jedis文件是否存在，利用forname看是否报错
//        boolean flag = true;
//        try {
//            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
//        } catch (ClassNotFoundException e) {
//            flag = false;
//        }
//        return flag;


        //2.需求：导入通过注解属性值value指定坐标后，加载该Bean，不导入就不加载

        //获取注解属性值 value
        Map<String,Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
//        System.out.println(map);
        String[] value = (String[]) map.get("value");

        boolean flag = true;
        try {
            for (String className : value){
                Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
            }
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }
}
