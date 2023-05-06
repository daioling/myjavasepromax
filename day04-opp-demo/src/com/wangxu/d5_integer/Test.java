package com.wangxu.d5_integer;

/**
 *  目标 ：理解包装类的概念，并使用。
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        Integer a2 = a;// 自动装箱
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

        Integer t = 100;
        int t1 = t;// 自动拆箱
        System.out.println(t);
        System.out.println(t1);
        System.out.println("------------------------");
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs + 1);
        String rs1 = Integer.toString(i3);
        System.out.println(rs1 + 1);

        //可以直接加字符串得到字符串类型
        Integer i4 = 23;
        String s = 23 + "";
        System.out.println(s + 1);
        System.out.println("------------------------");
        //转换为整数
        String age = "23";
//        int age1 = Integer.parseInt(age );
        int age1 = Integer.valueOf(age );
        System.out.println(age1 + 1);
        //转换为小数
        String score = "89.5";
//        int score1 = Integer.parseInt(score);
        double score1 = Double.valueOf(score);
        System.out.println(score1 + 1);


    }
}
