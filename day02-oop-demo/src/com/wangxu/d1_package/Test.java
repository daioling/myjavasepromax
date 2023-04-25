package com.wangxu.d1_package;

import com.wangxu.d1_package.it1.Student;

//导包


public class Test {
    public static void main(String[] args) {
        // 1.同一个包下的类，互相可以直接访问
        System.out.println(User.onlineNumber);
        // 2.不同包下的类，必须先导包，才可以访问
        System.out.println(Student.onlineNumber);
        // 3.如果这个类中使用不同包下的相同类名，此时默认只能导入一个类的包，另一个类要使用全名访问。
        Student s = new Student();
    }
}
