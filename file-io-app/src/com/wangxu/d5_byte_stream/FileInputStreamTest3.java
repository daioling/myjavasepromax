package com.wangxu.d5_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("file-io-app\\src\\wangxu02.txt");
        byte[] buffer = new byte[3];
//        System.out.println(is.read(buffer));
//        String s1 = new String(buffer);
//        System.out.println(s1);
//        System.out.println(is.read(buffer));
//        String s2 = new String(buffer, 0, 2);
//        System.out.println(s2);
        // 使用循环优化
        int len; // 记住每次读取多少个字节
        while ((len = is.read(buffer)) != -1){
            String s = new String(buffer, 0, len);
            System.out.println(s);
        }
        is.close();
    }
}
