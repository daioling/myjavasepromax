package com.wangxu.d9_map_impl;

import java.util.*;

public class MapTest4 {
    public static void main(String[] args) {
        // 1.要求程序记录每个学生的选择情况。
        // 使用一个map集合存储
        Map<String, List<String>> data = new HashMap<>();
        // 2.把学生选择的数据存入进来
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects, "A", "C");
        data.put("洛阳", selects);
        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "D", "C", "A");
        data.put("长安", selects1);
        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "B", "D");
        data.put("咸阳", selects2);
        System.out.println(data);
        // 3.统计每个景点的人数
        Map<String, Integer> infos = new HashMap<>();
        // 4.提取所有人选择的景点信息
        Collection<List<String>> values = data.values();
        System.out.println(values);
        for (List<String> value : values) {
            for (String s : value) {
                if (infos.containsKey(s)){
                    // 值加1
                    infos.put(s, infos.get(s) + 1 );
                }else {
                    infos.put(s, 1);
                }
            }
        }
        System.out.println(infos);
    }
}
