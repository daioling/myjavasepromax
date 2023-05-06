package com.wangxu.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo3 {
    public static void main(String[] args) {
        Integer[] ages1 = {34, 25, 12, 42, 23};
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;// 降序
            }
        });
        Arrays.sort(ages1, (o1,o2) -> {return o1 - o2;});// 升序
        System.out.println(Arrays.toString(ages1));


        System.out.println("--------------------------");
        JFrame win = new JFrame("登录界面");
        JButton btn = new JButton("我是一个很大的按钮");
        btn.addActionListener((ActionEvent e) -> {System.out.println("有人点我");});
        win.add(btn);
        win.setSize(400, 300);
        win.setVisible(true); // 显示窗口
    }
}
