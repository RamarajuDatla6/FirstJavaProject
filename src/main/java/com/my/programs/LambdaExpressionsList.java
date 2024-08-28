package com.my.programs;

import java.util.LinkedList;

public class LambdaExpressionsList {
    public static void main(String[] args) {

        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Apple");
        l1.add("Dog");
        l1.add("Hippo");
        l1.add("Rhino");

        l1.forEach((n) -> System.out.println(n));
    }
}
