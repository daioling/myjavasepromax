package com.wangxu.d9_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> Linkedmaps = new LinkedHashMap<>();//有序不重复无索引
        Linkedmaps.put("鸿星尔克", 3);
        Linkedmaps.put("枸杞", 100);
        Linkedmaps.put("Java书", 1);
        Linkedmaps.put("Java书", 100);
        Linkedmaps.put(null, null);
        System.out.println(Linkedmaps);
    }
}
