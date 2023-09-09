package com.wangxu.demo4;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("张无忌");
        list.add("宋青书");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("小昭");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(4));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.forEach(s -> System.out.println(s));
    }
}
