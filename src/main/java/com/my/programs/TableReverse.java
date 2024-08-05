package com.my.programs;

public class TableReverse {
    public static void mulReverse(int i){
        int j = 8 * i;
        System.out.println(j);
    }

    public static void main (String[]args){
        for(int i = 10;i >= 1;i--){
            mulReverse(i);
        }
    }
}
