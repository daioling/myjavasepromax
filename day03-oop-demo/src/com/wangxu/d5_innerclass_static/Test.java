package com.wangxu.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.setName("张三");
        in.setAge(90);
        in.show();
    }
}
