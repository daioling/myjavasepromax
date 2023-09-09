package com.wangxu.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
    // 目标：完成幸存者案例。
    // 1.由于每个囚犯是一个对象，我们需要每个囚犯的编号和位置，所以我们把囚犯定义为对象来实现这个案例。
    // 2.创建100个囚犯，依次占位，并为其赋值编号（1-200之间的随机数，不能重复）
    public static List<People> peoples = new ArrayList<>();

    public static void main(String[] args) {
        Random r = new Random();
        // 3.循环100次，创建100个囚犯，存入集合
        for (int i = 0; i <= 100; i++) {
            while (true) {
                int code = r.nextInt(200) + 1;
                // 判断这个编号是否是唯一的。
                if (isCanUse(code)) {
                    People p = new People(code, i);
                    peoples.add(p);
                    break;
                }
            }
        }
        System.out.println("囚犯占位：" + peoples);
        while (peoples.size() > 1){
            List<People> tempPeoples = new ArrayList<>();
            for (int i = 1; i < peoples.size(); i += 2){
                People p = peoples.get(i);
                tempPeoples.add(p);
            }
            peoples = tempPeoples;
        }
        People luckPeople = peoples.get(1);
        System.out.println(luckPeople);
    }

    public static boolean isCanUse(int code) {
        for (People people : peoples) {
            if (people.getCode() == code) {
                return false;
            }
        }
        return true;
    }
}
