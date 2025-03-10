package com.qvtu.test;

import com.qvtu.domain.User;
import com.qvtu.mapper.UserMapper;
import com.qvtu.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 作者
 * @create 2025-03-10-09:25
 * Mybatis整合的测试类
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserMapper.class)
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXmlMapper userXmlMapper;

    @Test
    public void testFindAll(){
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }

    @Test
    public void testFindAllXml(){
        List<User> userList = userXmlMapper.findAll();
        System.out.println(userList);
    }
}
