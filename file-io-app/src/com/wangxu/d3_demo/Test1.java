package com.wangxu.d3_demo;

public class Test1 {
    public static int totalNumber; //总酒数
    public static int lastBottleNumber; //手里剩下的总瓶数
    public static int lastCoverNumber; //手里剩下的总瓶盖数
    public static void main(String[] args) {
        // 啤酒问题：啤酒两元一瓶，4个盖子可以换一瓶，两个空瓶子可以换一瓶，请问10元可以喝多少呢？
        buy(10);
        System.out.println("总数：" + totalNumber);
        System.out.println("剩余盖子数：" + lastCoverNumber);
        System.out.println("剩余瓶：" + lastBottleNumber);
    }

    private static void buy(int money) {
        // 1.先买啤酒
        int allMoney = 0;
        int buyNumber = money / 2;
        allMoney += money % 2;
        totalNumber += buyNumber;
        // 2.将盖子和瓶子换成钱继续买
        int allBottleNumber = buyNumber + lastBottleNumber;
        int allCoverNumber = buyNumber + lastCoverNumber;
        if(allBottleNumber >= 2){
            allMoney += (allBottleNumber / 2) * 2;
        }
        lastBottleNumber = allBottleNumber % 2;
        if(allCoverNumber >= 4){
            allMoney += (allCoverNumber / 4) * 2;
        }
        lastCoverNumber = allCoverNumber % 4;
        if(allMoney >= 2){
            buy(allMoney);
        }
    }
}
