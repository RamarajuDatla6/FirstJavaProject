
//Declare a variable n which will store the digit, whose table we need to print. Declare two more variables i and table.
//I will be our iterator, and table will store the calculated output. Which we need to print.

package com.my.programs;

public class WhileLoopChallenge {
    public static void main (String[]args){
        int n = 8,i = 1,table;

        while (i <= 10){
            table = n * i;
            System.out.println(n + " * "+i + " = "+ table);
            i++;
        }
    }
}
