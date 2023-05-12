package com.wangxu.d4_collection_test;

import java.util.*;

public class GameDemo {
    /**
     * 1.定义一个静态集合存储54张牌对象
     */
    public static List<Card> allCards = new ArrayList<>();

    /**
     * 2. 做牌 ：定义静态代码块初始化牌数据
     */
    static {
        // 3. 定义点数 ：个数确定，类型确定，使用数组
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4. 定义花色 ：个数确定，类型确定，使用数组
        String[] colors = {"♥","♠","♣","♦"};
        // 5.组合花色与点数
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c = new Card(size, color, index);
                allCards.add(c);
            }
        }
        Card c1 = new Card("", "🃏",++index);
        Card c2 = new Card("", "🃏",++index);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌 ：" + allCards);
    }

    public static void main(String[] args) {
        // 洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后" + allCards);
        // 定义三个玩家
        List<Card> linghucong = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyingying = new ArrayList<>();
        //开始发牌
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if (i % 3 == 0){
                linghucong.add(c);
            }else if (i % 3 == 1){
                jiumozhi.add(c);
            }else {
                renyingying.add(c);
            }
        }
        //最后三张牌（把最后三张牌截取出来）
        List<Card> lastTreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        // 给玩家的牌排序（从大到小）
        sortCards(linghucong);
        sortCards(jiumozhi);
        sortCards(renyingying);
        
        // 打印出牌
        System.out.println("令狐冲：" + linghucong);
        System.out.println("鸠摩智：" + jiumozhi);
        System.out.println("任盈盈：" + renyingying);
        System.out.println("底牌：" + lastTreeCards);
    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
