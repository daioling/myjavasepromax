package com.wangxu.d1_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest3 {
    public static void main(String[] args) throws Exception {
        // 目标：读取属性文件，判断是否存在李方，如果存在年龄改为18
        // 1.加载属性文件的键值对到程序中来。
        Properties properties = new Properties();
        // 2.开始加载
        properties.load(new FileReader("properties-xml-log-app\\src\\users.txt"));
        // 3.判断是否包含李方这个键
        if (properties.containsKey("李方")){
            properties.setProperty("李方", "18");
        }
        // 4.把properties对象的键值对数据重新写入到属性文件中去。
        properties.store(new FileWriter("properties-xml-log-app\\src\\users.txt"), "success");
    }
}
