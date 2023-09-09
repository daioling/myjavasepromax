package com.wangxu.d7_tcp4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 目标：完成TCP通信快速入门-服务端开发：实现一发一收
 */
public class Server {
    public static List<Socket> onlineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        // 1.创建ServerSocket的对象,同时为服务端注册端口。
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true){
            // 2.使用ServerSocket对象，调用accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            onlineSockets.add(socket);
            System.out.println(socket.getRemoteSocketAddress() + "上线了！");
            // 3.将这个客户端对应的socket通信管道，交给一个独立的线程负责
            new ServerReaderThread(socket).start();
        }

    }
}
