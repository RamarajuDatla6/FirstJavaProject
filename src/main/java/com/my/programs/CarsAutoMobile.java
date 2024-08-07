package com.my.programs;

public class CarsAutoMobile extends Autoobile {
    private  String steeringWheel;
    private  String moonRoof;
    private String batterySize;
    private String headLamps;
    private String groundClearance;

    public CarsAutoMobile(double topSpeed,String brandName,double durability,
                          String steeringWheel,String moonRoof,String batterySize,String headLamps,String groundClearance){
        super(topSpeed,brandName,"2018",100000,durability);
        steeringWheel = steeringWheel;
        moonRoof = moonRoof;
        batterySize = batterySize;
        headLamps = headLamps;
        groundClearance = groundClearance;
    }

}
