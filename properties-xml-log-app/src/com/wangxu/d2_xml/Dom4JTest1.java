package com.wangxu.d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 目标：掌握使用Dom4j框架解析XML 文件。
 */
public class Dom4JTest1 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个Dom4j框架提供一个解析器对象
        SAXReader saxReader = new SAXReader();

        // 2.使用SAXReader对象把需要解析的XML文件读成一个Document对象。
        Document document = saxReader.read("properties-xml-log-app\\src\\helloworld.xml");

        // 3.从文档对象中解析XML文件的全部数据
        Element rootElement = document.getRootElement();
        // 根元素对象
        System.out.println(rootElement.getName());

        // 4.获取根元素下的全部一级子元素
//        List<Element> elements = rootElement.elements();
        List<Element> elements = rootElement.elements("user");
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        // 5.获取当前元素下的某个子元素
        Element people = rootElement.element("people");
        System.out.println(people.getText());// 获取文本内容

        // 如果下面有很多子元素user， 默认获取第一个。
        Element user = rootElement.element("user");
        System.out.println(user.elementText("name"));
        // 6.获取元素的属性信息
        System.out.println(user.attributeValue("id"));
        Attribute id = user.attribute("id");
        System.out.println(id.getName());
        System.out.println(id.getValue());

        List<Attribute> attributes = user.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName() + "=" + attribute.getValue());
        }

        // 7.如何获取全部的文本内容：获取当前元素下的子元素文本值
        System.out.println(user.elementText("name"));
        System.out.println(user.elementText("地址"));
        System.out.println(user.elementTextTrim("地址")); //取出文本去除空格
        System.out.println(user.elementText("password"));

        Element data = user.element("data");
        System.out.println(data.getText());
    }
}
