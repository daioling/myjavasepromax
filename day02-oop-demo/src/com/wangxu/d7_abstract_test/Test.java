package com.wangxu.d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        // 目标：学习一下抽象类的基本使用：做父类，被继承，重写抽象方法。
        GoldCard gc = new GoldCard();
        gc.setUserName("liuchang");
        gc.setMoney(10000);
        gc.pay(3000);
        System.out.println("剩余：" + gc.getMoney());
    }
}
