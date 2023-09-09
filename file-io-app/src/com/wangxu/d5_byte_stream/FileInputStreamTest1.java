package com.wangxu.d5_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 目标：掌握文件字节输入流，每次读取一个字节
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件字节输入流管道，与源文件接通。
//        InputStream is = new FileInputStream(new File("file-io-app\\src\\wangxu01.txt"));
        // 简化写法，推荐使用
        InputStream is = new FileInputStream("file-io-app\\src\\wangxu01.txt");

        // 2.开始读取文件字节数据
        // 每次读取一个字节返回，如果没有数据后返回-1
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println(is.read());
        is.close();
    }
}
