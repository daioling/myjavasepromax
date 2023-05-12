package com.wangxu.d6_map_api;

import java.util.Collections;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        // 1.添加元素 ：无序不重复无索引。
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iphoneX", 10);
        maps.put("娃娃", 20);
        maps.put("iphoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);
        // 2.清空集合
//        maps.clear();
//        System.out.println(maps);
        // 3.判断集合是否为空，为空返回true，反之false
        System.out.println(maps.isEmpty());
        // 4.根据键值获取对应的值：get
        System.out.println(maps.get("娃娃"));
        // 5.根据键值删除整个元素（删除时返回键的值）
        System.out.println(maps.remove("iphoneX"));
        System.out.println(maps);
        // 6.判断是否包含某个建
        System.out.println(maps.containsKey("娃娃"));
        // 7.判断是否包含某个值
        System.out.println(maps.containsValue(23));
        // 8.获取全部建的集合
        Set<String> keys = maps.keySet();
        System.out.println(keys);
        // 9.获取全部值的集合
        Collection<Integer> values = maps.values();
        System.out.println(values);
        System.out.println("===================================");
        // 10.集合大小
        System.out.println(maps.size());
        // 11.合并其他Map集合。
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 1);
        map1.put("Java2", 100);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Java2", 1);
        map2.put("Java3", 4);
        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);
    }
}
