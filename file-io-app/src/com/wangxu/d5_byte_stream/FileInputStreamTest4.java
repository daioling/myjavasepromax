package com.wangxu.d5_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 目标：使用文件字节输入流一次读取完文件的全部字节
 */
public class FileInputStreamTest4 {
    public static void main(String[] args) throws Exception {
        // 1.一次性读取完全部文件的全部字节到一个字节数组中去
        // 创建一个字节输入流管道与原文件接通
        InputStream is = new FileInputStream("file-io-app\\src\\wangxu03.txt");
        // 2.准备一个字节数组，大小与文件大小正好相同
//        File file = new File("file-io-app\\src\\wangxu03.txt");
//        long size = file.length();
//        byte[] buffer = new byte[(int) size];
//        int len = is.read(buffer);
//        System.out.println(size);
//        System.out.println(len);
//        System.out.println(new String(buffer));

        // 简单方法优化
        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));
    }
}
