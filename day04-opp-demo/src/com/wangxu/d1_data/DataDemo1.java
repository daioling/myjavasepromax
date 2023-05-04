package com.wangxu.d1_data;

import java.util.Date;

public class DataDemo1 {
    public static void main(String[] args) {
        // 记录时间的两种方式：
        // 1.日期对象
        //      创建一个Data类的对象：代表系统此刻日期时间对象
        Date d1 = new Date();
        System.out.println(d1); //打印的为内容，方法已重写
        // 2.时间毫秒值
        //      调用方法
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        long time = d1.getTime(); //获得当前日期的时间毫秒值
        System.out.println(time);


        System.out.println("------------------------");
        Date time11 = new Date();
        System.out.println(time11);
        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 + 121) * 1000;
        System.out.println(time2);
        //时间毫秒值转换为时间
        Date time22 = new Date(time2); // 方法一
        System.out.println(time22);
        Date time33 = new Date(); // 方法二
        time33.setTime(time2);
        System.out.println(time33);

    }
}
