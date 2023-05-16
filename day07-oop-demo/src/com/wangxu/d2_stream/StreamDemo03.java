package com.wangxu.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *  目标 ：Stream流的常用API
 *  forEach : 逐个处理（遍历）
 *  count : 统计个数
 *      --long count();
 *  filter : 过滤元素
 *  limit : 取前几个元素
 *  skip : 跳过前几个
 *  map : 加工方法
 *  concat : 合并流
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张三丰");

        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);
        // map : 加工方法
        // 给集合元素前面统一添加上：喜欢的人物：
        list.stream().map(s -> "喜欢的人物：" + s).forEach(s -> System.out.println(s));
        // 把所有的名称都加工成一个学生对象
        list.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
        //简化   构造器引用  方法引用
        list.stream().map(Student::new).forEach(System.out::println);
        // 合并流
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1", "Java2");
        Stream<String> s3 = Stream.concat(s1, s2);
//        s3.forEach(s -> System.out.println(s));
        System.out.println("==============================");
        s3.distinct().forEach(s -> System.out.println(s));
    }
}
