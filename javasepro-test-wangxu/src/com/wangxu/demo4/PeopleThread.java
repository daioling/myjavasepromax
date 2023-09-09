package com.wangxu.demo4;

import java.util.List;
import java.util.Random;

public class PeopleThread extends Thread{
    private List<Integer> moneys;
    private int totalMoney;
    public PeopleThread (List<Integer> moneys, String name) {
        super(name);
        this.moneys = moneys;
    }
    private Random r = new Random();

    @Override
    public void run() {
        // 100个线程来抢钱
        while (true){
            String name = Thread.currentThread().getName();
            synchronized (moneys){
                if (moneys.size() == 0){
                    break;
                }
                // 取红包给当前这个人
                int money = moneys.remove(r.nextInt(moneys.size()));
                System.out.println(name + "抢到：" + money);
                totalMoney += money;
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "PeopleThread{" +
                "moneys=" + moneys +
                ", totalMoney=" + totalMoney +
                ", r=" + r +
                '}';
    }
}
