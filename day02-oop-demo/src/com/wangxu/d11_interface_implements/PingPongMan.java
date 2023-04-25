package com.wangxu.d11_interface_implements;

public class PingPongMan implements SportMan{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("跑步");
    }

    @Override
    public void competition() {
        System.out.println("比赛");
    }
}

