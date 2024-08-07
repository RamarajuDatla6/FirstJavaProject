package com.my.programs;


//Method named getHeight without any parameters, it needs to return the value of height field.
//Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.

public class Cylinder extends Circle{
    public double height;

    Cylinder(double height,double radius){
        super(radius);

        if (height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}
