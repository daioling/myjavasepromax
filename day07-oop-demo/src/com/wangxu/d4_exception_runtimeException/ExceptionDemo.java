package com.wangxu.d4_exception_runtimeException;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。。");
        /**
         *  1.数组索引越界异常 : ArrayIndexOutOfBoundsException
         */
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
//        System.out.println(arr[4]); // 运行出错，程序终止
        /**
         *  2.空指针异常 : NullPointerException 直接输出没有问题。但是调用空指针的变量的功能就会报错！！
         */
        String name = null;
        System.out.println(name); // null
//        System.out.println(name.length()); // 运行出错，程序终止
        /**
         *  3.类型转换异常 : ClassCastException
         */
        Object o = 23;
//        String s = (String) o; // 运行出错，程序终止
        /**
         *  5.数学操作异常 : ArithmeticException
         */
//        int c = 10 / 0; // 运行出错，程序终止
        /**
         *  6.数字转换异常 : NumberFormatException
         */
        String number = "23";
        String number2 = "23aabbcc";
        Integer it = Integer.valueOf(number);
        System.out.println(it + 1);
//        Integer it2 = Integer.valueOf(number2);// 运行出错，程序终止
        System.out.println("程序结束。。。。。");
    }
}
