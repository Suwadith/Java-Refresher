package com.suwadith.datastructures;

import java.util.Stack;

public class TheStack {

    public static void main(String[] args) {

        Stack<String> games = new Stack<>();

        games.push("COD 4");
        games.push("FIFA 19");
        games.push("NFS Rivals");

        System.out.println(games);

        //Pops out the top element and removes it from the stack
        System.out.println(games.pop());

        System.out.println(games);

        //Displays the top element without removing it from the Stack
        System.out.println(games.peek());

        System.out.println(games);

    }

}
