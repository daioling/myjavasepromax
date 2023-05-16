package com.wangxu.d7_exception_handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("程序开始。。。。。。");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束。。。。。。");
    }

    private static void parseTime(String data) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(data);
        System.out.println(d);
    }
}
