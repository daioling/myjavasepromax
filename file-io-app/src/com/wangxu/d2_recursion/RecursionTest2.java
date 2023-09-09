package com.wangxu.d2_recursion;

import java.util.Scanner;

/**
 * 目标：掌握递归的应用，执行流程和算法思想。
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入所求整数的阶乘：");
        int n = sc.nextInt();
        System.out.println(n + "的阶乘是：" + f(n));
    }

    private static int f(int n) {
        if(n == 1){
            return 1;
        }else {
            return f(n - 1) * n;
        }
    }
}
