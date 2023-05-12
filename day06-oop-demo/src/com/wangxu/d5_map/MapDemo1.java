package com.wangxu.d5_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  目标 ：认识Map体系的特点 ： 按照键无序，无索引，值不做要求
 */
public class MapDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个Map集合对象
        Map<String, Integer> maps = new HashMap<>();//一行经典代码
        maps.put("鸿星尔克", 3);
        maps.put("枸杞", 100);
        maps.put("Java书", 1);
        maps.put("Java书", 100);
        maps.put(null, null);
        System.out.println(maps);
        System.out.println("-------------------------------");
        Map<String, Integer> Linkedmaps = new LinkedHashMap<>();//有序不重复无索引
        Linkedmaps.put("鸿星尔克", 3);
        Linkedmaps.put("枸杞", 100);
        Linkedmaps.put("Java书", 1);
        Linkedmaps.put("Java书", 100);
        Linkedmaps.put(null, null);
        System.out.println(Linkedmaps);
    }
}
