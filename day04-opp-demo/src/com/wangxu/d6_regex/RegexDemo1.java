package com.wangxu.d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        // 需求 ：校验qq号码，必须全是数字并且在 6 - 20 位
        System.out.println(checkQQ("26544635186"));
        System.out.println(checkQQ("265446ad86"));
        System.out.println(checkQQ("286"));
        System.out.println(checkQQ(null));
        System.out.println(checkQQ2("26544635854"));
        System.out.println(checkQQ2("265446ad86"));
        System.out.println(checkQQ2("286"));
        System.out.println(checkQQ2(null));
    }
    public static boolean checkQQ2(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }

        public static boolean checkQQ(String qq){
        // 1.判断qq号的长度是否满足要求
        if(qq == null || qq.length() < 6 || qq.length() > 20){
            return false;
        }
        // 2.判断qq号中是否全是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
}
