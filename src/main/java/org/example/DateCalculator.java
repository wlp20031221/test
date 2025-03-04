package org.example;

/**
 * @author wlp
 * @create 2025-03-04-16:56
 */
public class DateCalculator {
    public String getMonthDays(int year, int month) {
        if (month < 1 || month > 12) {
            return "月份输入不正确。";
        }

        int days;
        switch (month) {
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            default:
                days = 31;
                break;
        }
        return String.format("%d年%d月份的天数是%d天。", year, month, days);
    }

    private boolean isLeapYear(int year) {
        // 闰年规则：能被400整除，或能被4整除但不能被100整除
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
