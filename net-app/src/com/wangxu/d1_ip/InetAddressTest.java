package com.wangxu.d1_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 目标：掌握InetAddress类的使用
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        // 1.获取本机的IP地址对象。
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostAddress());
        System.out.println(ip1.getHostName());

        // 2.获取指定IP或者域名的IP地址对象。
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostAddress());
        System.out.println(ip2.getHostName());

        // 相当于 ping 命令的代码
        System.out.println(ip2.isReachable(6000));
    }
}
