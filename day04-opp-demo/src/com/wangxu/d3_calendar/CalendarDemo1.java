package com.wangxu.d3_calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        // 1.拿到系统此刻的日历对象
        Calendar cal = Calendar.getInstance();
        // 2.获取日历信息
        System.out.println(cal);
        // 3.public void set(int field, int value), 修改日历的某个字段信息。
        int yyyy = cal.get(Calendar.YEAR);
        System.out.println(yyyy);
        int MM = cal.get(Calendar.MONTH) + 1;
        System.out.println(MM);
        int dd = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(dd);
        // 4.public void add(int field, int amount), 为某个字段添加/减少指定的值
        //cal.set(Calendar.HOUR, 12); (一般不会修改)
        //   请问64天后是什么时候
        cal.add(Calendar.DAY_OF_YEAR, 64);
        // 5.public final Date getTime(): 拿到此刻日期对象
        Date d = cal.getTime();
        System.out.println(d);
        // 6.public long  getTimeMillis(): 拿到此刻时间毫秒值
        long time = cal.getTimeInMillis();
        System.out.println(time);


    }
}
