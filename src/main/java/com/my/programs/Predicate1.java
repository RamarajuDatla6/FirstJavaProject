package com.my.programs;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {

        Predicate<Integer> greater_than = x -> (x>10);
        System.out.println(greater_than.test(11));   // calling the test method

        Predicate<String> pred =Predicate.isEqual("Vijay");  // isequal method
        System.out.println(pred.test("vijay"));

        Predicate<Integer> grt_10 = x -> (x > 10);
        Predicate<Integer> less_100 = x -> (x < 100);                 //composing two predicates using and
        System.out.println(grt_10.and(less_100).test(60));          // and(Predicate P) method

        Predicate<Integer> eq_10 = x -> (x == 10);
        Predicate<Integer> gt_20 = x -> (x > 20);                 // composing two predicates using or
        System.out.println(eq_10.or(gt_20).test(19));


        Predicate<Integer> gt_than = x -> (x > 10);
        System.out.println(gt_than.negate().test(9));
    }
}
