package com.wangxu.d2_simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        // 1。创建日期对象
        Date d = new Date();
        System.out.println(d);
        // 2.格式化日期对象（指定最终格式化形式）
        SimpleDateFormat hmd = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        // 3.开始格式化日期对象成为喜欢的字符串形式
        String rs = hmd.format(d);
        System.out.println(rs);
        // 4.格式化时间毫秒值
        long time1 = System.currentTimeMillis();
        String rs1 = hmd.format(time1);
        System.out.println(rs1);



    }
}
