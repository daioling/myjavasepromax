package com.wangxu.d2_collection_api;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // HashSet : 添加元素是无序的，不重复，无索引的。
        Collection<String> list = new ArrayList<>();
        // 1.添加元素，添加成功返回true
        list.add("Java");
        list.add("HTML");
        list.add("HTML");
        list.add("MySQL");
        list.add("Java");
        System.out.println(list.add("黑马"));
        System.out.println(list);
        // 2.清空集合的元素。
//        list.clear();
//        System.out.println(list);
        // 3.判断集合是否为空 是空返回true , 反之false
        System.out.println(list.isEmpty());
        // 4.获取集合大小
        System.out.println(list.size());
        // 5.判断集合中是否包含某个元素
        System.out.println(list.contains("Java"));
        System.out.println(list.contains("java"));
        // 6.删除某个元素：如果有多个重复的元素默认删除前面的第一个！
        System.out.println(list.remove("Java"));
        // 7.把集合转换成数组 [Java, 独孤求败, HTML, Mybatis]
        Object[] arrs = list.toArray();
        System.out.println(list);
        System.out.println(arrs);
        System.out.println("---------------------------拓展-----------------------------");
        // 将两个集合合并为一个集合
        Collection<String> list1 = new ArrayList<>();
        list1.add("Java1");
        list1.add("Java2");
        Collection<String> list2 = new ArrayList<>();
        list2.add("java3");
        list2.add("java4");
        list2.add("java5");
        // 将list1中的数据全部倒入到list2中
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
}
