package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Viet", 20);
        hashMap.put("Thanh", 29);
        hashMap.put("Lewis", 21);
        hashMap.put("Cook", 12);
        hashMap.put("Andy", 20);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Viet", 20);
        linkedHashMap.put("Thanh", 29);
        linkedHashMap.put("Lewis", 21);
        linkedHashMap.put("Cook", 12);
        linkedHashMap.put("Andy", 20);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
