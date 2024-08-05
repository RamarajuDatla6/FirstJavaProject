package com.my.programs;

public class ParsingValuesFromAString {
    public static void main (String[]args){
        String myValue = "2500";
        myValue = myValue + 1;
        System.out.println(myValue);

        int myIntValue = Integer.parseInt(myValue);
        myIntValue  = myIntValue + 1;
        System.out.println(myIntValue);
    }
}
