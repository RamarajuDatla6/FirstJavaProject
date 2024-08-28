package com.my.programs;

import java.util.Scanner;

interface New{
    boolean test(int n);
}
public class LambdaExpressionsNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");

        int x = sc.nextInt();

        New ly = (year) -> {
            if ((year % 400 == 0) || ((year % 4 == 0)&&(year % 100 != 0)))
                return true;
            else return false;
        };

        if (ly.test(x))
            System.out.println(x + " is a leap year");
        else System.out.println(x + " is not a leap year");
    }
}
