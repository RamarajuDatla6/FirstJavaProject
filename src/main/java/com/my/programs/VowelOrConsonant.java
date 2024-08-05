package com.my.programs;

public class VowelOrConsonant {
    public static void main(String[]args){
        char vowelOrNot = 'z';
        switch (Character.toLowerCase(vowelOrNot)){
            case 'e':
                System.out.println("It is a vowel");
            case 'a':
                System.out.println("It is a vowel");
            case 'i':
                System.out.println("It is a vowel");
            case 'o':
                System.out.println("it is a vowel");
            case 'u':
                System.out.println("it is a vowel");
            default:
                System.out.println("It is a consonant");
        }

    }
}
