package com.wangxu.d1_char_stream;

import java.io.FileReader;
import java.io.Reader;

/**
 * 目标：掌握文件字符输入流每次读取一个字符。
 */
public class FileReaderTest1 {
    public static void main(String[] args) {
        try (
                // 1.创建一个文件字符输入流管道与源文件接通
                Reader r = new FileReader("file-io-app02\\src\\wangxu01.txt")
        ){
            // 2.读取文本文件的内容
//            int c; //记住每次读取的字符编号
//            while ((c = r.read()) != -1){
//                System.out.print((char) c);
//            }
            char[] buffer = new char[3];
            int len;
            while ((len = r.read(buffer)) != -1){
                System.out.print(new String(buffer, 0, len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
