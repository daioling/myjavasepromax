package com.wangxu.d12_math;

public class MathDemo {
    public static void main(String[] args) {
        // 1.取绝对值：返回正数
        System.out.println(Math.abs(10)); //10
        System.out.println(Math.abs(-10.3)); //10.3
        // 2.向上取整
        System.out.println(Math.ceil(4.0002)); //5
        // 3.向下取整
        System.out.println(Math.floor(4.99999)); // 4
        // 4.求指数次方
        System.out.println(Math.pow(2, 3)); //2^3 = 8
        // 5.四舍五入
        System.out.println(Math.round(4.4999)); //4
        System.out.println(Math.round(4.5111)); //5
        // 6.生成0.0-0.1随机数
        System.out.println(Math.random());
    }
}

