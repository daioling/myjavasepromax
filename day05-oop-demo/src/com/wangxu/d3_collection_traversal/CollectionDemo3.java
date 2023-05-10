package com.wangxu.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("赵敏");
        list.add("小昭");
        list.add("殷素素");
        list.add("周芷若");
        System.out.println(list);
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        // 简化1
//        list.forEach((String s) -> {
//                System.out.println(s);
//            }
//        );
        // 简化2
//        list.forEach(s -> System.out.println(s));
        // 简化3
       list.forEach(System.out::println);

    }
}
