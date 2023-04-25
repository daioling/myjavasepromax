package com.wangxu.d8_innerclass_anonymous;

/**
 *   目标 ：学习匿名内部类的形式和特点
 */

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {//产生一个匿名内部类的对象
            //匿名内部类的对象类型相当于是当前new的那个类型对象的子类类型
            @Override
            public void run() {
                System.out.println("老虎跑的快~~~");
            }
        };
        a.run();
    }
}

//class Tiger extends Animal{
//
//    @Override
//    public void run() {
//        System.out.println("老虎跑的快~~~");
//    }
//}

abstract class Animal{
    public abstract void run();
}