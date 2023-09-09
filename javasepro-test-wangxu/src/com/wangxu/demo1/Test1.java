package com.wangxu.demo1;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 具体要求：
 *      1.定义订单类order，创建ArrayList集合，用于存储订单order对象
 *      2.使用Stream流找出今天之前的订单，并遍历输出。
 *      3.使用Stream流找出集合中价格最贵的订单，将详细信息打印出来。
 *      4.使用Stream流遍历集合中的每个订单，要求按照价格降序输出每个订单的性情。
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        // 1.定义一个List集合存储全部订单对象
        List<Order> orders = new ArrayList<>();
        // 2.导入Dom4j框架
        SAXReader saxReader = new SAXReader();
        // 3.读取xml文件成为一个Document对象
        Document document = saxReader.read(Test1.class.getResourceAsStream("/orders.xml"));
        // 4.提取根元素
        Element rootElement = document.getRootElement();
        // 5.提取一级子元素
        List<Element> orderEles = rootElement.elements();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 6.遍历每个订单元素
        for (Element orderEle : orderEles) {
            // 7.每个订单元素是一个订单对象。
            Order order = new Order();
            order.setId(Integer.valueOf(orderEle.attributeValue("id")));
            order.setName(orderEle.elementText("name"));
            order.setTime(LocalDateTime.parse(orderEle.elementText("time"), dft));
            order.setPrice(Double.valueOf(orderEle.elementText("double")));
            // 8.将订单对象存入到集合中去
            orders.add(order);
        }
        System.out.println(orders);
        // 9.使用Stream流找出今天之前的订单，并遍历输出。
        System.out.println("今天之前的订单如下：");
        orders.stream().filter(o -> o.getTime().isBefore(LocalDateTime.now())).forEach(System.out::println);
        // 10.使用Stream流找出集合中价格最贵的订单，将详细信息打印出来。
        System.out.println("最贵的订单如下：");
        Order order = orders.stream().max(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()))).get();
        System.out.println(order);
        // 11.使用Stream流遍历集合中的每个订单，要求按照价格降序输出每个订单的性情。
        System.out.println("根据价格降序如下：");
        orders.stream().sorted((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice())).forEach(System.out::println);
    }
}
