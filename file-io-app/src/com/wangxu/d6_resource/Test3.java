package com.wangxu.d6_resource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test3 {
    public static void main(String[] args) {
        try (

                // 1.创建一个字符输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("file-io-app\\src\\wangxu04.txt", true);
                ) {
            // 2.开始写字节数据出去
            os.write(97);
            os.write('b');
            // 换行  /r/n
            byte[] bytes1 = "\r\n".getBytes();
            os.write(bytes1);
            byte[] bytes = "我爱你中国abc".getBytes();
            os.write(bytes);
            os.write(bytes, 0, 15);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
