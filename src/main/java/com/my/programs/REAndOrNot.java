package com.my.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REAndOrNot {
    public static void main(String[] args) {

        String str = "harry";
        System.out.println(str.replaceAll("[h|H]arry]","larry"));


        String tvTest = "tstvtkt";
        String tNotV = "t(?!v)";
        Pattern p1 = Pattern.compile(tNotV);
        Matcher m1 = p1.matcher(tvTest);


        int count = 0;
        while(m1.find(count)) {
            count++;
            System.out.println("Occurances " + count + " : " + m1.start() + " to " + m1.end());

        }


        System.out.println();


//        String tvTest2 = "tstvtkt";
//        String tNotV2 = "t(v)";
//        Pattern p2 = Pattern.compile(tNotV);
//        Matcher m2 = p2.matcher(tvTest);
//
//
//        int count2 = 0;
//        while(m2.find(count2)){
//            count2++;
//            System.out.println("Occurances " + count2 + " : " + m2.start()+" to "+m2.end());
//        }



    }
}
