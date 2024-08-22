package com.my.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionFrameWorkArrayListClone {
    public static void main(String[] args) {
        ArrayList<Integer> newList1 = new ArrayList<>();
        newList1.add(1);
        newList1.add(5);
        newList1.add(3);
        newList1.add(7);
        newList1.add(11);
        newList1.add(13);
        newList1.add(17);
        newList1.add(10);

        newList1 = (ArrayList)newList1.clone();



        Iterator it = newList1.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}