package com.wangxu.d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * 目标：掌握打印流：PrintStream / PrintWrite 的用法
 */
public class PrintTest1 {
    public static void main(String[] args) {
        try (
                // 1.创建一个打印流管道
//                PrintStream ps = new PrintStream("file-io-app02\\src\\wangxu05.txt", Charset.forName("UTF-8"));
                PrintStream ps = new PrintStream("file-io-app02\\src\\wangxu05.txt");

                ){
            ps.println(97);
            ps.println("a");
            ps.println("abc");
            ps.println(9.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
