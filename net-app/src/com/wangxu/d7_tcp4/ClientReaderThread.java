package com.wangxu.d7_tcp4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread (Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress() + "自己离线了！");
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
