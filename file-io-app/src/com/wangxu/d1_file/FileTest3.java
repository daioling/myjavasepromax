package com.wangxu.d1_file;

import java.io.File;
import java.io.IOException;

/**
 * 目标：掌握File创建和删除文件相关的方法。
 */
public class FileTest3 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个新的文件（文件内容为空），创建成功返回true，反之
        File f1 = new File("E:/java/code/document/bcd.txt");
        System.out.println(f1.createNewFile());
        // 2.用于创建文件夹，注意：只能创建一级文件夹
        File f2 = new File("E:/java/code/document/kkk");
        System.out.println(f2.mkdir());
        // 3.用于创建文件夹，注意：可以创建多级文件夹
        File f3 = new File("E:/java/code/document/111/222/333/444");
        System.out.println(f3.mkdirs());
        // 4.用于删除文件，或者空文件，注意：不能删除非空文件夹
        System.out.println(f1.delete());
        System.out.println(f2.delete());
        System.out.println(f3.delete());

    }
}
