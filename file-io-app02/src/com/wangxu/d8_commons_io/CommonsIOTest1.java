package com.wangxu.d8_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIOTest1 {
    public static void main(String[] args) throws Exception {
        FileUtils.copyFile(new File("file-io-app02\\src\\wangxu07.txt"), new File("file-io-app02\\src\\a.txt"));
    }
}
