package com.wangxu.d3_polymorphic_test;

public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }
    public Mouse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void dbClick(){
        System.out.println(name + "一键三连，点点关注！");
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

