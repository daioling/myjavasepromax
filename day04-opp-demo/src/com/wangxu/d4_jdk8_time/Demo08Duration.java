package com.wangxu.d4_jdk8_time;

import java.time.LocalDateTime;

public class Demo08Duration {
    public static void main(String[] args) {
        //本地时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        //出生日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(2000, 2, 22,20,00,00);
    }
}
