package com.my.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFrameWorkIntegers {
    public static void main(String[] args) {
        List <Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(5);
        newList.add(3);
        newList.add(7);
        newList.add(11);
        newList.add(13);
        newList.add(17);
        newList.add(10);
        newList.add(3,4);

        List<Integer> subList = new ArrayList<>();
        subList.add(7);
        subList.add(11);
        subList.add(13);

       int index = Collections.indexOfSubList(newList,subList);
       System.out.println(index);

//        Collections.sort(newList);  // prints in ascending order
//        Collections.sort(newList,Collections.reverseOrder()); // prints in descending order

//        int search = Collections.binarySearch(newList,11);
//        System.out.println(search);

//        int max = Collections.max(newList);
//        System.out.println("The max is "+max);
//
//        int min = Collections.min(newList);
//        System.out.println("The min is "+min);


//        Iterator it = newList.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());

        }
    }

