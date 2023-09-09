package com.wangxu.d2_buffered_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedReaderTest3 {
    public static void main(String[] args) {
        try (
                // 1.创建一个文件输出流管道与目标文件接通
                Writer fw = new FileWriter("file-io-app02\\src\\wangxu03.txt");
                BufferedWriter bfw = new BufferedWriter(fw);
        ){
            // 2.写一个字符出去
            bfw.write(97);
            bfw.write('a');
            bfw.write('旭');
            bfw.write('旭');
            // 3.写一个字符串出去
            bfw.write("我爱你中国");
            // 4.写字符串的一部分出去
            bfw.write("我爱你中国", 0, 5);
            // 换行
//            fw.write("\r\n");
            bfw.newLine();
            // 5.写字符数组的一部分出去
            char[] buffer= {'黑', '马', 'a', 'b', 'c'};
            bfw.write(buffer);
            // 刷新数据流
            bfw.flush();
            bfw.write(buffer, 0, 3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
