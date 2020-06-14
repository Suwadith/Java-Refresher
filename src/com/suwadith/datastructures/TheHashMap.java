package com.suwadith.datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TheHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();

        //Adding values inside the HashMap
        keyValue.put("a", 5);
        keyValue.put("b", 10);
        keyValue.put("c", 15);

        //Printing the whole HashMap
        System.out.println(keyValue);

        //Retrieving the value of a particular key
        System.out.println(keyValue.get("a"));


        HashMap<String, String> userPass = new HashMap<String, String>();

        userPass.put("suwadith", "QWERTY1234");
        userPass.put("ramzan", "thisIsSoStupid");

        System.out.println(userPass);

        //Removing value from the HashMap using key
        userPass.remove("ramzan");

        System.out.println(userPass);

        //Check if key exists in HashMap
        System.out.println(userPass.containsKey("suwadith"));

        //Check if value exists in HashMap
        System.out.println(userPass.containsValue("QWERTY1234"));

        System.out.println(userPass.size());

        //Replacing value of a given key in a HshMap
        userPass.replace("suwadith", "changedQWERTY1234");

        System.out.println(userPass);

        //Printing all the values in a HashMap
        System.out.println(userPass.values());

        //Printing all the keys of a HashMap
        System.out.println(userPass.keySet());

        //Iterating HAshMap
        Iterator it = userPass.entrySet().iterator();

        while(it.hasNext()) {
//            System.out.println(it.next());
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

    }

}
