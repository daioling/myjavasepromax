package com.wangxu.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Month;

public class Demo01LocalDate {
    public static void main(String[] args) {
        //获取日期对象
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期 : " + nowDate);//今天的日期
        int year = nowDate.getYear();
        System.out.println("year : " + year);
        int mouth = nowDate.getMonthValue();
        System.out.println("mouth : " + mouth);
        int day = nowDate.getDayOfMonth();
        System.out.println("day : " + day);

        // 当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear : " + dayOfYear);

        // 星期
        System.out.println(nowDate.getDayOfWeek());//THURSDAY
        System.out.println(nowDate.getDayOfWeek().getValue());//4

        //月份
        System.out.println(nowDate.getMonth()); //英文
        System.out.println(nowDate.getMonth().getValue()); //数字
        System.out.println("-----------------------------------");

        LocalDate bt = LocalDate.of(1991, 11, 11);
        System.out.println(bt);// 接入对应的年月日
        System.out.println(LocalDate.of(1991, Month.NOVEMBER, 11));
    }
}
