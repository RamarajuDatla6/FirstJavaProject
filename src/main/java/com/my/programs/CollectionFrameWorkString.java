package com.my.programs;

import java.util.*;

public class CollectionFrameWorkString {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Apple");
        names.add("cat");
        names.add("dog");
        names.add("zebra");
        names.add("lion");
        names.addFirst("Elephant");
        names.addLast("Monkey");

       // Collections.sort(names);
       // Collections.sort(names,Collections.reverseOrder());

        Iterator it = names.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
