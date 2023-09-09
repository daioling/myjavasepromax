package com.wangxu.demo3.Timer;

import java.util.Timer;

public class Start {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimeTask(), 0, 1000);// 每隔1秒执行一次new TimeTask() 里面的run方法
    }
}
