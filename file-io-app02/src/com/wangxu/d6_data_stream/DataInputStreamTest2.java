package com.wangxu.d6_data_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest2 {
    public static void main(String[] args) {
        try (
                // 1.创建一个数据输出流包装低级的字节输出流
                DataInputStream dis = new DataInputStream(new FileInputStream("file-io-app02/src/wangxu06.txt"));

        ){
            int i = dis.readInt();
            System.out.println(i);
            double d = dis.readDouble();
            System.out.println(d);
            boolean b = dis.readBoolean();
            System.out.println(b);
            String sr = dis.readUTF();
            System.out.println(sr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
