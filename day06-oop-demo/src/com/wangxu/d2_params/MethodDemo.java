package com.wangxu.d2_params;

import java.util.Arrays;

/**
 *  可变参数的作用：
 *      传输参数非常灵活，方便
 *      可以传输一个参数
 *      可以传输多个参数
 *      可以传输一个数组
 *  可变参数在方法内部本质上就是一个数组。
 *  可变参数注意事项
 *      1.一个形参列表中可变参数只能有一个！！
 *      2.可变参数必须放在形参列表的最后面！！
 */
public class MethodDemo {
    public static void main(String[] args) {
        sum(); // 1.不传参数
        sum(10); // 2.可以传一个参数
        sum(10, 20, 30); // 3.可以传多个参数
        sum(new int[]{10, 20, 30, 40, 50});// 4.可以传一个数组
    }
    public static void sum(int...nums){
        // 注意 ：可变参数在方法内部其实就是一个数组 nums
        System.out.println("元素个数：" + nums.length);
        System.out.println("元素内容：" + nums);
        System.out.println("元素内容" + Arrays.toString(nums));
    }
}
