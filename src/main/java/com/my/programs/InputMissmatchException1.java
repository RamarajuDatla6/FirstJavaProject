package com.my.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchException1 {
    public static void main(String[] args) {
        System.out.println(getIntLBYL());
        System.out.println(getIntEAFP());
    }


    private static int getInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    private static int getIntLBYL(){
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        System.out.println("Please enter int value");
        String input = sc.next();

        for (int i = 0;i < input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                valid = false;
                break;
            }
        }

        if (valid){
            return Integer.parseInt(input);
        }
        else return 0;
    }

    private static int getIntEAFP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int value");
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }
}
