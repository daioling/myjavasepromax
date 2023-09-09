package com.wangxu.d4_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 目标：掌握如何使用Java代码完成对字符串的编码和解码
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1. 编码
        String data = "a我b";
        byte[] bytes = data.getBytes(); // 默认是按照平台字符集（UTF-8）进行编码的
        System.out.println(Arrays.toString(bytes));

        // 按照指定字符串进行编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // 2.解码
        String s = new String(bytes);
        System.out.println(s);
        String s2 = new String(bytes1, "GBK");
        System.out.println(s2);
    }
}
