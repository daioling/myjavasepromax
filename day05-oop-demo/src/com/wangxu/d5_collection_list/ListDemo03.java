package com.wangxu.d5_collection_list;

import java.util.LinkedList;

public class ListDemo03 {
    public static void main(String[] args) {
        // LinkedList 可以完成队列结构，和栈结构（双链表）
        // 栈
        LinkedList<String> stack = new LinkedList<>();
        // 压栈，入栈 // 正规需要使用push
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        stack.addFirst("第5颗子弹");
        System.out.println(stack);
        // 出栈 弹栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);
        // 队列
        LinkedList<String> queue = new LinkedList<>();
        queue.offerLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        queue.addLast("5号");
        System.out.println(queue);
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
