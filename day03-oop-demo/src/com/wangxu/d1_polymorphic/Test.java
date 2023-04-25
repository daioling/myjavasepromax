package com.wangxu.d1_polymorphic;

public class Test {
    /**
     *    目标 ： 认识多态，理解多态的形式和概念
     */
    public static void main(String[] args) {
        // 1.
        // 非多态的形式
        Dog d = new Dog();
        d.run();
        Tortoise t = new Tortoise();
        t.run();
        // 多态的形式 : 父类类型  对象，名称 = new 子类构造器;
        // 方法调用 : 编译看左边（父类中有的方法），运行看右边（子类中的重写方法）
        // 变量调用 : 编译看左边（父类中有的变量），运行看左边（父类中的变量）
        Animal a = new Dog();
        a.run();
        Animal b = new Tortoise();
        b.run();
        //强转方式
        if(a instanceof Dog){
            Dog dd = (Dog) a;
            //调用dog子类的独有方法
        }else if(a instanceof Tortoise){
            Tortoise tt = (Tortoise) a;
        }


    }
}
