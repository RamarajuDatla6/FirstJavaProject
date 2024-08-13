package com.my.programs;

public class InterfaceCarAudi implements InterfaceCar {

    private String yearOfBuild;
    private boolean engineOnOrOff;

    public InterfaceCarAudi() {
        super();
    }

    public InterfaceCarAudi(String yearOfBuild, boolean engineOnOrOff) {
        this.yearOfBuild = yearOfBuild;
        this.engineOnOrOff = engineOnOrOff;
    }

    @Override
    public void noOfWheels() {

    }

    @Override
    public void engineOnOff() {
        if (engineOnOrOff == true ){
            System.out.println("The engine is now on for Audi");
        }else
            System.out.println("The engine is off for Audi");
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
