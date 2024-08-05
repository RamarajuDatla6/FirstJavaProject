package com.my.programs;

public class SwitchStatement {
    public static void main(String[]args){
        int myValue = 2;
        switch (myValue){
            case 1:
                System.out.println("Value 1");
                break;
            case 2: case 3: case 4:
                System.out.println("Value is 2 or 3 or 4");
                break;
            default:
                System.out.println("default value");
        }

        //using char
        char myCharValue = 'B';
        switch (myCharValue){
            case 'A':
                System.out.println("The value is A");
                break;
            case 'B':
                System.out.println("The value is B");
                break;
        }

        // using string
        String mystringvalue = "SunDAy";
        switch (mystringvalue.toLowerCase()){
            case "sunday":
                System.out.println("today is sunday");
                break;
            case "monday":
                System.out.println("You have to go to work");
        }
    }
}
