package com.my.programs;

public class MainStaticInitlization {
    public static void main(String[] args) {
        System.out.println("Main method called");
        StaticInitilization stat = new StaticInitilization();
        stat.myMethod1();
        stat.myMethod1();
    }
}
