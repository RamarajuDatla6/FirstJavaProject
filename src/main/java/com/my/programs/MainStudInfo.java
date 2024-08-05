package com.my.programs;

public class MainStudInfo {
    public static void main(String[] args) {
        StudInfo child1 = new StudInfo();
        StudInfo child2 = new StudInfo("Ajay", 5);
        StudInfo child3 = new StudInfo("Bhavani Prasad", 6, "7", "A");

        System.out.println(child2.getStandard());
        System.out.println(child1.getName());
        System.out.println(child3.getRollNo());
    }

}
