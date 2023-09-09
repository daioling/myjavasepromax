package com.wangxu.d1_char_stream;

import java.io.FileWriter;
import java.io.Writer;

/**
 * 目标：掌握文件字符输出流，写字符数据出去
 */
public class FileReaderTest2 {
    public static void main(String[] args) {
        try (
                    // 1.创建一个文件输出流管道与目标文件接通
                    Writer fw = new FileWriter("file-io-app02\\src\\wangxu02.txt")
                ){
            // 2.写一个字符出去
            fw.write(97);
            fw.write('a');
            fw.write('旭');
            fw.write('旭');
            // 3.写一个字符串出去
            fw.write("我爱你中国");
            // 4.写字符串的一部分出去
            fw.write("我爱你中国", 0, 5);
            // 5.写字符数组的一部分出去
            char[] buffer= {'黑', '马', 'a', 'b', 'c'};
            fw.write(buffer);
            // 刷新数据流
            fw.flush();
            fw.write(buffer, 0, 3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
