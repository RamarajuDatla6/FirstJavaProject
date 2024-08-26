package com.my.programs;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {

        TreeSet <String> value = new TreeSet<>();

        value.add("Cat");
        value.add("cat");
        value.add("Hippo");
        value.add("hippo");
        value.add("Apple");
        value.add("apple");

        Iterator it = value.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
