package com.wangxu.d3_final;

public class Test {
    public static void main(String[] args) {
        //目标：记住final语法。
        // 1.final修饰类，类不能被继承。

    }
//    class Wolf extends Animal{
//
//    }
//    final class Animal{
//
//    }
    //给工具类加上final修饰（显得专业） public final class ItwangxuUtil{}

    // 2.final修饰方法，方法不能被重写

    class Student extends People{
        public void eat(){
            System.out.println("学生吃的东西很多！");
        }
    }
    class People{
        public  void eat(){ //final加上就报错
            System.out.println("人都要吃东西！");
        }
    }
    // 2.final修饰变量，变量有且只可以赋值一次

}
