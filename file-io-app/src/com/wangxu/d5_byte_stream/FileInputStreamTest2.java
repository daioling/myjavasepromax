package com.wangxu.d5_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件字节输入流管道，与源文件接通。
//        InputStream is = new FileInputStream(new File("file-io-app\\src\\wangxu01.txt"));
        // 简化写法，推荐使用
        InputStream is = new FileInputStream("file-io-app\\src\\wangxu01.txt");

        // 2.使用循环改造上述代码
        // 每次读取一个字节返回，如果没有数据后返回-1
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }
        // 上述方法读取性能很差
        // 读取汉字会出现乱码，并且是无法避免的。
        // 流使用完璧后必须关闭
        is.close();

    }
}
