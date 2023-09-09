package com.wangxu.d2_thread_api;

import com.wangxu.d2_thread_api.MyThread;

/**
 * 目录：掌握线程的创建方式之一：继承Thread类
 */
public class ThreadTest1 {
    // main方法是由一条默认的主线程负责执行。
    public static void main(String[] args) {
        // 3.创建MyThread线程类的对象代表一个线程
        Thread t1 = new MyThread("一号线程");
        // 4.启动线程（自动执行run方法的）
        t1.setName("一号线程");
        t1.start();
        Thread t2 = new MyThread("二号线程");
        // 4.启动线程（自动执行run方法的）
        t2.start();

        // 主线程对象名称
        // 哪个线程执行它，他就会得到哪个线程对象。
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程main输出：" + i);
        }
    }
}
