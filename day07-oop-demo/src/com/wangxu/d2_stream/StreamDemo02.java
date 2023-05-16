package com.wangxu.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        /**
         * ------------------------Collection集合获取流--------------------------------------
         */
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();
        /**
         * ------------------------Map集合获取流--------------------------------------
         */
        Map<String, Integer> maps = new HashMap<>();
        // 键流
        Stream<String> keyStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valuesStream = maps.values().stream();
        // 键值流
        Stream<Map.Entry<String, Integer>> keyValueStream = maps.entrySet().stream();
        /**
         * ------------------------数组获取流--------------------------------------
         */
        String[] names = {"张三丰","张无忌","周芷若","赵敏","张强"};
        Stream<String> namesStream = Arrays.stream(names);
        Stream<String> namesStream2 = Stream.of(names);
    }
}
