package com.wangxu.d4_proxy;

public class Test {
    public static void main(String[] args) {
        BigStar zls = new BigStar("赵露思");
        Star starProxy = ProxyUtil.createProxy(zls);

        String sing = starProxy.sing("偷偷藏不住！");
        System.out.println(sing);
        starProxy.dance();
    }
}
