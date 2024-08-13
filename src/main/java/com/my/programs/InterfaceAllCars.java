package com.my.programs;

public class InterfaceAllCars {
    public static void main(String[] args) {
        InterfaceCar myCar;

        myCar = new InterfaceCarAudi("2020",true);
        myCar.engineOnOff();

        myCar = new InterfaceCarBenz("2021",false);
        myCar.engineOnOff();
    }
}


