package com.wangxu.d9_lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 目标 ：学会使用lambda的标准格式简化匿名内部类的代码形式
        // lambda只能简化接口中只有一个抽象方法的匿名内部类形式
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳贼快！");
            }
        };
        go(s1);
        //简写
        Swimming s2 = () -> {System.out.println("老师-----------------！");};
        go(s2);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("111111111111111111111111");
            }
        });
        go(()-> {System.out.println("学生游泳贼快");});
    }
    public static void go(Swimming s){
        System.out.println("开始游泳");
        s.swim();
        System.out.println("结束游泳");
    }
}

@FunctionalInterface // 一旦加上这个注解必须是函数式接口， 里面只能有一个抽象方法。
interface Swimming{
    void swim();
}