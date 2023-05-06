package com.wangxu.d6_regex;

import java.util.Scanner;

public class RegexTest2 {
    public static void main(String[] args) {
        // 目标 ：校验手机号码
        checkPhone();
    }
    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您的手机号码：");
            String phone = sc.next();
            // 判断手机号码的格式
            if(phone.matches("1[3-9]\\d{9}")){
                System.out.println("手机号码格式正确，注册完成！");
                break;
            }else {
                System.out.println("输入的格式有误！");
            }
        }
    }

}
