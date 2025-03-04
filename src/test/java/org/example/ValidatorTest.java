package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-04-17:01
 */
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidatorTest {
    private final Validator validator = new Validator();

    // 测试1：正确输入
    @Test
    public void testValidInput() {
        String result = validator.validate("abcde@163.com", "123456");
        assertThat(result, equalTo("信息正确"));
    }

    // 测试2：邮箱无@符号（触发split检查）
    @Test
    public void testEmailMissingAt() {
        String result = validator.validate("abcde163.com", "123456");
        assertThat(result, equalTo("邮箱地址不符合要求"));
    }

    // 测试3：登录名包含非字母字符（触发正则检查）
    @Test
    public void testInvalidLoginCharacters() {
        String result = validator.validate("ab12e@126.com", "123456");
        assertThat(result, equalTo("邮箱地址不符合要求"));
    }

    // 测试4：主机名错误（触发主机名检查）
    @Test
    public void testInvalidHost() {
        String result = validator.validate("abcde@162.com", "123456");
        assertThat(result, equalTo("邮箱地址不符合要求"));
    }

    // 测试5：域名错误（触发域名检查）
    @Test
    public void testInvalidDomain() {
        String result = validator.validate("abcde@163.net", "123456");
        assertThat(result, equalTo("邮箱地址不符合要求"));
    }

    // 测试6：密码不足6位（触发长度检查）
    @Test
    public void testShortPassword() {
        String result = validator.validate("abcde@126.com", "12345");
        assertThat(result, equalTo("密码不符合要求"));
    }

    // 测试7：密码含非数字字符（触发数字检查）
    @Test
    public void testNonDigitPassword() {
        String result = validator.validate("abcde@126.com", "12345a");
        assertThat(result, equalTo("密码不符合要求"));
    }
}