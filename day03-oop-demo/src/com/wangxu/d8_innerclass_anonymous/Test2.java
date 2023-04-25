package com.wangxu.d8_innerclass_anonymous;

/**
 *  掌握内部类的使用形式
 */

public class Test2 {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生在快乐的游泳");
            }
        };
        go(s);
    }

    /**
     * 学生  老师  运动员 可以一起参加游泳比赛
     */
    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}


interface Swimming{
    void swim();
}
