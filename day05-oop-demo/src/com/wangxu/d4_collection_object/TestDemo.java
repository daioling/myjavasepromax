package com.wangxu.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        // 1.定义一个电影类
        // 2.定义一个集合对象存储3部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《你好，李焕英》", 9.5, "张小斐，贾玲，沈腾，陈赫"));
        movies.add(new Movie("《唐人街探案》", 8.5, "王宝强， 刘昊然， 美女"));
        movies.add(new Movie("《刺杀小说家》", 8.6, "雷佳音，杨幂"));
        // 3.遍历集合容器中的每个电影对象
        movies.forEach(s -> System.out.println(s.getName() + s.getActor() + s.getScore()));
        System.out.println("=---------------------------------------------");
        for (Movie movie : movies) {
            System.out.println(movie.getName());
            System.out.println(movie.getScore());
            System.out.println(movie.getActor());
        }
    }
}
