package com.wangxu.d6_data_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 目标：数据输出流
 */
public class DataOutputStreamTest1 {
    public static void main(String[] args) {
        try (
                // 1.创建一个数据输出流包装低级的字节输出流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("file-io-app02/src/wangxu06.txt"));

        ){
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("黑马程序员");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
