package com.wangxu.d1_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<String> sets1 = new LinkedHashSet<>();  // 有序  不重复  无索引
        sets1.add("MySQL");
        sets1.add("MySQL");
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("HTML");
        sets1.add("HTML");
        sets1.add("SpringBoot");
        sets1.add("SpringBoot");
        System.out.println(sets1);
    }
}
