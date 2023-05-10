package com.wangxu.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("赵敏");
        list.add("小昭");
        list.add("殷素素");
        list.add("周芷若");
        System.out.println(list);
        for(String ele : list){
            System.out.println(ele);
        }
        System.out.println("---------------------------------");
        double[] scores = {100, 99.5, 59.5};
        for (double score : scores) {
            System.out.println(score);
        }
    }
}
