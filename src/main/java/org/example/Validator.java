package org.example;

/**
 * @author wlp
 * @create 2025-03-04-17:01
 */

public class Validator {
    public String validate(String email, String password) {
        if (!isEmailValid(email)) {
            return "邮箱地址不符合要求";
        }
        if (!isPasswordValid(password)) {
            return "密码不符合要求";
        }
        return "信息正确";
    }

    private boolean isEmailValid(String email) {
        String[] parts = email.split("@");
        if (parts.length != 2) return false;  // 检查@符号分割

        String login = parts[0];
        String rest = parts[1];
        // 验证登录名为5个字母（大小写均可）
        if (login.length() != 5 || !login.matches("[a-zA-Z]{5}")) {
            return false;
        }

        String[] hostDomain = rest.split("\\.", 2);  // 分割主机名和域名
        if (hostDomain.length != 2) return false;

        String host = hostDomain[0];
        String domain = hostDomain[1];
        // 验证主机名和域名
        return (host.equals("163") || host.equals("126")) &&
                (domain.equals("com") || domain.equals("com.cn"));
    }

    private boolean isPasswordValid(String password) {
        return password.matches("\\d{6,}");  // 至少6位数字
    }
}
