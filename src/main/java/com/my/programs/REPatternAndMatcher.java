package com.my.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REPatternAndMatcher {
    public static void main(String[] args) {

        //Pattern p = Pattern.compile("[0-9]");
        Pattern p = Pattern.compile("a+");
        Matcher m = p.matcher("abdaa9@%#5a");

        while (m.find()){
            System.out.println(m.start()+"----"+m.group());
        }



//        String str = "This is Manish";
//        String patternStr = ".*manish.*";
//        Pattern pt = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
//        Matcher match = pt.matcher(str);
//        boolean isMatch = match.matches();
//        System.out.println(isMatch);


    }
}
