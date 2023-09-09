package com.wangxu.d7_object_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2ObjectInputStream {
    public static void main(String[] args) {
        try (
                // 2.创建一个对象字节输出流包装原始的字节输出流。
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file-io-app02/src/wangxu07.txt"));
        ){
            // 1.创建一个Java对象。            // 3.序列化对象到文件中去
            Use u = (Use) ois.readObject();
            System.out.println(u);
            System.out.println("队列话成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
