package com.wangxu.d5_collection_list;


import java.util.ArrayList;
import java.util.List;

// ArrayList 集合的底层是基于数组存储数据。 查询快，增删慢！（相对的）
public class ListDemo01 {
    public static void main(String[] args) {
        // 1.创建ArrayList集合对象：
        // List ： 有序，可重复，有索引的。
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");
        System.out.println(list);
        // 2.在某个索引位置插入元素
        list.add(2,"HTML");
        System.out.println(list);
        // 3.根据索引删除元素，返回被删除的元素
        System.out.println( list.remove(2));
        System.out.println(list);
        // 4.根据索引获取元素：public E get(int index): 返回集合中指定位置的元素
        System.out.println(list.get(2));
        // 5.修改索引位置处的元素: public E set(int index, E element)
        System.out.println(list.set(2, "HTML"));
        System.out.println(list);
    }
}
