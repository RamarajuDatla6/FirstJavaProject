package com.my.programs;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
//        ArrayList<Integer> integerList = new ArrayList<>();
//
//        integerList.add(0);
//        integerList.add(5); // adding an element in middle will move the remaining elements
//        integerList.add(2); // this will take much compilation
//        integerList.add(8); // to overcome this we have linked list
//        integerList.add(10);
//
//        for (int i = 0;i < integerList.size();i++){
//            System.out.println(i + " is "+integerList.get(i));
//        }
//
//        integerList.add(1,33);
//        for (int i = 0;i < integerList.size();i++){
//            System.out.println(i + " is "+integerList.get(i));
//        }

        LinkedList<String> engAlphabet = new LinkedList<String>();
        engAlphabet.add("apple");
        engAlphabet.add("ball");
        engAlphabet.add("cat");
        engAlphabet.add("elephant");
        engAlphabet.add("fish");

        printList(engAlphabet);

        engAlphabet.add(3,"Dog");
        printList(engAlphabet);

        engAlphabet.remove(2);
    }


    public static void printList(LinkedList<String> linking){
        Iterator<String> i = linking.iterator();
        while (i.hasNext()){
            System.out.println("Printing : "+i.next());
        }
        System.out.println("................");
    }
}
