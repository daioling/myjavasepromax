package com.wangxu.d2_modifier.itcast;

import com.wangxu.d2_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //fu.protectedMethod();//创建父类对象会报错
        fu.publicMethod();
        Zi zi = new Zi();
        zi.protectedMethod();
        zi.publicMethod();
    }
}
