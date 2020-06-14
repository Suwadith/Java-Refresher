package com.suwadith.datastructures;

import java.util.HashSet;
import java.util.Iterator;

public class TheHashSet {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("Robert");
        names.add("Evans");
        names.add("Chris");

        System.out.println(names);

        names.remove("Evans");

        System.out.println(names);

        System.out.println(names.contains("Evans"));

        //Iterating through an HashSet
        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }


        names.clear();

        System.out.println(names);

    }

}
