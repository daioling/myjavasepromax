package com.wangxu.d10_test;

import com.wangxu.d9_tuozhan.MyRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        // 目标：有 100 份礼品，小明，小红两人同时发送，当剩下的礼品小于10份的时候则不在送出
        //       利用多线程模拟该过程并将线程名称打印出来，并最后在控制台分别打印小红，小明各自送出多少份礼物。

        // 1.拿100份礼品到程序中来
        List<String> gift = new ArrayList<>();
        String[] names = {"口红", "包包", "鲜花", "剃须刀", "皮带", "手表"};
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            gift.add(names[r.nextInt(names.length)] + (i + 1));
        }
        System.out.println(gift);
        System.out.println(gift.size());

        // 2.定义线程类，创建线程对象，去集合中拿礼物给别人
        SendThread xh = new SendThread(gift, "小红");
        SendThread xm = new SendThread(gift, "小明");
        xh.start();
        xm.start();
        xh.join();
        xm.join();
        System.out.println("小红发放礼物数量为： " + xh.getCount());
        System.out.println("小明发放礼物数量为： " + xm.getCount());
    }
}
