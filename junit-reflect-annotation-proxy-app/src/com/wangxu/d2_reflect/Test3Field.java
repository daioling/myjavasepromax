package com.wangxu.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 目标：掌握获取类的成员变量，并对其进行操作。
 */
public class Test3Field {
    @Test
    public void testGetFields() throws NoSuchFieldException {
        // 1.反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2.获取类的全部成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }
        // 定位某个成员变量
        Field name = c.getDeclaredField("name");
        System.out.println(name.getName() + "--->" + name.getType());
        Field age = c.getDeclaredField("age");
        System.out.println(age.getName() + "--->" + age.getType());
    }
}
