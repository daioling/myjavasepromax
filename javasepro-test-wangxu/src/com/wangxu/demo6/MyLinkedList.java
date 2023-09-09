package com.wangxu.demo6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLinkedList<E extends Comparable> {
    // 封装一个链表
    Node<E> head = null;
    /**
     * 定义一个私有内部类，作为链表的结点。
     */
    public static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
    public Node<E> add (E e){
        if (head == null){
            head = new Node(e, null);
        }else {
            // 往后插入结点（尾插法）
            Node<E> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            // 把当前结点创建出来，加入到尾部结点
            temp.next = new Node(e, null);
        }
        return head;
    }

    public Node<E> sorted(){
        if (head == null){
            return head;
        }

        List<E> number = new ArrayList<>();
        Node<E> temp = head;
        while (temp != null){
            number.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(number);

        return head;
    }

    public void forEach(Node<E> head){
        if (head == null){
            System.out.println(head);
            return;
        }
        Node<E> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node<E> mergeSort(Node<E> head2){
        if (head == null && head2 == null){
            return null;
        }
        if (head == null && head2 != null){
            return head2;
        }
        if (head != null && head2 == null){
            return head;
        }
        if (head != null && head2 != null){
            Node<E> newHead = new Node<>(null, null);
            Node<E> newTemp = newHead;
            Node<E> temp1 = head;
            Node<E> temp2 = head2;
            while (temp1 != null && temp2 != null){
                if (temp1.data.compareTo(temp2.data) == -1){
                    newTemp.next = temp1;
                    temp1 = temp1.next;
                }else {
                    newTemp.next = temp2;
                    temp2 = temp2.next;
                }
                newTemp = newHead.next;
            }
            if (temp1 == null){
                newTemp.next = temp2;
            }
            if (temp2 == null){
                newTemp.next = temp1;
            }
            head = newHead.next;
        }
        return head;
    }
}
