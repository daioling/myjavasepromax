package com.wangxu.d3_transform_stream;

import java.io.*;

/**
 * 目标：掌握字符输入转换流的作用。
 */
public class InputStreamReaderTest1 {
    public static void main(String[] args) {
        try (
                // 1.得到文件的原始字节流（GBK的字节流形式）
                InputStream is = new FileInputStream("file-io-app02\\src\\wangxu_lb.txt");
                // 2.把原始字节输入流按照指定的字符集编码转换成字符输入流
                Reader isr = new InputStreamReader(is, "GBK");
                // 3.包装
                BufferedReader br = new BufferedReader(isr);
                ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
