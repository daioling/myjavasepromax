package com.wangxu.d2_recursion;

import java.io.File;

public class RecursionTest5 {
    public static void main(String[] args) {
        searchFile(new File("E:/"), "QQUninst.exe");
    }

    /**
     * 去目录下搜索某个文件
     * @param dir  目录
     * @param fileName  搜索文件名称
     */
    public static void searchFile(File dir, String fileName){
        // 1.将非法情况拦截
        if (dir == null || !dir.exists() || dir.isFile()) {
            return; // 代表无法搜索
        }

        // 2.dir 不是null，存在，一定是目录对象
        // 获取当前目录下的全部一级文件
        File[] files = dir.listFiles();

        // 3.判断当前目录下是否存在一级文件，以及是否可以拿到一级文件对象
        if (files != null && files.length > 0)  {
            // 4.遍历全部一级文件对象
            for (File f : files) {
                // 5.判断这个文件是否是我们要找到文件
                if (f.isFile()){
                    // 是文件， 判断文件是否是我们要找到
                    if (f.getName().equals(fileName)){
                        System.out.println("找到了：" + f.getAbsolutePath());
                    }
                }else {
                    searchFile(f, fileName);
                }
            }
        }
    }
}
