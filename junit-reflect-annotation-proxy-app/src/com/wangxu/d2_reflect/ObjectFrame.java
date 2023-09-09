package com.wangxu.d2_reflect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {
    // 目标：保存任意对象的字段和其数据到文件中去。
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("E:\\java\\code\\myjavasepromax\\junit-reflect-annotation-proxy-app\\src\\data.txt", true));
        // obj是任意对象，到底需要保存多少个字段呢？
        Class c = obj.getClass();
        String cName = c.getSimpleName();
        ps.println("---------" + cName + "---------");

        // 2.从这个类中提取它的全部成员变量
        Field[] fields = c.getDeclaredFields();
        // 3.遍历全部成员变量
        for (Field field : fields) {
            // 4.获取成员变量的名称
            String name = field.getName();
            // 5.获取成员变量在对象中的数据
            field.setAccessible(true); // 禁止检查访问控制
            String value = field.get(obj) + "";
            ps.println(name + " = " + value);
        }
        ps.close();

    }
}
