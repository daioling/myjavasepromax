package com.wangxu.d2_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {
    public static void main(String[] args) throws ParseException {
        // 目标：学会使用SimpleDateFormat 解析字符串时间成为日期对象
        // 有一个时间2021年08月06日 11:11:11 往后 2天 14小时 49分 06秒
        // 1.将字符串时间拿到程序中来
        String DateStr = "2021年08月06日 11:11:11";
        // 2.将字符串解析为日期对象  :形式必须与被解析时间的形式完全一样，否则解析运行时会出现错误
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(DateStr);
        // 3.往后走 2天 14小时 49分 06秒
        long time = d.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;
        // 4.格式化时间对象并输出结果
        String rs = sdf.format(time);
        System.out.println(rs);
    }
}
