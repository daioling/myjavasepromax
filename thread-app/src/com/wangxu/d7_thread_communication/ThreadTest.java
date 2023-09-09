package com.wangxu.d7_thread_communication;

/**
 * 目标：了解一下线程通讯。
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 需求：3个生产者线程，负责生产包子，每个线程每次自能生产1个包子放在桌子上
        // 2个消费者线程负责吃包子，没人每次只能从桌子上拿一个包子吃。
        Desk desk = new Desk();
        // 创建3个生产者线程（3个厨师）
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师1").start();
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师2").start();
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "厨师3").start();
        // 创建2个消费者线程（2个消费者）
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "消费者1").start();
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "消费者2").start();
    }
}
