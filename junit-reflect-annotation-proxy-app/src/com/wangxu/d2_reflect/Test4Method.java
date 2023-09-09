package com.wangxu.d2_reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test4Method {
    @Test
    public void testGetMethods() throws Exception{
        // 1.反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2.获取类的全部成员方法。
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "---->" + method.getParameterCount() + "----->"
                    + method.getReturnType() );
        }
        // 获取某个方法对象
        Method run = c.getDeclaredMethod("run");
        System.out.println(run.getName() + "---->" + run.getParameterCount() + "----->"
                + run.getReturnType() );

        Method eat = c.getDeclaredMethod("eat", String.class);
        System.out.println(eat.getName() + "---->" + eat.getParameterCount() + "----->"
                + eat.getReturnType() );

        Cat cat = new Cat();
        run.setAccessible(true); // 禁止检查访问权限
        Object invoke = run.invoke(cat);
        System.out.println(invoke);
        run.setAccessible(true);
        Object invoke2 = eat.invoke(cat, "鱼儿");
        System.out.println(invoke2);
    }
}
