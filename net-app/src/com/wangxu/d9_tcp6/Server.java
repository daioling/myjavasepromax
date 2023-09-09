package com.wangxu.d9_tcp6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 目标：完成TCP通信快速入门-服务端开发：要求实现与多个客户端同时通信。
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务器启动成功-----");
        // 1.创建一个ServerSocket的对象，同时为服务器注册端口。
        ServerSocket serverSocket = new ServerSocket(8080);

        // 创建一个线程池，负责处理通信管道任务。
        ThreadPoolExecutor pool = new ThreadPoolExecutor(8 * 2, 8 * 2, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            // 2.使用accept方法，等待客户端的连接
            Socket socket = serverSocket.accept();
            System.out.println("有人上线了：" + socket.getRemoteSocketAddress());

            // 3.把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            pool.execute(new ServerReaderRunnable(socket));

        }
    }
}
