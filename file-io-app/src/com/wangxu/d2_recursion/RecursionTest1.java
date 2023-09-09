package com.wangxu.d2_recursion;

/**
 * 目标：认识一下递归的形式。
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        test1();
    }

    // 直接方法递归
    private static void test1() {
        System.out.println("-------test1--------");
        test1(); // 直接方法递归
    }

    // 间接方法递归
    private static void test2() {
        System.out.println("-------test2--------");
        test3(); // 间接方法递归
    }
    private static void test3() {
        test2(); // 间接方法递归
    }
}
