package com.wangxu.d6_regex;

public class RegexDemo3 {
    public static void main(String[] args) {
        String names = "小路adashbablu131蓉儿isapfhsaicbn过儿";
        String[] arrs = names.split("\\w+"); // 分割
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
        String names1 = names.replaceAll("\\w+", "  ");
        System.out.println(names1);

    }
}
