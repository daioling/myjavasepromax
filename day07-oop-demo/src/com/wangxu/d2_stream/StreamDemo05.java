package com.wangxu.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张三丰");
        Stream<String> zhangStream = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = zhangStream.collect(Collectors.toList());
        System.out.println(zhangList);
        // 注意流只能进行一次操作（只能使用一次）
        // 调入数组 xxx.toArray();
    }
}
