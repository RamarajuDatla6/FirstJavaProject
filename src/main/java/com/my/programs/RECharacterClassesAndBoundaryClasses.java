package com.my.programs;

import java.util.regex.Pattern;

public class RECharacterClassesAndBoundaryClasses {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[Aa]jay","ajay"));

        System.out.println(Pattern.matches("[pqr]","pq"));
        System.out.println(Pattern.matches("[pqr]","abc"));
        System.out.println(Pattern.matches("[pqr]","p"));
        System.out.println(Pattern.matches("[pqr][pqr]","pq"));

        System.out.println(Pattern.matches("[^pqr][^pqr]","ab"));
        System.out.println(Pattern.matches("[^pqr][pqr]","ap"));      // negation
        System.out.println(Pattern.matches("[^pqr]","b"));
        System.out.println(Pattern.matches("[^pqr]","p"));

        System.out.println(Pattern.matches("[a-zA-Z]","a"));
        System.out.println(Pattern.matches("[a-zA-Z]","1"));
        System.out.println(Pattern.matches("[a-zA-Z][a-zA-z]","bH"));
        System.out.println(Pattern.matches("[a-eS-Z]","T"));
        System.out.println(Pattern.matches("[a-eS-Z]","f"));


        System.out.println(Pattern.matches("[a-z&&a-e]","c"));
        System.out.println(Pattern.matches("[a-z&&[^d-z]]","f"));
        System.out.println(Pattern.matches("[a-z&&[^d-z]]","c"));


    }

}
