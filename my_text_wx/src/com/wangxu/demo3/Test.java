package com.wangxu.demo3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1.找出从起始日子到目标月份的全部日子。
        // 拿到起始休息日
        LocalDate startData = LocalDate.of(2022, 2, 3);
        // 2.拿到用户查询到年份和月份，再找到这个月份的最后一天日子
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入要查询的年份和月份，以便为您展示该月休息日（注意：必须是2022-02月开始或之后：）");
        String currentData = sc.next() + "-01";
        LocalDate endMonthFirstData = LocalDate.parse(currentData);
        LocalDate endData = endMonthFirstData;
        // 拿到这个月份的最后一天日子，作为截止日期
        endData = endData.plusMonths(1).minusDays(1);
        // System.out.println(endData);
        // 3.从起始位置一直拿到截至日子中的全部日子对象，方便后面进行信息查询。
        List<Day> days = new ArrayList<>();
        while (!startData.isAfter(endData)){
            Day day = new Day(startData);
            days.add(day);
            // 把这个日子走向下一天
            startData = startData.plusDays(1);
        }
        System.out.println("起点开始的全部日子：" + days);
        // 4.从头开始遍历，标记是否休息。
        for (int i = 0; i < days.size(); i+=3) {
            Day day = days.get(i);
            day.setFlag(true); // 你去休息吧
        }
        // 5.展示出当月的休息日情况。
        List<Day> currentDayRest = new ArrayList<>();
        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.getDate().isBefore(endMonthFirstData)){
                continue;
            }
            currentDayRest.add(day);
            day.printInfo();
        }
        System.out.println();

        // 6.找出当月哪些休息日是周末
        System.out.println("这个月周末的休息日为：");
        currentDayRest.stream().filter(d -> (d.getDate().getDayOfWeek().getValue() == 6 || d.getDate().getDayOfWeek().getValue() == 7) && d.isFlag())
                .forEach(d -> {
                    System.out.print(d + (d.getDate().getDayOfWeek().getValue() == 6 ? "周六  " : "周日  "));
                });
    }
}
