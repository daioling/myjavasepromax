package com.wangxu.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 目标：完成UDP通讯快速入门-服务器端开发
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建一个服务端对象（创建一个接韭菜的人）  注册端口
        DatagramSocket socket = new DatagramSocket(6666);

        // 2.创建一个数据包对象，用于接收数据的（创建一个用来装数据的韭菜盘子）
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        System.out.println("服务端已启动！");
        while (true) {
            // 3.开始正式使用数据包来接收客户端发来的数据
            socket.receive(packet);
            // 4.从字节数组中，把接收到的数据直接打印出来v
            // 接收多少就倒出多少
            // 获取本次数据包接收了多少数据。
            int length = packet.getLength();
            String rs = new String(buffer, 0, length);

            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());

            System.out.println(rs);
            System.out.println("-----------------------------------");
        }

    }
}
