package com.wangxu.d14_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("------------");
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1); // 加
        BigDecimal c2 = a1.subtract(b1); // 减
        BigDecimal c3 = a1.multiply(b1); // 乘
        BigDecimal c4 = a1.divide(b1); // 除
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        //转成 double 类型
        double rs = c1.doubleValue();
        System.out.println(rs);


        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        /**
         * 参数1：除数
         * 参数2：保留小数点位数
         * 参数3：四舍五入
         */
        BigDecimal c11 = a11.divide(b11, 2, RoundingMode.HALF_UP);
        System.out.println(c11);

    }
}
