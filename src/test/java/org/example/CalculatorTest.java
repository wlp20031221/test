package org.example;


import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-04-16:52
 */

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAllConditions() {
        // 任意数据（如a=2, b=3）触发所有语句
        String output = calculator.calculate(2, 3);
        // 验证三行结果的开头是否符合预期
        String[] lines = output.split("\n");
        assertThat(lines[0], startsWith("x=a*a*b的值："));
        assertThat(lines[1], startsWith("x=a-b的值："));
        assertThat(lines[2], startsWith("x=a+b的值："));
    }
}