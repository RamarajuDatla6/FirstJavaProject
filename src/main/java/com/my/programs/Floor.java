package com.my.programs;

public class Floor {
    double width;
    double length;

    public Floor(double width,double length){
        if (width < 0){
            width =0;
        }

        if (length < 0){
            length =0;
        }
        setWidth(width);
        setLength(length);
    }

    public double getArea(){
        return this.getWidth() * this.getLength();
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
