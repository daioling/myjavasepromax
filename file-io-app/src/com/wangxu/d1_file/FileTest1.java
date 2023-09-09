package com.wangxu.d1_file;

import java.io.File;

/**
 * 目标：掌握File创建对象，代表具体文件的方案。
 */
public class FileTest1 {
    public static void main(String[] args) {
        // 1. 创建一个File对象，指代某个具体的文件。
        // 路径分割符
        // 方法一：
//        File f1 = new File("E:\\java\\code\\document\\abc.txt");
        // 方法二：
//        File f1 = new File("E:/java/code/document/abc.txt");
        // 方法三：
        File f1 = new File("E:" + File.separator + "java" + File.separator + "code" + File.separator + "document" + File.separator + "abc.txt");
        // 文件大小
        System.out.println(f1.length());

        File f2 = new File("E:/java/code/document");
        System.out.println(f2.length());

        // 注意：File对象可以指代一个不存在的文件路径
        File f3 = new File("E:/java/code/document/sss.txt");
        System.out.println(f3.length());
        // 判断文件是否存在
        System.out.println(f3.exists());

        // 现在要定位的文件是在模块中的，应该怎么定位呢？
        // 绝对路径：带盘符的
        // File f4 = new File("E:\\java\\code\\myjavasepromax\\file-io-app\\src\\wangxu.txt");
        File f4 = new File("file-io-app\\src\\wangxu.txt");
        System.out.println(f4.length());
    }
}
