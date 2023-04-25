package com.wangxu.extends_test;

public class Test {
    public static void main(String[] args) {
        //继承的设计与思想
        Student student = new Student();
        student.setName("蜘蛛精");
        student.setAge(999);
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
