package com.wangxu.d2_thread_api;

/**
 * 1.让子类继承Thread线程类
 */
public class MyThread extends Thread {
    // 2.必须重写Thread类的run方法
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(t.getName() + "子线程MyThread输出：" + i);
        }
    }
}
