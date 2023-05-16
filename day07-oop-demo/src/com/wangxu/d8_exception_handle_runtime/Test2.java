package com.wangxu.d8_exception_handle_runtime;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            try {
                System.out.println("请您输入合法的价格：");
                String priceStr = s.nextLine();
                // 转换为double类型的价格
                double price = Double.valueOf(priceStr);
                // 判断价格是否大于0
                if (price > 0){
                    System.out.println("定价 ：" + price);
                    break;
                }else {
                    System.out.println("价格必须是正数~~~~");
                }
            } catch (NumberFormatException e) {
                System.out.println("用户输入的数据不合法！！！请输入大于0的正数！");
            }
        }
    }
}
