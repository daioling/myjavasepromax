package com.wangxu.d2_reflect;

public class Cat {
    public static int a;
    private static final String COUNTRY = "中国";
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void run(){
        System.out.println("猫猫跑的快！");
    }
    public void eat(){
        System.out.println("猫猫爱吃饭");
    }
    private String eat(String name){
        return "猫猫最爱吃" + name;
    }

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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
