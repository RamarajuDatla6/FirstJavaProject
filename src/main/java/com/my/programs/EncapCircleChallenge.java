package com.my.programs;

public class EncapCircleChallenge {
    private double radius = 1;

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        EncapCircleChallenge circle = new EncapCircleChallenge();
        System.out.println("Radius is: "+circle.radius);
        System.out.println("Area of circle : "+circle.getArea());
    }
}
