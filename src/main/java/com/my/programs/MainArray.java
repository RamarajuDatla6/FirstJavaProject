package com.my.programs;

public class MainArray {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myArray[0]);
        System.out.println(myArray[9]);

        for (int i = 0; i < myArray.length;i++){
            System.out.println("My element "+i+" is : "+myArray[i] );

        }
    }
}
