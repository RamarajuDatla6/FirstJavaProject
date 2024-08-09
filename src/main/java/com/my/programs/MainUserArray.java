package com.my.programs;

import java.util.Scanner;

public class MainUserArray {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] userArray = getUserArray(6);

        int userSum = Usersum(userArray);

        System.out.println("The sum is "+userSum);

//        int sum = 0;
//
//        for (int i = 0; i < userArray.length;i++){
//            //System.out.println(userArray[i]);
//             sum = sum + userArray[i];
//        }
//        System.out.println("The sum is : "+sum);
    }


    public static int[] getUserArray(int number){
        System.out.println("Enter "+number+" integers ");

        int[] userValues = new int[number];

        for (int i = 0; i < userValues.length;i++){
            userValues[i] = sc.nextInt();
        }
        return userValues;
    }


    public static int Usersum(int[] array){

        int sum = 0;
        for (int i = 0; i < array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    }
}
