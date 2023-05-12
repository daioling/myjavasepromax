package com.wangxu.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iphoneX", 10);
        maps.put("娃娃", 20);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);
        /**
         * 使用forEach遍历map集合，发现map集合的键值对元素直接是没有类型的，所以不乐意直接foreach遍历集合。
         * 可以通过调用Map的方法 entrySet 把Map集合转换成Set集合形式 maps.entrySet();
         */
        // 1.把Map集合转换为Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2.开始遍历
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "===> " + value);
        }
    }
}
