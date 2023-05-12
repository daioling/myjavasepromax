package com.wangxu.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 目标 ：看看Set集合的特点:HashSet  LinkedSet  TreeSet
        Set<String> sets = new HashSet<>(); // 一行经典代码  无序不重复 ，无索引
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
        System.out.println("-------------------------------------");
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
