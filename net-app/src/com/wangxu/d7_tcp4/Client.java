package com.wangxu.d7_tcp4;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目标: 完成tcp通讯快速入门-客户端开发：实现一收一发。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建socket对象，并同时请求与服务端程序的连接。
        Socket socket = new Socket("127.0.0.1", 8888);

        // 创建一个独立的线程，负责随机从socket中接收服务端发送过来的信息。
        new ClientReaderThread(socket).start();

        // 2.从socket通讯管道中获得一个字节输出流，用来发数据给服务端程序。
        OutputStream os = socket.getOutputStream();

        // 3.将低级的字节输出流包装为数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("请说：");
            String msg = sc.nextLine();

            if ("exit".equals(msg)) {
                System.out.println("欢迎下次光临！退出成功！");
                dos.close();
                socket.close();
                break;
            }
            // 4.开始写数据出去
            dos.writeUTF(msg);
            dos.flush();// 刷新数据
        }
    }
}
