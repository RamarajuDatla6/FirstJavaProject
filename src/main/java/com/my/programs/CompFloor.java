package com.my.programs;

public class CompFloor {
    int floorNo;
    double floorCapacity;

    public CompFloor(int floorNo, double floorCapacity) {
        this.floorNo = floorNo;
        this.floorCapacity = floorCapacity;
    }

    public int getFloorNo(){
        return floorNo;
    }

    public double getFloorCapacity(){
        return  floorCapacity;
    }

    public void cleanThefloor(){
        System.out.println("Cleaning Process Initiated");
    }
}
