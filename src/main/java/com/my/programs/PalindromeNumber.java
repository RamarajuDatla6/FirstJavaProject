// Create a function isPalindrome with one int parameter number and Check if the number is palindrome number or not.
// If it is palindrome return true, otherwise return false.

//For example
//isPalindrome(121)-> should return true
//isPalindrome(12343)-> should return false because the reverse is 34321 and it is not equal to 12343.

package com.my.programs;

public class PalindromeNumber {
    public static void main(String[]args){
        isPalindrome(121);
    }

    public static void isPalindrome(int n ){
        int reverse =0,temp = n;

        while (temp != 0 ){
            reverse = reverse * 10 + temp % 10;
            temp = temp /10;
        }

        if ( n == reverse)
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome number");
    }
}
