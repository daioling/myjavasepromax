package com.wangxu.d2_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {
    public static void main(String[] args) throws ParseException {
        // 1.开始和结束时间
        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";
        // 2.小贾，小皮报名时间
        String xiaojia = "2021-11-11 00:03:47";
        String xiaopi = "2021-11-11 00:10:11";
        // 3.解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime1 = sdf.parse(startTime);
        Date endTime1 = sdf.parse(endTime);
        Date xiaojia1 = sdf.parse(xiaojia);
        Date xiaopi1 = sdf.parse(xiaopi);
        if(xiaojia1.after(startTime1) && xiaojia1.before(endTime1)){
            System.out.println("小贾秒杀成功！");
        }else {
            System.out.println("小贾未能在规定时间内进行抢购！");
        }
        if(xiaopi1.after(startTime1) && xiaopi1.before(endTime1)){
            System.out.println("小皮秒杀成功！");
        }else {
            System.out.println("小皮未能在规定时间内进行抢购！");
        }
    }
}
