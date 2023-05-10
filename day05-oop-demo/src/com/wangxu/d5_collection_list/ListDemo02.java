package com.wangxu.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");

        /**
         * 1.for循环
         */
        System.out.println("------------------------------");
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }
        System.out.println("------------------------------");
        /**
         * 2.迭代器
         */
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------");
        /**
         * 3.foreach
         */
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------------");
        /**
         * 4.JDK 1.8  开始后的 Lambda 表达式
         */
        list.forEach(s -> System.out.println(s));
        System.out.println("------------------------------");
    }
}
