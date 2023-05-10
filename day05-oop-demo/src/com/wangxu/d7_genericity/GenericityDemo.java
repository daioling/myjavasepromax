package com.wangxu.d7_genericity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericityDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(23);
        list.add(23.3);
        list.add(false);
        list.add("Java");
        List<Integer> list1 = new ArrayList<>();
    }
}
