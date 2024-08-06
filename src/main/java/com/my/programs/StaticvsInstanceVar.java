package com.my.programs;

public class StaticvsInstanceVar {
    public static String name;

    public StaticvsInstanceVar(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("The name is "+name);
    }

    public static void main (String[]args){
        StaticvsInstanceVar name1 = new StaticvsInstanceVar("Manish");
        name1.print();
        StaticvsInstanceVar name2 = new StaticvsInstanceVar("Vijay");
        name2.print();
        name1.print();
    }
}
