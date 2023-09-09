package com.wangxu.d7_tcp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread (Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true){
                try {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                    // 将这个信息发给全部客户端进行接收。
                    sendMsgToAll(msg);

                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress() + "离线了！");
                    Server.onlineSockets.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void sendMsgToAll(String msg) throws IOException {
        for (Socket onlineSocket : Server.onlineSockets) {
            OutputStream os = onlineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
