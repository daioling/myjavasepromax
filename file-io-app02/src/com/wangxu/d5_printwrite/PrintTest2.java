package com.wangxu.d5_printwrite;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintTest2 {
    public static void main(String[] args) {
        System.out.println("老骥伏枥");
        try (
                // 把系统默认的打印流对象改为自己设置的打印流
                PrintStream ps = new PrintStream("file-io-app02\\src\\wangxu04.txt");
                ) {
            System.setOut(ps);
            System.out.println("志在千里");
            System.out.println("烈士暮年");
            System.out.println("壮心不已");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
