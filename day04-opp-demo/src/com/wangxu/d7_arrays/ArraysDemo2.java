package com.wangxu.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 目标 ：自定义数组的排序规则 ：Comparator比较器对象。
        // 1.Arrays的sort方法对于有值特性的数组是默认升序排序
        int[] ages = {34, 12, 42, 23};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        // 2.需求：降序排序
        Integer[] ages1 = {34, 12, 42, 23};
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//默认升序
                return o2 - o1;// 降序
            }
        });
        System.out.println(Arrays.toString(ages1));
        System.out.println("---------------------");
        Student[] students = new Student[3];
        students[0] = new Student("小明",21,195);
        students[1] = new Student("小帅",24,175);
        students[2] = new Student("小美",23,185);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();//按照年龄排序(升序)
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
