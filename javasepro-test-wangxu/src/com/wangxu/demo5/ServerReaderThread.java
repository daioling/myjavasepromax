package com.wangxu.demo5;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 处理信息：注册 登录。
        try {
            // 1.得到输入流
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            // 2.读信息类型
            int type = dis.readInt();
            switch (type){
                case 1:
                    // 注册
                    register();
                    break;
                case 2:
                    // 登录
                    login();
                    break;
            }
        } catch (Exception e) {
            System.out.println("有人离线了~~~~~");
        }
    }
    private void register() throws Exception {
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String registerName = dis.readUTF();
        String password = dis.readUTF();

        // 开始做判断，登录名是否重复的问题。
        String result = "注册成功";
        if (exist(registerName)){
            result = "注册失败，您注册的登录名称已被占用！";
        }else {
            Properties properties = new Properties();
            properties.setProperty(registerName, password);
            properties.store(new FileWriter(Server.USERS_FILE_PATH, true), "");
        }
        // 响应结果回去
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(result);
        dos.flush();
    }
    private void login() throws Exception {
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String loginName = dis.readUTF();
        String password = dis.readUTF();

        String result = "登陆成功";
        File file = new File(Server.USERS_FILE_PATH);
        if (file.exists()){
            // 提取全部的登录名称，看是否存在当前这个登录名
            Properties properties = new Properties();
            properties.load(new FileReader(file));
            // 校验登录名：根据登录名获取密码
            String okPassword = properties.getProperty(loginName);
            if (okPassword == null){
                result = "登录名称错误";
            }else {
                // 比较密码
                if (okPassword.equals(password)){
                    result = "密码错误";
                }
            }
        }else {
            result = "当前无任何用户信息，无法登录！";
        }

        // 响应result即可
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(result);
        dos.flush();

    }
    public boolean exist(String registerName) throws Exception{
        File file = new File(Server.USERS_FILE_PATH);
        if (file.exists()){
            // 提取全部的登录名，看是否存在当前这个登录名称
            Properties properties = new Properties();
            properties.load(new FileReader(file));
            // 判断键是否存在
            if (properties.containsKey(registerName)){
                return true;
            }
        }
        return false;
    }

}
