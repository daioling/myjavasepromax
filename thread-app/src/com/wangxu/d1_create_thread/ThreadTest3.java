package com.wangxu.d1_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 目标：掌握线程的创建方式三：实现Callable接口。
 */
public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        // 3.创建一个Callable的对象。
        Callable<String> call = new MyCallable(100);
        // 4.把Callable对象封装成一个FutureTask对象（任务对象）
        // 未来任务对象的作用？
          // a.是一个任务对象，实现了Runnable对象。
          // b.可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后
        FutureTask<String> f1 = new FutureTask<>(call);
        // 5.把任务对象交给一个Thread对象
        new Thread(f1).start();
        // 6.获取线程执行完毕后返回结果
        String rs = f1.get();
        System.out.println(rs);
    }
}
