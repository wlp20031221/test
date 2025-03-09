package com.qvtu.test;

import com.qvtu.OneStudyApplication;
import com.qvtu.controller.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 作者
 * @create 2025-03-09-10:41
 * Service测试类
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OneStudyApplication.class)
//当测试类的包跟要测试类的包一致或是其子包时，不需要写classes这个后缀，会自动扫描测试类
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        userService.test();
    }
}
