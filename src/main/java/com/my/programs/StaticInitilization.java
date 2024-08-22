package com.my.programs;

public class StaticInitilization {
    public static final String name;

    static {
        name = "RamaRaju";
        System.out.println("First static initilization is done");
    }

    public StaticInitilization(){
        System.out.println("Constructor is called");
    }

    public void myMethod1(){
        System.out.println("Method 1 is called");
    }

    static {
        System.out.println("Second static initilization is done");
    }

    public void myMethod2(){
        System.out.println("Method 2 is called");
    }

    static {
        System.out.println("Third static initilization is called");
    }
}
