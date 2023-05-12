package com.wangxu.d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *  目标：观察TreeSet对于有值特性的数据如何排序。
 *       学会对自定义类型的对象进行指定规则排序
 */
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();// 不重复 无索引 可排序
        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);
        Set<String> sets1 = new TreeSet<>();// 不重复 无索引 可排序
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("angela");
        sets1.add("黑马");
        sets1.add("Java");
        sets1.add("About");
        sets1.add("Python");
        sets1.add("UI");
        sets1.add("UI");
        System.out.println(sets1);
        System.out.println("----------------------");
        Set<Apple> apples = new TreeSet<>();
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿富士", "青色", 29.9, 400));
        apples.add(new Apple("黄元帅", "黄色", 9.6, 500));
        System.out.println(apples);
        System.out.println("==============================");
        // 方法二：
        Set<Apple> apples1 = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                //return o1.getWeight() - o2.getWeight() >= 0 ? 1 : -1;//升序
                return o2.getWeight() - o1.getWeight() >= 0 ? 1 : -1;//降序
            }
        });
        apples1.add(new Apple("红富士", "红色", 9.9, 500));
        apples1.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples1.add(new Apple("绿富士", "青色", 29.9, 400));
        apples1.add(new Apple("黄元帅", "黄色", 9.6, 500));
        System.out.println(apples1);
        Set<Apple> apples2 = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());//升序
                //return Double.compare(o2.getPrice(), o1.getPrice());//降序
            }
        });
        apples2.add(new Apple("红富士", "红色", 9.9, 500));
        apples2.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples2.add(new Apple("绿富士", "青色", 29.9, 400));
        apples2.add(new Apple("黄元帅", "黄色", 9.6, 500));
        System.out.println(apples2);
    }
}
