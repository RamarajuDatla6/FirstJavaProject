package com.my.programs;

import java.util.function.Function;

public class Functions1 {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i ->i*i;
         System.out.println(f.apply(5));
         System.out.println(f.apply(9));


         Function<String,Integer> f1 = s -> s.length();
          System.out.println(f1.apply("I am Human"));


          Function<String,String> f2 = s->s.toUpperCase();
          System.out.println((f2.apply("I am Human")));
    }
}
