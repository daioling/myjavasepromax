package com.wangxu.d2_stream;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo04 {
    public static double oneAllMoney;
    public static double twoAllMoney;
    public static double sAllMoney;
    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 30000, 25000, null));
        one.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        one.add(new Employee("沙悟净", '男', 20000, 20000, null));
        one.add(new Employee("小白龙", '男', 20000, 25000, null));
        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松", '男', 15000, 9000, null));
        two.add(new Employee("李逵", '男', 20000, 10000, null));
        two.add(new Employee("西门庆", '男', 50000, 100000, "被打"));
        two.add(new Employee("潘金莲", '女', 3500, 1000, "被打"));
        two.add(new Employee("武大郎", '男', 20000, 0, "下毒"));
        // 1.开发一部的最高工资员工
        // 指定大小规则
//        Employee e = one.stream().max((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus())).get();
//        System.out.println(e);
        TopperFormer t = one.stream().max((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .map(e -> new TopperFormer(e.getName(), e.getSalary() + e.getBonus())).get();
        System.out.println(t);
        // 2.统计平均工资，去掉最高与最低工资
        one.stream().sorted((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(one.size() - 2).forEach(e -> oneAllMoney += (e.getSalary() + e.getBonus()));
        System.out.println("开发一部的平均工资为 ："  + oneAllMoney / (one.size() - 2));
        //  two
        TopperFormer t2 = two.stream().max((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .map(e -> new TopperFormer(e.getName(), e.getSalary() + e.getBonus())).get();
        System.out.println(t2);
        one.stream().sorted((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(two.size() - 2).forEach(e -> twoAllMoney += (e.getSalary() + e.getBonus()));
        System.out.println("开发一部的平均工资为 ："  + twoAllMoney / (two.size() - 2));
        // 3.合并2个集合流，在统计
        Stream<Employee> s = Stream.concat(one.stream(), two.stream());
        s.sorted((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(one.size() + two.size() - 2).forEach(e -> sAllMoney += (e.getSalary() + e.getBonus()));
        BigDecimal b = BigDecimal.valueOf(sAllMoney);
        BigDecimal b2 = BigDecimal.valueOf(one.size() + two.size() - 2);
        System.out.println("开发一部和二部的平均工资为 ："  + b.divide(b2, 2, RoundingMode.HALF_UP));//四舍五入取两位小数


    }
}
