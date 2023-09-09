package com.wangxu.d5_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 目标：掌握文件字节输出流FileOutputStream的使用
 */
public class FileInputStreamTest5 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个字符输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("file-io-app\\src\\wangxu04.txt", true);
        // 2.开始写字节数据出去
        os.write(97);
        os.write('b');
        // 换行  /r/n
        byte[] bytes1 = "\r\n".getBytes();
        os.write(bytes1);
        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);
        os.write(bytes, 0, 15);
        os.close();
    }
}
