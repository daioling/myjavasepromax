package com.wangxu.d3_polymorphic_test;

public class KeyBoard implements USB{
    private String name;
    public KeyBoard(){
    }
    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void keyDown(){
        System.out.println(name + "敲击了， 来了。");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接了电脑~");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出~");
    }
}

