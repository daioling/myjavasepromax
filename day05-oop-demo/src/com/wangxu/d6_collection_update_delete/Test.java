package com.wangxu.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 1.准备数据
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("素素");
        System.out.println(list);
        // 需求 ：删除全部的Java信息
        // a.迭代器遍历删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            if ("Java".equals(ele)){
//                list.remove("Java");//报错
                it.remove();// 使用迭代器删除当前位置元素，保证不后移，能够成功遍历到全部元素！
            }
        }
        System.out.println(list);
        // b.foreach遍历删除(不能使用)lambda同理
//        for (String ele : list) {
//            if("Java".equals(ele)){
//                list.remove("Java");
//            }
//        }
    }
}
