//Declare two integer variables as length and breadth, and one double variable as height for storing the dimensions of the figures.
//Declare three double variables as sq_area, rect_area, and tri_area, for calculating the area of the three figures.
//Create three different methods as follows:
//area(int length) - for calculating the area of the square.
//area(int length, int breadth) - for calculating the area of the rectangle.
//area(int breadth, double height) - for calculating the area of the triangle.




package com.my.programs;

public class MethodOverloadingChallenge {
    public static void area(int length){
        double sq_area = length * length;
        System.out.println("area of square: "+sq_area);
    }

    public static void area(int lenght,int breadth){
        double rect_area = lenght * breadth;
        System.out.println("area of rectangle :"+rect_area);
    }

    public static void area(int breadth,double height){
        double tri_area = (breadth*height)/2;
        System.out.println("area of triangle :"+tri_area);
    }


    public static void main (String[]args){
        int length = 10;
        int breadth = 20;
        double height = 15.0;
        double sq_area,rect_area,tri_area;
        area(10);
        area(10,20);
        area(20,15.0);

    }
}
