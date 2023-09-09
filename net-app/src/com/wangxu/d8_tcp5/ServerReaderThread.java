package com.wangxu.d8_tcp5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        // 立即响应一个网页内容："黑马程序员"给浏览器展示。
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 ok");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("<div style='color:red;font-size;120px;text-align:center'> 黑马程序员66666 </div>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
