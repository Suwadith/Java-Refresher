package com.suwadith.datastructures;

import java.util.Iterator;
import java.util.LinkedList;

public class TheLinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Rob");
        list.add("Suwadith");
        list.add("Alex");

        System.out.println(list);

        System.out.println(list.getFirst());

        list.remove("Rob");

        System.out.println(list);

        System.out.println(list.get(1));

        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(10);

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            if(it.next() == 10) {
                System.out.println("found 10");
            }
        }

    }

}
