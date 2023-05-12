package com.wangxu.d3_collections;

import java.util.*;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //names.add("楚留香");
        //names.add("胡铁花");
        //names.add("张无忌");
        //names.add("陆小凤");
        Collections.addAll(names, "张无忌", "胡铁花", "楚留香", "陆小凤");
        System.out.println(names);
        // 打乱List集合的顺序
        Collections.shuffle(names);
        System.out.println(names);
        // 将集合中的元素进行默认排序
        List<Integer> list = new ArrayList<>();
        //list.add(23);
        //list.add(24);
        //list.add(12);
        //list.add(8);
        Collections.addAll(list, 23, 24, 12, 8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
