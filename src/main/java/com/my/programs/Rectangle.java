//1.Write a class with the name Rectangle The class needs two fields (instance variable) with names length and width of type double.
//The class needs to have one constructor with parameters length and width of type double and it needs to initialize the fields.
//In case the length parameter is less than 0 it needs to set the length field value to 0.
// Similarly if width parameter is less than 0 it needs to set the width field value to 0.

//Write the following methods (instance methods):
//Method named getLength without any parameters, it needs to return the value of length field.
//Method named getWidth without any parameters, it needs to return the value of width field.
//Method named getArea without any parameters, it needs to return the calculated area (length*width).

//2.Write a class with the name Cuboid that extends Rectangle class.
// The class needs two field (instance variables) with name height of type double and rectangle of type Rectangle.
//The class needs to have one constructor with two parameters: rectangle of type Rectangle and height of type double.
// In case the height parameter is less than 0 it needs to set the height field value to 0.

//Write the following methods (instance methods):
//Method named getHeight without any parameters, it needs to return the value of height field.
//Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume, multiply the area with height.

package com.my.programs;

public class Rectangle {
    public double length;
    public double width;

    Rectangle(){

    }

    Rectangle(double length,double width){
        if( length < 0){
            length = 0;
        }

        if (width < 0){
            width = 0;
        }

        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }
}
