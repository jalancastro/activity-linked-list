package com.example.linkedlist;

public class Driver {

    public static void main(String[] args) {

        LinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("first");
        list.addFirst("second");
        list.addFirst("third");
        list.addFirst("fourth");
        list.addFirst("fifth");

        list.addLast("sixth");
        list.addLast("seventh");
        list.addLast("eighth");

        System.out.println(list);

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.pollFirst());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains("fifth"));
        System.out.println(list.contains("seventh"));

        list.clear();
        System.out.println(list);

    }
}
