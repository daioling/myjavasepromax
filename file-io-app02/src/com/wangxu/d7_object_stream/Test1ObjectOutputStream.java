package com.wangxu.d7_object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 目标：掌握对象字节输出流的使用，序列化对象
 */
public class Test1ObjectOutputStream {
    public static void main(String[] args) {
        try (
                // 2.创建一个对象字节输出流包装原始的字节输出流。
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file-io-app02/src/wangxu07.txt"));
                ){
            // 1.创建一个Java对象。
            Use u = new Use("admin", "张三", 32, "666888xyz");
            // 3.序列化对象到文件中去
            oos.writeObject(u);
            System.out.println("队列话成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
