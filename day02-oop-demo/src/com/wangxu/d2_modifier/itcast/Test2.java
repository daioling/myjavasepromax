package com.wangxu.d2_modifier.itcast;

import com.wangxu.d2_modifier.Fu;

public class Test2 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //fu.privateMethod();
        //fu.method(); 不同包不可以访问(同包才可访问)
        //fu.protectedMethod(); 不同包子类才可以访问
        fu.publicMethod();
    }
}
