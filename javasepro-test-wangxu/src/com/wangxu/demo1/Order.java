package com.wangxu.demo1;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private String name;
    private LocalDateTime time;
    private double price;

    public Order() {
    }

    public Order(int id, String name, LocalDateTime time, double price) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public int getId(Integer id) {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", price=" + price +
                '}';

    }
}
