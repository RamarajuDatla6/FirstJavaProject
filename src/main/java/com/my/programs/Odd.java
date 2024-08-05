package com.my.programs;

public class Odd {
    public static void main (String[]args){
        int start = 5;
        int end =30;

        while (start <= end){
            if (!oddNumber(start)){
                start ++;
                continue;
            }
            System.out.println("The odd number is : " + start);
            start ++;
        }
    }

    public static boolean oddNumber(int n){
        if ( n%2 == 1 )
            return true;
        return false;
    }
}
