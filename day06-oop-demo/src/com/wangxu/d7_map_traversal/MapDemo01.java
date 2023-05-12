package com.wangxu.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iphoneX", 10);
        maps.put("娃娃", 20);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);
        //找键值
        Set<String> keys = maps.keySet();
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "===>" + value);
        }
    }
}
