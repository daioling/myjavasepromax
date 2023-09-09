package com.wangxu.d1_create_thread;

/**
 * 1.让子类继承Thread线程类
 */
public class MyThread extends Thread {
    // 2.必须重写Thread类的run方法
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程MyThread输出：" + i);
        }
    }
}
