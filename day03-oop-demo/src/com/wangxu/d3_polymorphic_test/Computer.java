package com.wangxu.d3_polymorphic_test;

import java.security.PublicKey;

public class Computer {
    private String name;

    public void start(){
        System.out.println(name + "电脑开机了~");
    }


    /**
     * 提供安装USB设备的入口
     */
    public void installUSB(USB km){
        km.connect();
        if(km instanceof KeyBoard){
            KeyBoard k = (KeyBoard) km;
            k.keyDown();
        }else if (km instanceof Mouse){
            Mouse m = (Mouse) km;
            m.dbClick();
        }
        km.unconnect();
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
