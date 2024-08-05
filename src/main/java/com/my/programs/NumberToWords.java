//Write a method called numberToWords with one int parameter named number.
//The method should print out the passed number using words for the digits.
//If the number is negative, print “Invalid Value”.

//Example Input/Output
//numberToWords(123)-> should print “One Two Three”.
//numberToWords(3456)-> should print “Three Four Five Six”.
//numberToWords(-7)-> should print “Invalid Value” since parameter is negative;

package com.my.programs;

public class NumberToWords {
    public static void main(String[]args){
        numberToWords(123);
    }

    public static void numberToWords(int number){
        if (number < 0)
            System.out.println("Invalid value");

        String convert = String.valueOf(number);
        for ( int i = 0;i < convert.length();i++){
            char digit = convert.charAt(i);

            switch (digit){
                case '0':
                    System.out.print("Zero");
                    break;

                case '1':
                    System.out.print("One");
                    break;

                case '2':
                    System.out.print("Two");
                    break;
                case '3':
                    System.out.print("Three");
                    break;

                case '4':
                    System.out.print("Four");
                    break;

                case '5':
                    System.out.print("Five");
                    break;

                case '6':
                    System.out.print("Six");
                    break;

                case '7':
                    System.out.print("Seven");
                    break;
                case '8':
                    System.out.print("Eight");
                    break;
                case '9':
                    System.out.print("Nine");
                    break;
                default:
                    System.out.print("unknown");
                    break;
            }
            System.out.print(' ');
        }

    }
}
