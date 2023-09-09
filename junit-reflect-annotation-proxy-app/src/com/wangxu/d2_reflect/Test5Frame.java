package com.wangxu.d2_reflect;

import org.junit.Test;

/**
 * 目标：使用反射技术：设计一个保存对象的简易版框架
 */
public class Test5Frame {
    @Test
    public void save() throws Exception {
        Student student = new Student("黑马吴彦祖", 45, '男', 180, "看电视");
        Teacher teacher = new Teacher("王老师", 999);

        // 需求：把任意对象的字段名和其对应的值等信息，保存到文件中去。
        ObjectFrame.saveObject(student);
        ObjectFrame.saveObject(teacher);

    }
}
