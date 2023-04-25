package com.wangxu.d7_abstract_test;

public class GoldCard extends Card{
    @Override
    public void pay(double money) {
        System.out.println("您当前消费：" + money + "元");
        System.out.println("您当前余额是：" + super.getMoney() + "元");
        double re = money * 0.8;
        System.out.println("您实际支付：" + re);
        super.setMoney(super.getMoney() - re);
    }
}