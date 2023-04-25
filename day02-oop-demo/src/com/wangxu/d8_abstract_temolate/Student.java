package com.wangxu.d8_abstract_temolate;

public abstract class Student {
    public final void write(){ // 建议模板方法用final修饰,不能被重写。
        System.out.println("\t\t\t\t《我的爸爸》");
        System.out.println("第一段");
        System.out.println(writeMain());
        System.out.println("结尾");
    }
    public abstract String writeMain();
}

