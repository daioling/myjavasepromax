package com.wangxu.demo3;

import java.time.LocalDate;

public class Day {
    private LocalDate date;
    private boolean flag; // true休息

    public Day(LocalDate date, boolean flag) {
        this.date = date;
        this.flag = flag;
    }

    public Day(LocalDate date) {
        this.date = date;
    }
    public Day(){

    }
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return date.toString();
    }

    public void printInfo() {
        System.out.println(date + (flag ? "[休息]" : "[工作]"));
    }
}
