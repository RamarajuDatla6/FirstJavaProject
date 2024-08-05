//Write a method named hasSameLastDigit with three parameters of type int.
//Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
//If one of the numbers is not within the range, the method should return false.
//The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


//EXAMPLE INPUT/OUTPUT:
//hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000


package com.my.programs;

public class LastDigitChecker {
    public static void main(String[]args){
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int a , int b, int c){
        if((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)){
            return ( (a%10 == b%10) || (b%10 == c%10) || (c%10 == a%10));
        }
        return false;
    }
}
