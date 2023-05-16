package com.wangxu.d1_unchang_collection;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *  目标 ：不可变集合。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<Double> lists = List.of(562.5, 700.5, 564.0, 521.0);
        System.out.println(lists);
//        lists.add(689.0);//报错
//        lists.set(2, 599.0);//报错
        Set<String> sets = Set.of("aasasd", "adasrg");
//        sets.add("ggjjj");//报错
//        sets.set(2, "599.0");//报错
        //Map同理
    }
}
