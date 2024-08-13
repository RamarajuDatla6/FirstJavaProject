package com.my.programs;

public class InterfaceCarBenz implements InterfaceCar {
    private String yearOfBuild;
    private boolean engineOnOrOff;


    public InterfaceCarBenz(String yearOfBuild, boolean engineOnOrOff) {
        this.yearOfBuild = yearOfBuild;
        this.engineOnOrOff = engineOnOrOff;
    }

    @Override
    public void noOfWheels() {

    }

    @Override
    public void engineOnOff() {
        if (engineOnOrOff == true ) {
            System.out.println("The engine is now on for Benz");
        }else
            System.out.println("The engine is now off for Benz");
    }

    @Override
    public void seatQuality() {

    }

    @Override
    public void steeringWheel() {

    }

    @Override
    public void fuelCapacity() {

    }
}
