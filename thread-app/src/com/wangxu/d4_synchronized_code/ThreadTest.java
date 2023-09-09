package com.wangxu.d4_synchronized_code;

/**
 * 目标：模拟线程安全问题
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 1创建一个账户对象，代表两个人的共享账户。
        Account account = new Account("ICBC-110", 100000);
        // 2.创建两个线程，分别代表小明  小红，再去同一个账户对象中取钱10万。
        new DrawThread(account, "小明").start();
        new DrawThread(account, "小红").start();
        // 1创建一个账户对象，代表两个人的共享账户。
        Account account2 = new Account("ICBD-110", 100000);
        // 2.创建两个线程，分别代表小明  小红，再去同一个账户对象中取钱10万。
        new DrawThread(account2, "小黑").start();
        new DrawThread(account2, "小白").start();
    }
}
