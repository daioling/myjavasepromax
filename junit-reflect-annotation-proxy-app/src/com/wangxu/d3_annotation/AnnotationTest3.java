package com.wangxu.d3_annotation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 目标：掌握注解的解析
 */
public class AnnotationTest3 {
    @Test
    public void parseClass(){
        // 1.先得到class对象
        Class c = Demo.class;
        // 2.解析类上的注释
        // 判断类上是否包含某个注解
        if (c.isAnnotationPresent(MyTest4.class)){
            MyTest4 myTest4 = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }

}
