package com.wangxu.d9_api_abject;

/**
 * 掌握object类中的 toString 方法的使用
 */
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("瑞昌", '男', 19);
        Student s2 = new Student("瑞昌", '男', 19);
        String rs = s.toString();
        System.out.println(rs);
        System.out.println(s);
        System.out.println(s.equals(s2));
    }
}
