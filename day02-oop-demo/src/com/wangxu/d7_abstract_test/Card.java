package com.wangxu.d7_abstract_test;

public abstract class Card {
    private String userName;
    private double money;

    public abstract void pay(double money);
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}