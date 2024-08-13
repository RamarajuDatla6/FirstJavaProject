package com.my.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> englishAlpha = new LinkedList<>();

        addInAscOrder(englishAlpha,"Dog");
        addInAscOrder(englishAlpha,"Cat");
        addInAscOrder(englishAlpha,"Fish");
        addInAscOrder(englishAlpha,"Apple");
        addInAscOrder(englishAlpha,"zebra");
        addInAscOrder(englishAlpha,"monkey");

        printList(englishAlpha);

        addInAscOrder(englishAlpha,"Cat");
        printList(englishAlpha);

        addInAscOrder(englishAlpha,"jungle");
        printList(englishAlpha);

    }


    public static void printList(LinkedList<String> linking){
        Iterator<String> i = linking.iterator();
        while (i.hasNext()){
            System.out.println("Printing : "+i.next());
        }
        System.out.println("................");
    }


    public static boolean addInAscOrder(LinkedList<String> linking, String newword){
        ListIterator<String> stringListIterator = linking.listIterator();

        while (stringListIterator.hasNext()){
            int compare = stringListIterator.next().compareTo(newword);

            if (compare == 0){
                System.out.println("Word already exists");
                return false;
            } else if (compare > 0) {
                stringListIterator.previous();
                stringListIterator.add(newword);
                return true;
            } else if (compare < 0) {
            }
        }
        stringListIterator.add(newword);
        return true;
    }
}
