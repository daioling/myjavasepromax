package com.wangxu.d1_file;

import java.io.File;

/**
 * 目标：掌握File提供的遍历文件夹的方法
 */
public class FileTest4 {
    public static void main(String[] args) {
        // 1.获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回。
        File f1 = new File("E:\\java\\code\\myjavasepromax");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }
        // 2.（重点）获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回（重点）。
        File[] names2 = f1.listFiles();
        for (File name : names2) {
            System.out.println(name.getAbsolutePath());
        }
    }
}
