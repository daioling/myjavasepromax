package com.wangxu.d5_byte_stream;

import java.io.*;

/**
 * 目标：使用字节流完成对文件的复制操作
 */
public class CopyTest6 {
    public static void main(String[] args) throws Exception {
        // 1.需求：复制文件
        // 1.创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("E:\\java\\code\\document\\aaa\\bbb\\1.asdasdda.txt");
        // 2.创建一个字节流输出流管道与源文件接通
        OutputStream os = new FileOutputStream("E:\\java\\code\\document\\ddd\\copy.txt");
        // 3.找到文件长度
        // File file = new File("E:\\java\\code\\document\\aaa\\bbb\\1.asdasdda.txt");
        // long size = file.length();
        // byte[] len = new byte[(int) size];
        // int read = is.read(len);
        byte[] bytes = is.readAllBytes();
        os.write(bytes);
        os.close();
        is.close();

    }
}
