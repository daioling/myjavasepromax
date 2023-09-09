package com.wangxu.d3_transform_stream;

import java.io.*;

public class InputStreamReaderTest2 {
    public static void main(String[] args) {
        try (
                // 1.创建一个文件字节输出流
                OutputStream os = new FileOutputStream("file-io-app02\\src\\wangxu03.txt");
                Writer osw = new OutputStreamWriter(os, "UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                ){
            bw.write("我是中国人abc");
            bw.write("我是中国人123");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
