package com.wangxu.d1_static;

public class StaticFieldDemo1 {
    public static void main(String[] args) {
        //理解static修饰成员变量的作用和访问特点
        System.out.println(User.onlineNumber);
        User u = new User();
        System.out.println(u.onlineNumber);
    }
}
