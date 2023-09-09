package com.wangxu.demo3.Timer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public class TimeTask extends TimerTask {
    // 高考开始时间
    private LocalDateTime startTime;

    // 构造器，对高考的开始时间进行初始化
    public TimeTask() {
        String s = "2024-06-07 09:00:00";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        startTime = LocalDateTime.parse(s, dtf);
    }

    @Override
    public void run() {
        // 1.拿到此刻的当前时间。
        LocalDateTime now = LocalDateTime.now();
        // 2.计算此刻时间、与高考开始时间相差的具体天数，小时，分，秒。
        Duration duration = Duration.between(now, startTime);
        // 3.开始拿时间差信息
        System.out.println(duration.toDays() + "天" + duration.toHoursPart() + "时" + duration.toMinutesPart() + "分" + duration.toSecondsPart() + "秒");
    }
}
