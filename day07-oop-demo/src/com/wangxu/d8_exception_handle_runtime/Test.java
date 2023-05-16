package com.wangxu.d8_exception_handle_runtime;

public class Test {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。");
        try {
            chu(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束。。。。。。");
    }

    private static void chu(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
