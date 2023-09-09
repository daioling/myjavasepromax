package com.wangxu.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 目标：掌握获取类的构造器，并对其进行操作。
 */
public class Test2Constructor {
    @Test
    public void testGetConstructors(){
        // 1.反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2.获取类的全部构造器
//        Constructor[] constructors = c.getConstructors();// 只能获取public修饰的
        Constructor[] constructors = c.getDeclaredConstructors(); // 只要存在就可以拿到
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "---->" +constructor.getParameterCount());// 构造器名称与参数个数
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        // 1.反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2.获取某个构造器：无参构造器
//        Constructor constructor = c.getConstructor();  // 只能获取public修饰的
        Constructor constructor = c.getDeclaredConstructor(); // 只要存在就可以拿到
        System.out.println(constructor.getName() + "---->" +constructor.getParameterCount());// 构造器名称与参数个数
        constructor.setAccessible(true);// 禁止检查访问权限，暴力反射
        Cat cat = (Cat) constructor.newInstance(); // 获取无参构造器
        System.out.println(cat);


        // 3.获取有参构造器
        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor1.getName() + "---->" +constructor1.getParameterCount());// 构造器名称与参数个数
    }
}
