package com.wangxu.d3_thread_safe;

public class Account {
    private String cardID; // 卡号
    private double money; // 余额

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    public Account() {
    }
    // 小明 小红同时过来
    public void drawMoney(double money) {
        // 明确是谁来取钱？
        String name = Thread.currentThread().getName();
        // 1.判断余额是否足够
        if (this.money == money){
            System.out.println(name + "来取钱" + money + "成功！");
            this.money -= money;
            System.out.println(name + "来取钱后，余额剩余" + this.money + "元");
        }else {
            System.out.println(name + "来取钱： 余额不足~");
        }
    }
    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
