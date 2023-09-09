package com.wangxu.d9_tuozhan;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable2 implements Runnable{
    // 记录浏览人次
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        // 100次
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "count ======>" + count.incrementAndGet());
        }
    }
}
