package com.wangxu.d4_tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：完成TCP通信快速入门-服务端开发：实现一发一收
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建ServerSocket的对象,同时为服务端注册端口。
        ServerSocket serverSocket = new ServerSocket(8888);

        // 2.使用ServerSocket对象，调用accept方法，等待客户端的连接请求
        Socket socket = serverSocket.accept();

        // 3.从socket管道中得到一个字符输入流
        InputStream is = socket.getInputStream();

        // 4.将原始字符流包装为数据输入流。
        DataInputStream dis = new DataInputStream(is);

        // 5.使用数据输入流读取客户端发送过来的信息
        String rs = dis.readUTF();
        System.out.println(rs);

        // 其实我们可以获取客户端的IP地址
        System.out.println(socket.getRemoteSocketAddress());

        dis.close();
        socket.close();

    }
}
