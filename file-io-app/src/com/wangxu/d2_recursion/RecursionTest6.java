package com.wangxu.d2_recursion;

import java.io.File;

public class RecursionTest6 {
    public static void main(String[] args) {
        // 目标：删除非空文件夹。独立功能独立成为方法
        File dir = new File("E:\\java\\code\\document\\aaa");
        deleteDir(dir);
    }

    public static void deleteDir(File dir){
        if (dir == null || !dir.exists()){
            return;
        }
        if (dir.isFile()){
            dir.delete();
            return;
        }
        // 1.dir存在且是文件夹，拿里面的一级文件对象
        File[] files = dir.listFiles();
        if (files == null){
            return;
        }
        if (files.length == 0){
            dir.delete();
            return;
        }
        // 2.这是一个有内容的文件夹，干掉里面的内容，在干掉自己。
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }
        dir.delete();
    }
}
