package com.wangxu.d9_map_impl;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> maps = new TreeMap<>();
        maps.put(13, "小敏");
        maps.put(1, "小明");
        maps.put(3, "小帅");
        maps.put(31, "小美");
        System.out.println(maps);
    }
}
