package com.wangxu.d9_tuozhan;

public class MyRunnable implements Runnable{
    private int count; // 记录浏览人次

    @Override
    public void run() {
        // 100次
        for (int i = 0; i < 100; i++) {
            // 悲观锁
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "count ======>" + (++count));
            }
        }
    }
}
