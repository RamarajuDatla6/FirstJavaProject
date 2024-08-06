package com.my.programs;

public class StaticVsInstanceMethods {
    public static void print(){
        System.out.println("This is a static method");
    }

    public void display(){
        System.out.println("This is a non static method");
    }

    public static void main (String[]args){
        print();
        StaticVsInstanceMethods dis = new StaticVsInstanceMethods();
        dis.display();
    }
}
