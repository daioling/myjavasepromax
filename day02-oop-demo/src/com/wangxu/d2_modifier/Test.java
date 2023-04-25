package com.wangxu.d2_modifier;

public class Test {
    public static void main(String[] args) {
        // 目标：讲解权限修饰符的修饰范围。 明确每种修饰后的作用范围。
        Fu fu = new Fu();
        //fu.privateMethod(); 私有的只可以同包类访问
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}