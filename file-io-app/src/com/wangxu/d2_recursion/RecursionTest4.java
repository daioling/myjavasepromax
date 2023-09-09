package com.wangxu.d2_recursion;

import java.util.Scanner;

/**
 * 目标：猴子吃桃问题
 */
public class RecursionTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入猴子吃的天数：");
        int n = sc.nextInt();
        System.out.println(t(n));
    }

    private static int t(int n) {
        if (n == 10) {
            return 1;
        } else {
            return 2 * t(n + 1) + 2;
        }
    }
}
