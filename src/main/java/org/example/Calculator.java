package org.example;

/**
 * @author 作者
 * @create 2025-03-04-16:39
 */

public class Calculator {
    public String calculate(int a, int b) {
        String result = "";
        // 条件1：计算 a*a*b
        result += "x=a*a*b的值：" + (a * a * b) + "\n";
        // 条件2：计算 a-b
        result += "x=a-b的值：" + (a - b) + "\n";
        // 条件3：计算 a+b
        result += "x=a+b的值：" + (a + b);
        return result;
    }
}