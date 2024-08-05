// Squares of numbers from 1 to 10

package com.my.programs;

public class Squares {
    public static void squareCal(int i){
        int j = i * i;
        System.out.println(" The square of "+i+" is "+j);
    }

    public static void main (String [] args){
        for (int i = 1;i <= 10;i++){
            squareCal(i);
        }
    }
}
