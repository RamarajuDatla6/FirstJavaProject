package com.my.programs;

public class MainFloor {
    public static  void main(String[]a) {
        Floor floor;
        floor = new Floor(2,3);

        System.out.println("Floor width --> " +floor.getWidth());
        System.out.println("Floor length ---> " + floor.getLength());
        Carpet carpet = new Carpet(5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total cost ---> " + calculator.getTotalCost());
    }
}
