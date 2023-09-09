package com.wangxu.d7_object_stream;

import java.io.Serializable;

public class Use implements Serializable {
    private String loginName;
    private String userName;
    private int age;
    // 加入修饰符transient  成员变量将不参与序列化
    private transient String password;

    public Use() {
    }

    public Use(String loginName, String userName, int age, String password) {
        this.loginName = loginName;
        this.userName = userName;
        this.age = age;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Use{" +
                "loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
