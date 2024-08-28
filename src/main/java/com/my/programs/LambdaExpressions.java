package com.my.programs;

interface Sayable{
    public void say (String name);
}
//public class LambdaExpressions implements Sayable{

public class LambdaExpressions{
//    @Override
//    public void say(String name) {
//
//    }

    public static void main(String[] args) {
        Sayable p = (name) -> {
            System.out.println(name);
        };

        p.say("Raju");
        p.say("Vijay");
        p.say("Ajay");

    }
}
