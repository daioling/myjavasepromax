package com.wangxu.demo6;


public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        MyLinkedList.Node<String> head = list.add();
        MyLinkedList.Node<String> head2 = list.reverse(head, 2, 5);
        list.forEach(head);
        list.forEach(head2);
    }
}
