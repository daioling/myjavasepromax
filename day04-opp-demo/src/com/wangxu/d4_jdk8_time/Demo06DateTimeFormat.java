package com.wangxu.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo06DateTimeFormat {
    public static void main(String[] args) {
        // 本地此刻 日期时间对象
        LocalDateTime ldt = LocalDateTime.now() ;
        System.out.println(ldt);
        //解析格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        //正向格式化
        String ldtStr = dtf.format(ldt);
        System.out.println(ldtStr);
        //逆向格式化
        String ldtStr2 = ldt.format(dtf);
        System.out.println(ldtStr2);
        //解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2019-11-11 11:11:11";
        //解析当前字符串为本地日期对象
        LocalDateTime ldt1 = LocalDateTime.parse(dateStr, dtf1);
        System.out.println(ldt1);
    }
}
