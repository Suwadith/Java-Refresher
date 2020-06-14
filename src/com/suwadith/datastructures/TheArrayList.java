package com.suwadith.datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class TheArrayList {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();

        //Adding items into the ArrayList
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Strawberry");
        System.out.println(fruits);

        //Iterate ArrayList using a for loop
        for(int i=0; i<fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        //Iterate ArrayList using a for-each loop
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Sorting ArrayList using Collections (Alphabetical / Numerical)
        Collections.sort(fruits);
        System.out.println(fruits);

        //Check if item exists within the ArrayList
        System.out.println(fruits.contains("Strawberry"));

        //Removing item by name
        fruits.remove("Strawberry");
        System.out.println(fruits);

        //Check if item exists within the ArrayList
        System.out.println(fruits.contains("Strawberry"));

        //Retrieving item by index
        System.out.println(fruits.get(0));

        //Replacing item using index
        fruits.set(0, "Banana");
        System.out.println(fruits);

        //Removing item using index
        fruits.remove(1);
        System.out.println(fruits);

        //Clearing the whole ArrayList
        fruits.clear();
        System.out.println(fruits);
    }

}
