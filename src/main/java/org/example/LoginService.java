package org.example;

/**
 * @author 作者
 * @create 2025-03-04-17:07
 */
public class LoginService {
    public String login(String username, String password) {
        // 空值检查（包括null和空字符串）
        if (isEmpty(username) || isEmpty(password)) {
            return "用户名或密码不能为空";
        }
        // 精确匹配admin和123
        if ("admin".equals(username) && "123".equals(password)) {
            return "登录成功";
        }
        // 用户名错误但密码正确
        if (!"admin".equals(username) && "123".equals(password)) {
            return "请输入正确的用户名";
        }
        // 用户名正确但密码错误
        if ("admin".equals(username) && !"123".equals(password)) {
            return "请输入正确的密码";
        }
        // 其他错误情况
        return "请输入正确的用户名和密码";
    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();  // 处理空格输入
    }
}
