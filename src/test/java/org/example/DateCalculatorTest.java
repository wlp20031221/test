package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-04-16:57
 */
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DateCalculatorTest {
    private final DateCalculator calculator = new DateCalculator();

    // 测试1：月份无效（语句覆盖：输入检查）
    @Test
    public void testInvalidMonth() {
        String result = calculator.getMonthDays(2023, 13);
        assertThat(result, equalTo("月份输入不正确。"));
    }

    // 测试2：非2月且天数为30天（语句覆盖：4月）
    @Test
    public void test30DaysMonth() {
        String result = calculator.getMonthDays(2023, 4);
        assertThat(result, equalTo("2023年4月份的天数是30天。"));
    }

    // 测试3：非2月且天数为31天（语句覆盖：1月）
    @Test
    public void test31DaysMonth() {
        String result = calculator.getMonthDays(2023, 1);
        assertThat(result, equalTo("2023年1月份的天数是31天。"));
    }

    // 测试4：2月为普通闰年（如2020年，语句覆盖：闰年逻辑）
    @Test
    public void testLeapYearFebruary() {
        String result = calculator.getMonthDays(2020, 2);
        assertThat(result, equalTo("2020年2月份的天数是29天。"));
    }

    // 测试5：2月为世纪闰年（如2000年，语句覆盖：整百年份处理）
    @Test
    public void testCenturyLeapYearFebruary() {
        String result = calculator.getMonthDays(2000, 2);
        assertThat(result, equalTo("2000年2月份的天数是29天。"));
    }

    // 测试6：2月为平年（如1900年，语句覆盖：非闰年逻辑）
    @Test
    public void testNonLeapYearFebruary() {
        String result = calculator.getMonthDays(1900, 2);
        assertThat(result, equalTo("1900年2月份的天数是28天。"));
    }
}