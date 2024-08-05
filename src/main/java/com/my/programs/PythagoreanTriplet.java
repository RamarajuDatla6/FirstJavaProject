package com.my.programs;

//Write a program to accept three number and check whether they are pythagorean triplet or not.

import java.util.Scanner;

public class PythagoreanTriplet{
    public static void triplets(int a,int b,int c){
        int p = a*a;
        int q = b*b;
        int r = c*c;

        if(p+q == r){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        triplets(a,b,c);
    }
}
