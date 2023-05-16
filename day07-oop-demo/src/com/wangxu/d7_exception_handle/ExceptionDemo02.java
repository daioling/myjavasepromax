package com.wangxu.d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args){
        System.out.println("程序开始。。。。。。");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束。。。。。。");
    }

    private static void parseTime(String data){
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(data);
//            System.out.println(d);
//        } catch (ParseException e) {
//            System.out.println("出现了解析时间异常哦，走点心！！！");;
//        }
//
//        try {
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException e) {
//            System.out.println("您的文件根本就没有啊，不要骗我哦！！！");;
//        }
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(data);
//            System.out.println(d);
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (ParseException e) {
//            e.printStackTrace();// 打印异常栈信息
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        // 企业级写法
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(data);
            System.out.println(d);
            InputStream is = new FileInputStream("E:/meinv.jpg");
        } catch (Exception e) {
            e.printStackTrace();// 打印异常栈信息
        }
    }
}
