package com.my.programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {

        LinkedHashSet <Integer> value = new LinkedHashSet<>();

        value.add(2);
        value.add(3);
        value.add(4);
        value.add(5);

        Iterator it = value.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
