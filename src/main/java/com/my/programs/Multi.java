package com.my.programs;

public class Multi {
    public static void multiTable(int i ){
        int j = 7 * i;
        System.out.println(j);
    }

    public static void main (String[] args){
        for ( int i = 1;i <= 10;i++){
            multiTable(i);
        }
    }
}