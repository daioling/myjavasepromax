package com.wangxu.d8_tcp5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：完成TCP通信快速入门-服务端开发：要求实现与多个客户端同时通信。
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务器启动成功-----");
        // 1.创建一个ServerSocket的对象，同时为服务器注册端口。
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            // 2.使用accept方法，等待客户端的连接
            Socket socket = serverSocket.accept();
            System.out.println("有人上线了：" + socket.getRemoteSocketAddress());

            // 3.把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }
    }
}
