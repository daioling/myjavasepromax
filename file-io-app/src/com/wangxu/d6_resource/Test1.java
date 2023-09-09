package com.wangxu.d6_resource;

/**
 * 目标：认识try-catch-finally
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("执行finally");
        }
    }
}
