package com.wangxu.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        System.out.println("-------------------");
        // 无序 不重复  无索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);
        System.out.println("-------------------");
        Collection<String> list2 = new ArrayList<String>();
        list2.add("Java");
        list2.add("黑马");
//        list2.add(23); //报错
        // 集合和泛型不支持基本数据类型，只能支持引用数据类型
//        Collection<int> list3 = new ArrayList<>(); // 报错
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
    }
}
