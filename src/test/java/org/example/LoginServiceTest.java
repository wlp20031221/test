package org.example;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-04-17:08
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LoginServiceTest {
    private String username;
    private String password;
    private String expected;

    public LoginServiceTest(String username, String password, String expected) {
        this.username = username;
        this.password = password;
        this.expected = expected;
    }

    @Parameters(name = "测试用例：username={0}, password={1} → {2}")  // 明确测试名称
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { null, null, "用户名或密码不能为空" },      // 空输入
                { "", "123", "用户名或密码不能为空" },       // 用户名为空
                { "admin", "", "用户名或密码不能为空" },     // 密码为空
                { "admin", "123", "登录成功" },            // 正确登录
                { "user", "123", "请输入正确的用户名" },    // 用户名错误
                { "admin", "456", "请输入正确的密码" },     // 密码错误
                { "guest", "789", "请输入正确的用户名和密码"} // 两者均错误
        });
    }

    @Test
    public void testLogin() {
        LoginService service = new LoginService();
        String actual = service.login(username, password);
        assertEquals(expected, actual);
    }
}