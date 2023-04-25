package com.wangxu.d3_polymorphic_test;

public class Test {
    /**
     *  目标 ：USB设备模拟
     *  1. 定义USB接口 ：接入  拔出
     *  2. 定义两个USB现实类 ：键盘 鼠标
     *  3. 创建一个电脑对象，创建USB设备对象，安装启动
     */
    public static void main(String[] args) {
        Computer c = new Computer("外星人");
        c.start();
        USB u = new KeyBoard("双飞燕");
        c.installUSB(u);
        USB u2 = new Mouse("逻技鼠标");
        c.installUSB(u2);


    }
}
