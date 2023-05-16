package com.wangxu.d7_exception_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。");
        try {
            parseTime("2011-11-11 11:11:11");
            System.out.println("成功完成");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("完成失败");
        }
        System.out.println("程序结束。。。。。。");
    }

    private static void parseTime(String data) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(data);
        System.out.println(d);
        InputStream is = new FileInputStream("E:/meinv.jpg");

    }
}
