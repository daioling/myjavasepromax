package com.wangxu.d2_reflect;

/**
 * 目标：获取class对象。
 */
public class Test1Class {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方法一：
        Class c1 = Student.class;
        System.out.println(c1.getName()); // 全类名
        System.out.println(c1.getSimpleName()); // 简名

        // 方法二：
        Class c2 = Class.forName("com.wangxu.d2_reflect.Student");
        System.out.println(c1 == c2);

        // 方法三：
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);
    }
}
