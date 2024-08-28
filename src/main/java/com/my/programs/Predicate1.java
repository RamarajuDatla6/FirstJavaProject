package com.my.programs;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {

        Predicate<Integer> greater_than = x -> (x>10);
        System.out.println(greater_than.test(9));   // calling the test method

        Predicate<String> pred =Predicate.isEqual("Vijay");
        System.out.println(pred.test("vijay"));
        System.out.println("hi");
    }
}
