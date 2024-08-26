package com.my.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsHashSets {
    public static void main(String[] args) {
        Set<String> value = new HashSet<>();

        value.add("I");
        value.add("am");
        value.add("Studying");
        value.add("java");

        System.out.println(value);
        value.add("i");
        System.out.println(value);
        value.add("I");
        System.out.println(value);
        value.remove("am");
        System.out.println(value);

        Iterator<String> it = value.iterator();
        while (it.hasNext())
            System.out.println(it.next());


        Set<Integer> value1= new HashSet<Integer>();
        value1.addAll(Arrays.asList(new Integer[]{1,3,4,5,6,9,10}));
        System.out.println(value1);

        Set<Integer> value2 = new HashSet<>();
        value2.addAll(Arrays.asList(new Integer[]{3,4,5,6,7,8,11}));
        System.out.println(value2);

        Set<Integer> intersection = new HashSet<>(value1);
        intersection.retainAll(value2);
        System.out.println(intersection);

        Set<Integer> union = new HashSet<>(value1);
        union.addAll(value2);
        System.out.println(union);

        Set<Integer> difference = new HashSet<>(value1);
        difference.removeAll(value2);
        System.out.println(difference);
    }
}
