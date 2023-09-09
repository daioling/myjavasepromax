package com.wangxu.d7_thread_communication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    // 创建一个数组存放包子
    List<String> list = new ArrayList<>();

    public synchronized void put() {
        String name = Thread.currentThread().getName();
        try {
            // 判断桌子上是否有包子
            if (list.size() == 0){
                list.add(name + "做的肉包子");
                System.out.println(name + "做了一个肉包子~~~");
                Thread.sleep(2000);

                // 唤醒别人  等待自己
                this.notify();
                this.wait();
            }else {
                // 有包子  不做了
                // 唤醒别人  等待自己
                this.notify();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        String name = Thread.currentThread().getName();
        try {
            if (list.size() == 1){
                System.out.println(name + "吃了：" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notify();
                this.wait();
            }else {
                this.notify();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
