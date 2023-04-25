package com.wangxu.d5_innerclass_static;

public class Outer {
    public static int a = 100;
    private String hobby;
    /**
     *  静态成员内部类
     */
    public static class Inner{
        private String name;
        private int age;

        public void show(){
            System.out.println("名称 ：" + name);
            System.out.println("年龄 ：" + age);
            System.out.println(Outer.a);
            System.out.println(a);
            Outer o = new Outer();
            System.out.println(o.hobby); //不可以访问外部类私有变量
            //想要访问需要创建外部类对象
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Inner() {
        }

        private static String schoolName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }
    }
}

