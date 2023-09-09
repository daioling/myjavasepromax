package com.wangxu.d2_recursion;

import java.util.Scanner;

public class RecursionTest3 {
    /**
     * 目标：掌握递归的应用，执行流程和算法思想。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入所求整数的和：");
        int n = sc.nextInt();
        System.out.println(n + "的和是：" + f(n));
    }

    private static int f(int n) {
        if(n == 1){
            return 1;
        }else {
            return f(n - 1) + n;
        }
    }
}
