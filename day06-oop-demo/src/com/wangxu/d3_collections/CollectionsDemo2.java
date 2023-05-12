package com.wangxu.d3_collections;

import com.wangxu.d1_set.Apple;

import java.util.*;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿富士", "青色", 29.9, 400));
        apples.add(new Apple("黄元帅", "黄色", 9.6, 500));
        System.out.println(apples);
        Collections.sort(apples);
        System.out.println(apples);
        //方式二
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        System.out.println(apples);
    }
}
