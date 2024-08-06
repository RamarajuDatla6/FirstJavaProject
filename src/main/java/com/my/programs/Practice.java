package com.my.programs;

public class Practice {
    public static String name;

    public Practice(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("The name is " + name);
    }

    public static void main(String[] args) {
        Practice manish = new Practice("Manish");
        manish.print();
        Practice atulya = new Practice("Atulya");
        atulya.print();
        manish.print();
    }
}

