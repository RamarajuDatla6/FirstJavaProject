// Write a method called printNumberInWord. The method has one parameter number which is the whole number.
// The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
// or other for any other number including negative numbers.
// You can use if-else statement or switch statement whatever is easier for you.


package com.my.programs;

import java.util.Scanner;

public class NumberInWords {
    public static void printNumberInWorld(int num){
        switch (num){
            case 1:
                System.out.println("ONE");
                break;
            case 2 :
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9 :
                System.out.println("NINE");
                break;
            default :
                System.out.println("OTHER");
                break;
        }
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNumberInWorld(num);
    }
}
