package com.wangxu.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public class Demo04UpDateTime {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);//当前时间
        System.out.println(nowTime.minusHours(1));//一小时前
        System.out.println(nowTime.minusMinutes(1));//一分钟前
        System.out.println(nowTime.minusSeconds(1));//一秒钟前
        System.out.println(nowTime.minusNanos(1));//一纳秒钟前

        System.out.println(nowTime.plusHours(1));//一小时后
        System.out.println(nowTime.plusMinutes(1));//一分钟后
        System.out.println(nowTime.plusSeconds(1));//一秒钟后
        System.out.println(nowTime.plusNanos(1));//一纳秒钟后
        //不可变对象

        System.out.println("---------------------------------");
        LocalDate myDate = LocalDate.of(2018, 9, 5);
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天是2018-09-06吗？  " + nowDate.equals(myDate));
        System.out.println(myDate + "是否在" + nowDate + "之前？" + myDate.isBefore(nowDate));
        System.out.println(myDate + "是否在" + nowDate + "之后？" + myDate.isAfter(nowDate));
        System.out.println("---------------------------------");
        //判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(200, 2, 22);
        LocalDate nowDate1 = LocalDate.now();
        MonthDay birMD = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMD = MonthDay.from(nowDate1);
        System.out.println("今天是你生日吗？ " + birMD.equals(nowMD));

    }
}
