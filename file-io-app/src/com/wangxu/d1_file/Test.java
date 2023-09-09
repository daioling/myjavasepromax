package com.wangxu.d1_file;

import java.io.File;

/**
 * 目标：改变某个文件夹下视频的序号，要求从19开始。
 */

public class Test {
    public static void main(String[] args) {
        File dir = new File("E:\\java\\code\\document");

        // 1.拿到全部的文件，一级文件对象
        File[] videos = dir.listFiles();

        // 2.一个一个的找
        for (File video : videos) {
            // 3.拿到他的名字，改成新名字
            String name = video.getName();
            String index = name.substring(0, name.indexOf("."));
            String lastName = name.substring(name.indexOf("."));
            String newName = (Integer.valueOf(index) + 18) + lastName;

            // 4.正式改名
            video.renameTo(new File(dir, newName));
        }
    }
}
