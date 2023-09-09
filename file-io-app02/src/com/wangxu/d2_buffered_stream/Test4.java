package com.wangxu.d2_buffered_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 目标：恢复出师表的顺序到新文件中。
 */
public class Test4 {
    public static void main(String[] args) {
        try (
                // 2.创建缓冲字符输入流管道与源文件接通
                BufferedReader br = new BufferedReader(new FileReader("file-io-app02/src/csb.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("file-io-app02/src/newcsb.txt"));
        ){
            // 1.定义一个ArrayList集合存储每段内容
            List<String> data = new ArrayList<>();
            // 3.按照要求读取每段，存入集合中
            String line;
            while ((line = br.readLine()) != null){
                data.add(line);
            }
            // 4.对List集合中的每段文章进行排序。
            Collections.sort(data);
            System.out.println(data);
            // 5.遍历List集合的每段内容，依次写出去到新文件中。
            for (String ln : data) {
                bw.write(ln);
                bw.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
