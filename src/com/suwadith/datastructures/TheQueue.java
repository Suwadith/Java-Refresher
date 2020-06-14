package com.suwadith.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.add("Jackson");
        customers.add("Thariq");
        customers.add("Susan");

        System.out.println(customers);

        //Displays the first element while removing it from the queue
        System.out.println(customers.poll());

        System.out.println(customers);

        //Displays the first element without removing it from the Stack
        System.out.println(customers.peek());

        System.out.println(customers);

        System.out.println(customers.size());

        System.out.println(customers.contains("Thariq"));

        //Converting into an array
        System.out.println(customers.toArray()[0]);

    }

}
